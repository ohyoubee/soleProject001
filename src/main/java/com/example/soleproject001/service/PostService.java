package com.example.soleproject001.service;

import com.example.soleproject001.entity.Post;
import com.example.soleproject001.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getAll() {
        return postRepository.findAll();
    }
}
