package br.edu.infnet.apppagamento.model.repository;

import br.edu.infnet.apppagamento.model.domain.Conta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ContaRepository extends CrudRepository<Conta, Integer> {

    @Query("from Conta c where c.usuario.id = :idUsuario")
    Collection<Conta> findAll(Integer idUsuario);
}
