package com.example.soleproject001.controller;

import com.example.soleproject001.entity.Post;
import com.example.soleproject001.service.PostService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;


    @GetMapping("/post")
    public String postMain(Model model) {
        postService.getAll();
        {
            List<Post> postList = postService.getAll();
            model.addAttribute("postList", postList);
            return "/post/post";
        }
    }
}

