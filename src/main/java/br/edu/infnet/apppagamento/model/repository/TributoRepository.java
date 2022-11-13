package br.edu.infnet.apppagamento.model.repository;

import br.edu.infnet.apppagamento.model.domain.Tributo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TributoRepository extends CrudRepository<Tributo, Integer> {

    @Query("from Tributo t where t.usuario.id = :id")
    Collection<Tributo> findAll(Integer id);
}
