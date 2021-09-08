package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by edgar.ohanyan on Sep, 2021
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(length = 50)
    String title;
    @Column(length = 1000)
    String note;
    @Column
    Date createTime;
    @Column
    Date LastUpdateTime;

}
