//package com.sparta.gongguri.controller;
//
//
//import com.sparta.gongguri.dto.CommentRequestDto;
//import com.sparta.gongguri.dto.CommentResponseDto;
//import com.sparta.gongguri.model.Post;
//import com.sparta.gongguri.repository.CommentRepository;
//import com.sparta.gongguri.service.CommentService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class CommentController {
//
//    private final CommentService commentService;
//    private final CommentRepository commentRepository;
//
//
//
////    코멘트 작성 - 로그인 되어 있으면 작성가능, 아니면 안됨. void ->  boolean형으로 나중에 바꿔줘야함
//    @PostMapping("/api/comments/{postId}")
//    public void createComment(Long postId, @RequestBody CommentRequestDto commentRequestDto){
//
//        commentService.createComment(postId,commentRequestDto);
//    }
//
////                코멘트 조회
////    @GetMapping("/api/{postId}/comments")
////    public List<CommentResponseDto> getComments(@PathVariable Long postId){
////        return commentService.getComments(postId);
////    }
//
//}
