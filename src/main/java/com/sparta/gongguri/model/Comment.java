//package com.sparta.gongguri.model;
//
//
//import com.sparta.gongguri.dto.CommentRequestDto;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Getter
//@Setter
//@Entity
//@NoArgsConstructor
//public class Comment extends Timestamped   {
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    private Long commentId;
//
//    @Column(nullable = false)
//    private String comment;
//
//    @ManyToOne
//    @JoinColumn
//    private Post post;
//
//
//    public Comment(Post post, CommentRequestDto commentRequestDto) {
//        this.comment=commentRequestDto.getComment();
//        this.post = post;
//    }
//}
