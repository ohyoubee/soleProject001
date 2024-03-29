package com.example.soleproject001.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Table(name= "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userNum;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String userName;

}
