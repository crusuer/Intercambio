package br.com.hackatur.repository;

import br.com.hackatur.entity.Membro;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends CrudRepository<Membro, Long> {

  Optional<Membro> findByUsuario(String usuario);

  List<Membro> findByTipoAndHabilitado(String tipo, boolean habilitado);

}
