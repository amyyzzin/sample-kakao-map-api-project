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
public class FeedLike {

    @Id
    @GeneratedValue
    private Long feed_like_id;
    private Long feed_id;
    private Long user_id;

}
