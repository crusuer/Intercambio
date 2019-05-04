package br.com.hackatur.controller;

import br.com.hackatur.entity.Reserva;
import br.com.hackatur.service.ReservaServiceImpl;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaController {
  @Autowired
  ReservaServiceImpl reservaService;

  @GetMapping(value = "/reserva/read/{codigo}")
  public Optional<Reserva> read(@PathVariable("codigo") Long codigo) {
    return reservaService.findOne(codigo);
  }

  @GetMapping(value = "/reserva/readAll")
  public Iterable<Reserva> readAll() {
    return reservaService.findAll();
  }

  @PostMapping(value = "/reserva/create")
  public Reserva create(@Valid @RequestBody Reserva m) {
    return reservaService.create(m);
  }

  @PutMapping(value = "/reserva/update")
  public Reserva update(@Valid @RequestBody Reserva m) {
    return reservaService.update(m);
  }

  @DeleteMapping(value = "/reserva/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
    reservaService.delete(id);
  }
}
