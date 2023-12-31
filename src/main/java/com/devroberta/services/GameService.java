package com.devroberta.services;

import com.devroberta.dto.GameDTO;
import com.devroberta.dto.GameMinDTO;
import com.devroberta.exception.GameNotFound;
import com.devroberta.repositories.GameRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        var originList = gameRepository.findAll();
        var result = originList.stream().map(game -> new GameMinDTO(game)).toList();
        return result;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return new GameDTO(gameRepository.findById(id).orElseThrow(() -> new GameNotFound("Entity " + id + " not found")));
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        var originList = gameRepository.searchByList(listId);
        var result = originList.stream().map(game -> new GameMinDTO(game)).toList();
        return result;
    }

}
