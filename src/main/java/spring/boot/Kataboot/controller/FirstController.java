package spring.boot.Kataboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

	@GetMapping(value = "/")
	public String printWelcome() {
		return "index";
	}
}