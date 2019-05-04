package br.com.hackatur.service;

import br.com.hackatur.dao.ReservaDAO;
import br.com.hackatur.pojo.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {

  @Autowired
  ReservaDAO reservaDAO;

  @Override
  public Reserva create(Reserva m) {
    reservaDAO.save(m);
    return null;
  }
}
