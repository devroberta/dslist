package com.devroberta.dto;

import com.devroberta.entities.Game;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
