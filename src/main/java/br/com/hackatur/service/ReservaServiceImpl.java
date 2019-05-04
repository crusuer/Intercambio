package br.com.hackatur.service;

import br.com.hackatur.dao.ReservaDAO;
import br.com.hackatur.entity.Reserva;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {
  @Autowired
  ReservaDAO reservaDAO;

  @Override
  public Reserva create(Reserva m) {
    Optional<Reserva> first = reservaDAO.findById(m.getId().getCdReserva());
    if (!first.isPresent()) {
      return reservaDAO.save(m);
    }
    return null;
  }

  @Override
  public Optional<Reserva> findOne(Long codigo) {
    return reservaDAO.findById(codigo);
  }

  @Override
  public Iterable<Reserva> findAll() {
    return reservaDAO.findAll();
  }

  @Override
  public Reserva update(Reserva m) {
    return reservaDAO.save(m);
  }

  @Override
  public void delete(Long id) {
    reservaDAO.deleteById(id);
  }
}
