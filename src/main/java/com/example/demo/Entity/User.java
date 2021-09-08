package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(unique = true)
    String Email;
    @Column
    String password;
    @Column
    Date createTime;
    @Column
    Date LastUpdateTime;

    @OneToMany
    List<Note> noteList;
}
