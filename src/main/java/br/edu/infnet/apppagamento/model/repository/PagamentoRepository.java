package br.edu.infnet.apppagamento.model.repository;

import br.edu.infnet.apppagamento.model.domain.Pagamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PagamentoRepository extends CrudRepository<Pagamento, Integer> {
    @Query("from Pagamento p where p.usuario.id = :idUsuario")
    Collection<Pagamento> findAll(Integer idUsuario);
}
