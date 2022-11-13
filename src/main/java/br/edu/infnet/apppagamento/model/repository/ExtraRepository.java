package br.edu.infnet.apppagamento.model.repository;

import br.edu.infnet.apppagamento.model.domain.Extra;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ExtraRepository extends CrudRepository<Extra, Integer> {
    @Query("from Extra e where e.usuario.id = :id")
    Collection<Extra> findAll(Integer id);
}
