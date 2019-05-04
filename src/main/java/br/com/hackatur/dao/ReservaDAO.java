package br.com.hackatur.dao;

import br.com.hackatur.entity.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ReservaDAO extends CrudRepository<Reserva, Long> {

}
