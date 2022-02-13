package com.sparta.gongguri.dto;


import com.sparta.gongguri.model.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CommentRequestDto {

    private String comment;
}
