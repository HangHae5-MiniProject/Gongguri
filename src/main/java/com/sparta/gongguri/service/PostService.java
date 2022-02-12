package com.sparta.gongguri.service;

import com.sparta.gongguri.dto.PostRequestDto;
import com.sparta.gongguri.dto.PostResponseDto;
import com.sparta.gongguri.model.Post;
import com.sparta.gongguri.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;


//    게시글 작성
    @Transactional
    public void createPost(PostRequestDto postRequestDto) {
        Post post = new Post(postRequestDto);
        postRepository.save(post);
    }

//   전체 게시글 조회 -
    public List<PostResponseDto> getPosts() {
        List<Post> posts = postRepository.findAll() ;

        return PostResponseDto.listOf(posts);
    }


//  게시글 상세 페이지 조회
    public PostResponseDto getPost(Long postId) {

        Post post =postRepository.findById(postId).orElseThrow(
                ()->new IllegalArgumentException( " 게시글이 없습니다 ")
        );


        boolean result = true;
        String title = post.getTitle();
        String content =post.getContent();
        String imageurl = post.getImageUrl();
        String startAt = post.getStartAt();
        String endAt = post.getEndAt();
        int price = post.getPrice();
        int mininum = post.getMinimum();
        int buyercount =post.getBuyercount();







        return new PostResponseDto(postId,title,content,imageurl,startAt,endAt,price,mininum,buyercount);
    }

    //게시글 상세페이지 수정
    public void updatePost(Long postId, String title, String content) {
        Post post = postRepository.findById(postId).orElseThrow(
                ()-> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        post.update(title,content);
    }



}
