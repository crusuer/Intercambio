package br.com.hackatur.service;

import br.com.hackatur.entity.Reserva;
import java.util.Optional;

public interface ReservaService {

  Reserva create(Reserva m);

  Optional<Reserva> findOne(Long codigo);

  Iterable<Reserva> findAll();

  Reserva update(Reserva m);

  void delete(Long id);
}
