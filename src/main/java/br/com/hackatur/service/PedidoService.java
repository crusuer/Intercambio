package br.com.hackatur.service;

import br.com.hackatur.entity.Pedido;
import java.util.Optional;

public interface PedidoService {
  Pedido create(Pedido m);

  Optional<Pedido> findOne(Long codigo);

  Iterable<Pedido> findAll();

  Pedido update(Pedido m);

  void delete(Long id);
}
