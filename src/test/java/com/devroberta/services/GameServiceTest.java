package com.devroberta.services;

import com.devroberta.dto.GameMinDTO;
import com.devroberta.repositories.GameRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.webservices.client.WebServiceClientTest;

import java.util.List;

@WebServiceClientTest
public class GameServiceTest {
    
    private GameService gameService;
    private GameRepository gameRepository;

    @Test
    @DisplayName("Teste para listar todos os Games Cadastrados")
    public void listAll_ReturnsListOfAllGames_WhenSucessful(){
        GameMinDTO game = GameMinDTO.builder()
                .id(1L)
                .title("Mass Effect Trilogy")
                .year(2012)
                .imgUrl("https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png")
                .shortDescription("Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!")
                .build();
        List<GameMinDTO> list = List.of(game);
//
//        List<GameMinDTO> expect = gameService.findAll();
//
//        Assertions.assertNotNull(expect);

    }

    @Test
    public void findById_ReturnsGame_WhenSucessful(){

    }

    @Test
    public void findById_ReturnsException_WhenIdNotFound(){

    }

    @Test
    public void findByList_ReturnsListByGamesList_WhenSucessful(){

    }


}
