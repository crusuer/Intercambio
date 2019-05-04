package br.com.hackatur.controller;

import br.com.hackatur.entity.Pedido;
import br.com.hackatur.entity.TipoAnfitriao;
import br.com.hackatur.service.PedidoServiceImpl;
import br.com.hackatur.service.TipoAnfitriaoServiceImpl;
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
public class PedidoController {

  @Autowired
  PedidoServiceImpl pedidoService;

  @GetMapping(value = "/pedido/read/{codigo}")
  public Optional<Pedido> read(@PathVariable("codigo") Long codigo) {
    return pedidoService.findOne(codigo);
  }

  @GetMapping(value = "/pedido/readAll")
  public Iterable<Pedido> readAll() {
    return pedidoService.findAll();
  }

  @PostMapping(value = "/pedido/create")
  public Pedido create(@Valid @RequestBody Pedido m) {
    return pedidoService.create(m);
  }

  @PutMapping(value = "/pedido/update")
  public Pedido update(@Valid @RequestBody Pedido m) {
    return pedidoService.update(m);
  }

  @DeleteMapping(value = "/pedido/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
    pedidoService.delete(id);
  }
}
