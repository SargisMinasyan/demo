package com.example.demo.Controllers;

import com.example.demo.DAOs.NoteDAOImpl;
import com.example.demo.DAOs.UserDAOImpl;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@RestController
@RequestMapping("/creation")
public class CreationController {
    @Autowired
    NoteDAOImpl noteDAO ;
    @Autowired
    UserDAOImpl userDAO;
    @PostMapping("/createUser")
    public User createUser(@RequestParam("username")String username, @RequestParam("password") String password){
        User user = userDAO.createUser(username,password);
        return user;
    }
    @PostMapping("/createNote")
    public User createNote(@RequestParam("title")String title,@RequestParam("note")String note,@RequestParam("userId")Long userId){
        User user =noteDAO.saveNewNote(title,note,userId);
        return user;
    }

}
