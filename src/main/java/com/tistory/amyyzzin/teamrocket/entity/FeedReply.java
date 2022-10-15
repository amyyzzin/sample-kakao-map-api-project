package com.tistory.amyyzzin.teamrocket.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeedReply {

    @Id
    @GeneratedValue
    private Long feed_comment_id;
    private Long feed_id;
    private Long user_id;

    @Lob
    private String comment;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime deleted_at;

    private boolean deleted_yn;


}
