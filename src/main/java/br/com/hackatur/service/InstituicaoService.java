package br.com.hackatur.service;

import br.com.hackatur.entity.Instituicao;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface InstituicaoService {
  Instituicao create(Instituicao m);

  Optional<Instituicao> findOne(Long codigo);

  Iterable<Instituicao> findAll();

  Instituicao update(Instituicao m);

  void delete(Long id);
}
