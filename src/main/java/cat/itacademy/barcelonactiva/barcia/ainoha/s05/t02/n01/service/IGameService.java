package cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.service;

import cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.model.domain.Player;
import cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.model.dto.GameDto;

import java.util.List;

public interface IGameService {

    GameDto createGame(Player player);

    void deleteAllGames(Player player);

    List<GameDto> getAllGames(Player player);




}
