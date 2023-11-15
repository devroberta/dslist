package com.devroberta.services;

import com.devroberta.dto.GameDTO;
import com.devroberta.dto.GameMinDTO;
import com.devroberta.entities.Game;
import com.devroberta.repositories.GameRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var originList = gameRepository.findAll();
        var result = originList.stream().map(game -> new GameMinDTO(game)).toList();
        return result;
    }

    public GameDTO findById(Long id) {
        return new GameDTO(gameRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity " + id + " not found")));
    }
}
