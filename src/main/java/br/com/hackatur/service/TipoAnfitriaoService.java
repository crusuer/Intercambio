package br.com.hackatur.service;

import br.com.hackatur.entity.TipoAnfitriao;
import java.util.Optional;

public interface TipoAnfitriaoService {

  TipoAnfitriao create(TipoAnfitriao tipoAnfitriao);

  Optional<TipoAnfitriao> findOne(Long codigo);

  Iterable<TipoAnfitriao> findAll();

  TipoAnfitriao update(TipoAnfitriao m);

  void delete(Long id);
}
