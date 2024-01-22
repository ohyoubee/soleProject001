package com.example.soleproject001.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Table(name= "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postNum;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;


}
