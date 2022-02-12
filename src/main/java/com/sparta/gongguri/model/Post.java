package com.sparta.gongguri.model;


import com.sparta.gongguri.dto.PostRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long postId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column
    private String imageUrl;

    @Column
    private String startAt; // 글쓴날짜로 할것인지?

    @Column
    private String endAt; // 마감날짜 지정할지?

    @Column
    private int price;

    @Column
    private int minimum;

    @Column
    private int buyercount;

//    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
//    private List<Comment> commentList = new ArrayList<>();



//    @ManyToOne
//    @JoinColumn(name = u_id,nullable = false)
//    private User user;



//    public Post(String title ,String content,String imageUrl,String startAt,String endAt,int minimum,int price,int sponsor ) {
//        this.content =content;
//        this.imageUrl=imageUrl;
//        this.title=title;
//        this.startAt=startAt;
//        this.endAt=endAt;
//        this.price=price;
//        this.minimum=minimum;
//    }

    public Post(PostRequestDto postRequestDto) {
        this.content =postRequestDto.getContent();
        this.imageUrl=postRequestDto.getImageUrl();
        this.title=postRequestDto.getTitle();
        this.startAt=postRequestDto.getStartAt();
        this.endAt=postRequestDto.getStartAt();
        this.price=postRequestDto.getPrice();
        this.minimum=postRequestDto.getMinimum();
    }


    public void update(String title, String content) {
        this.title =title;
        this.content = content;

    }
}
