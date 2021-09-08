package com.example.demo.Controllers;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@RestController
public class LoadingController {
    @GetMapping("/getNotes")
    public Integer getNotes(@RequestParam Long useraname){

        return 1;
    }
}
