package br.edu.infnet.apppagamento.model.repository;

import br.edu.infnet.apppagamento.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Usuario findByEmail(String email);

}
