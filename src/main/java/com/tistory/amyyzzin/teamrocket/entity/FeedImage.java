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
public class FeedImage {

    @Id
    @GeneratedValue
    private Long feed_image_id;
    private Long feed_id;

    private String image_path;

}
