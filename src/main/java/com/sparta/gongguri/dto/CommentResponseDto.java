package com.sparta.gongguri.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class CommentResponseDto {

    private Long commentId;
    private String comment;
    private LocalDateTime createDate;


    public CommentResponseDto(Long commentId, String comment) {

        this.commentId = commentId;
        this.comment= comment;
    }
}
