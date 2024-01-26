package com.example.soleproject001.controller;

import com.example.soleproject001.dto.PostDTO;
import com.example.soleproject001.entity.Post;
import com.example.soleproject001.service.PostService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/postCreate")
    public String postCreate(Model model){
        model.addAttribute("postCreate",new Post());
        return "/post/postCreate";
    }
    @PostMapping("/postCreate")
    public String postCreate(@ModelAttribute PostDTO postDTO){
        postService.postCreate(postDTO);
        return "redirect:/post" ;
    }
    @GetMapping("/postView/{postNum}")
    public String postView(@PathVariable("postNum") Integer postNum, Model model) {
        // postNum에 해당하는 포스트 정보를 찾습니다.
        Optional<Post> postOptional = postService.findById(postNum);

        // 포스트가 존재하면 모델에 추가하여 postView.html로 전달합니다.
        postOptional.ifPresent(post -> model.addAttribute("post", post));

        return "/post/postView";
    }

}

