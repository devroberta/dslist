package com.devroberta.controllers;

import com.devroberta.dto.GameMinDTO;
import com.devroberta.entities.Game;
import com.devroberta.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    private ResponseEntity<List<GameMinDTO>> findAll() {
        return ResponseEntity.ok().body(gameService.findAll());
    }
}
