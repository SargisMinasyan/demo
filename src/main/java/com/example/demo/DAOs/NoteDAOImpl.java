package com.example.demo.DAOs;

import com.example.demo.Entity.Note;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@Component
public class NoteDAOImpl {
    @Autowired
    NoteDAO noteDAO;
    @Autowired
    UserDAO userDAO;

    public User saveNewNote(String title,String note,Long userId){
        User user =userDAO.findById(userId).get() ;
        List<Note> noteList = user.getNoteList();
        Note note1 = new Note();
        note1.setTitle(title);
        note1.setNote(note);
        note1.setCreateTime(new Date());
        noteList.add(note1);
        user.setNoteList(noteList);
        noteDAO.save(note1);
        userDAO.save(user);
        return user;
    }
}
