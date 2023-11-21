package com.devroberta.controllers;

import com.devroberta.dto.GameDTO;
import com.devroberta.dto.GameListDTO;
import com.devroberta.dto.GameMinDTO;
import com.devroberta.entities.Game;
import com.devroberta.services.GameListService;
import com.devroberta.services.GameService;
import com.devroberta.stubs.GameCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class GameListControllerTest {

    @InjectMocks
    private GameListController gameListController;

    @Mock
    private GameListService gameListService;

    @Mock
    private GameService gameService;

    @BeforeEach
    void setUp() {
        List<GameListDTO> gameListDTOList = new ArrayList<>(List.of(GameCreator.createGameListDTO()));
        List<GameMinDTO> gameMinDTOList = new ArrayList<>(List.of(GameCreator.createGameMinDTO()));
        when(gameListService.findAll()).thenReturn(gameListDTOList);
        when(gameService.findByList(anyLong())).thenReturn(gameMinDTOList);
    }

    @Test
    void findAllTest(){
        String expectName = GameCreator.createGameListDTO().getName();

        List<GameListDTO> list = gameListController.findAll().getBody();

        when(gameListService.findAll()).thenReturn(list);

        assertNotNull(list);
        assertEquals(expectName, list.get(0).getName());
    }

    @Test
    void findByListTest(){
        String expectTitle = GameCreator.createGameMinDTO().getTitle();

        List<GameMinDTO> list = gameListController.findByList(1L).getBody();

        assertEquals(expectTitle, list.get(0).getTitle());

    }
}
