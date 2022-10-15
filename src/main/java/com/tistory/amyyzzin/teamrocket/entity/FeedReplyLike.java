package com.tistory.amyyzzin.teamrocket.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeedReplyLike {

    @Id
    @GeneratedValue
    private Long feed_comment_like_id;
    private Long feed_comment_id;
    private Long user_id;

}
