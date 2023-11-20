package com.devroberta.dto;

import com.devroberta.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

}
