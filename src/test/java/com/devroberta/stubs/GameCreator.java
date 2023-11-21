package com.devroberta.stubs;

import com.devroberta.dto.GameDTO;
import com.devroberta.dto.GameListDTO;
import com.devroberta.dto.GameMinDTO;
import com.devroberta.entities.Game;

public class GameCreator {

    public static GameMinDTO createGameMinDTO(){
        return GameMinDTO.builder()
                .id(1L)
                .title("Mass Effect Trilogy")
                .year(2012)
                .imgUrl("https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png")
                .shortDescription("Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!")
                .build();
    }

    public static GameDTO createGameDTO(){
        return GameDTO.builder()
                .id(1L)
                .title("Mass Effect Trilogy")
                .year(2012)
                .genre("Role-playing (RPG), Shooter")
                .platforms("XBox, Playstation, PC")
                .score(4.8)
                .imgUrl("https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png")
                .shortDescription("Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!")
                .longDescription("Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!")
                .build();
    }

    public static GameListDTO createGameListDTO(){
        return GameListDTO.builder()
                .id(1L)
                .name("Aventura e RPG")
                .build();
    }
}
