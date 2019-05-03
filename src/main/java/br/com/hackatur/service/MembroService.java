package br.com.hackatur.service;

import br.com.hackatur.entity.Membro;
import java.util.Optional;

public interface MembroService {

  Membro create(Membro m);

  Optional<Membro> findOne(String usuario);

  Iterable<Membro> findAll();

  Membro update(Membro m);

  void delete(Long id);

}
