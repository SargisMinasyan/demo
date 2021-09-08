package com.example.demo.DAOs;

import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@Component
public class UserDAOImpl {
    @Autowired
    UserDAO userDAO;

    public User createUser(String email,String password){
        User u = new User();
        u.setPassword(password);
        u.setEmail(email);
        u.setCreateTime(new Date());
        u.setLastUpdateTime(new Date());
        userDAO.save(u);
        return u;
    }

}
