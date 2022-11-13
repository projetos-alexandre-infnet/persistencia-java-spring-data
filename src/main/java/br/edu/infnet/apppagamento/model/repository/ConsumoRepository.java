package br.edu.infnet.apppagamento.model.repository;

import br.edu.infnet.apppagamento.model.domain.Consumo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ConsumoRepository extends CrudRepository<Consumo, Integer> {

    @Query("from Consumo c where c.usuario.id = :id")
    Collection<Consumo> findAll(Integer id);
}
