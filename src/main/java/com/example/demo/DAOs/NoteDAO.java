package com.example.demo.DAOs;

import com.example.demo.Entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@Repository
public interface NoteDAO extends CrudRepository<Note,Long> {

}
