package cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.repository;

import cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.model.domain.Game;
import cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.model.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IGameRepositori extends JpaRepository<Game,Long> {
    List<Game> findByPlayer(Player player);
}
