package com.example.soleproject001.repository;

import com.example.soleproject001.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
