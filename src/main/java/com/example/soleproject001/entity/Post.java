package com.example.soleproject001.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Table(name= "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postNum;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private LocalDate createTime;


}
