package spring.boot.Kataboot.model;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    private String name;
    private int age;
    private String lastname;

    public User() {}
}
