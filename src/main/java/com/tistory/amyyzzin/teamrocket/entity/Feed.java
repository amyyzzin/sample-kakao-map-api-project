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
public class Feed {

    @Id
    @GeneratedValue
    private Long feed_id;
    private Long user_id;

    private String title;

    @Lob
    private String content;

    private String rCate1;
    private String rCate2;
    private String rCate3;
    private String rCate4;

    private String longitude;
    private String latitude;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime deleted_at;

    private boolean deleted_yn;


}
