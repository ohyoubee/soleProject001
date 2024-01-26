package com.example.soleproject001.service;

import com.example.soleproject001.dto.PostDTO;
import com.example.soleproject001.entity.Post;
import com.example.soleproject001.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getAll() {
        return postRepository.findAll();
    }
    public PostDTO postCreate(PostDTO postDTO) {
        Post post = new Post();

        post.setPostNum(postDTO.getPostNum());
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());
        post.setCreateTime(postDTO.getCreateTime());
        // 현재 날짜와 시간을 얻기
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = now.format(formatter);
        // String으로 변환한 값을 LocalDateTime으로 변경
        LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatter);
        // post의 joinDate에 설정
        post.setCreateTime(LocalDate.from(parsedDateTime));
        // DB에 저장
        postRepository.save(post);

        // Post 엔터티를 PostDTO로 변환하여 반환
        return postDTO;
    }
//    PostNum을 찾는 메서드
    public Optional<Post> findById(Integer postNum){
        postRepository.findById(postNum);
        return postRepository.findById(postNum);
    }
}
