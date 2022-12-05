package spring.boot.Kataboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.boot.Kataboot.model.User;
import spring.boot.Kataboot.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/show")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "show";
    }

    @GetMapping(value = "/add")
    public String addUser (Model model) {
        model.addAttribute("user", new User());
        return "/add";
    }

    @PostMapping()
    public String saveNewUser(@ModelAttribute ("user") User user) {
        userService.add(user);
        return "redirect:/show";
    }

    @GetMapping("/{id}/update")
    public String getUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.get(id));
        return "/update";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userService.update(id, user);
        return "redirect:/show";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.remove(id);
        return "redirect:/show";
    }
}
