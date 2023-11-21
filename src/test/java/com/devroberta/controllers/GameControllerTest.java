package com.devroberta.controllers;

import com.devroberta.dto.GameDTO;
import com.devroberta.dto.GameMinDTO;
import com.devroberta.services.GameService;
import com.devroberta.stubs.GameCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class GameControllerTest {

    @InjectMocks
    private GameController gameController;

    @Mock
    private GameService gameService;

    @BeforeEach
    void setUp(){
        List<GameMinDTO> listAllGames = new ArrayList<>(List.of(GameCreator.createGameMinDTO()));
        GameDTO gameDTO = GameCreator.createGameDTO();
        when(gameService.findAll()).thenReturn(listAllGames);
        when(gameService.findById(anyLong())).thenReturn(gameDTO);
    }

    @Test
    @DisplayName("Lista todos os games cadastrados.")
    void findAllTest(){
        String expectedTitle = GameCreator.createGameMinDTO().getTitle();

        List<GameMinDTO> listGames = gameController.findAll().getBody();

        assertNotNull(listGames);
        assertEquals(expectedTitle, listGames.get(0).getTitle());
    }

    @Test
    @DisplayName("Lista todos os games cadastrados.")
    void findByIdTest(){
        String expectedTitle = GameCreator.createGameDTO().getTitle();
        Integer expectedYear = GameCreator.createGameDTO().getYear();

        GameDTO game = gameController.findById(1L).getBody();

        assertNotNull(game);
        assertEquals(expectedTitle, game.getTitle());
        assertEquals(expectedYear, game.getYear());
    }
}
