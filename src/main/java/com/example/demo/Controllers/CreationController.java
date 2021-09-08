package com.example.demo.Controllers;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@RestController("/creation")
public class CreationController {
    @PostMapping("/createUser")
    public Integer createUser(@Param("username")String username, @Param("password") String password){

        return 1;
    }
    @PostMapping("/createNote")
    public Integer createNote(@Param("username")String username, @Param("password") String password){

        return 1;
    }

}
