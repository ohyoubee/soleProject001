package com.example.soleproject001.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class PostDTO {
    private Integer postNum;
    private String title;
    private String content;
    private LocalDate createTime;
}
