package com.demo.jpamysql;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String User() {
      return "Spring JPA Sample [localhost:8080/demo/all, localhost:8080/demo/add]";
      // test
    }
}