package com.sparta.gongguri.service;


import com.sparta.gongguri.dto.CommentRequestDto;
import com.sparta.gongguri.dto.CommentResponseDto;
import com.sparta.gongguri.model.Comment;
import com.sparta.gongguri.model.Post;
import com.sparta.gongguri.repository.CommentRepository;
import com.sparta.gongguri.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    //코멘트 저장
    public void save(Long postId, CommentRequestDto commentRequestDto){

        Post post = postRepository.findById(postId).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        Comment comment = new Comment(post, commentRequestDto);
        System.out.println(comment);

        commentRepository.save(comment);
    }
    //코멘트 조회
    public List<CommentResponseDto> getComments(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                ()-> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        List<Comment> commentList = commentRepository.findAllByPost(postId);
        List<CommentResponseDto> comments =new ArrayList<>();
        for (Comment comment1 : commentList){
            Long commentId = comment1.getCommentId();
            String comment = comment1.getComment();

            CommentResponseDto commentResponseDto = new CommentResponseDto(commentId,comment);
            comments.add(commentResponseDto);
        }

            return comments;

    }

}
