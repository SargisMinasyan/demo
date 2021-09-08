package com.example.demo.Controllers;

import com.example.demo.DAOs.NoteDAOImpl;
import com.example.demo.DAOs.UserDAOImpl;
import com.example.demo.Entity.Note;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@RestController
@RequestMapping("/edition")
@Validated
public class EditionController {
    @Autowired
    NoteDAOImpl noteDAO ;
    @Autowired
    UserDAOImpl userDAO;
    @PostMapping("/editeNoteById")
    public Note createUser(@RequestParam("id")Long id,
                           @RequestParam("title") @NotBlank @Size(max = 10) String title,
                           @RequestParam("note")@NotBlank @Size(max = 10)  String note){
        Note res = noteDAO.editeNote(id,title,note);
        return res;
    }
    @PostMapping("/createNote")
    public User createNote(@RequestParam("title")String title,@RequestParam("note")String note,@RequestParam("userId")Long userId){
        User user =noteDAO.saveNewNote(title,note,userId);
        return user;
    }
}
