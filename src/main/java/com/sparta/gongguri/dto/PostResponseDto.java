package com.sparta.gongguri.dto;


import com.sparta.gongguri.model.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class PostResponseDto {
    private Long postId;
    private String title;
    private String content;
    private String imageUrl;
    private String startAt;
    private String endAt;
    private int price;
    private int minimum;
    private int buyer;


    public static List<PostResponseDto> listOf(List<Post> posts) {

        List<PostResponseDto> postResponseDtos = new ArrayList<>();

        for (Post post : posts){
            PostResponseDto postResponseDto = new PostResponseDto(
                    post.getPostId(),
                    post.getTitle(),
                    post.getContent(),
                    post.getImageUrl(),
                    post.getStartAt(),
                    post.getEndAt(),
                    post.getPrice(),
                    post.getMinimum(),
                    post.getBuyercount()

            );
            postResponseDtos.add(postResponseDto);

        }
        return postResponseDtos;
    }
}
