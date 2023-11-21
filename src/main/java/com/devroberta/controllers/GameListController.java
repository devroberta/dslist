package com.devroberta.controllers;

import com.devroberta.dto.GameListDTO;
import com.devroberta.dto.GameMinDTO;
import com.devroberta.dto.ReplacementDTO;
import com.devroberta.services.GameListService;
import com.devroberta.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        return ResponseEntity.ok().body(gameListService.findAll());
    }

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findByList(@PathVariable Long listId) {
        return ResponseEntity.ok().body(gameService.findByList(listId));
    }

    @PostMapping(value = "/{listId}/replacement")
    public ResponseEntity<Void> move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
        return ResponseEntity.ok().build();
    }
}
