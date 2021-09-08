package com.example.demo.DAOs;

import com.example.demo.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@Repository
public interface UserDAO extends CrudRepository<User,Long> {
}
