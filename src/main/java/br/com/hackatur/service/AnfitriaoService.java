package br.com.hackatur.service;

import br.com.hackatur.entity.Anfitriao;
import java.util.Optional;

public interface AnfitriaoService {

  Anfitriao create(Anfitriao anfitriao);

  Optional<Anfitriao> findOne(Long codigo);

  Iterable<Anfitriao> findAll();

  Anfitriao update(Anfitriao m);

  void delete(Long id);
}
