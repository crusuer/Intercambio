package br.com.hackatur.service;

import br.com.hackatur.entity.Atividade;
import java.util.Optional;

public interface AtividadeService {

  Atividade create(Atividade m);

  Optional<Atividade> findOne(Long codigo);

  Iterable<Atividade> findAll();

  Atividade update(Atividade m);

  void delete(Long id);
}
