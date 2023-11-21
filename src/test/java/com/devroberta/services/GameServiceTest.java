package com.devroberta.services;

import com.devroberta.dto.GameMinDTO;
import com.devroberta.repositories.GameRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.webservices.client.WebServiceClientTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
public class GameServiceTest {

    @InjectMocks
    private GameService gameService;

    @Mock
    private GameRepository gameRepository;

    @Test
    @DisplayName("Teste para listar todos os Games Cadastrados")
    public void listAll_ReturnsListOfAllGames_WhenSucessful(){


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
