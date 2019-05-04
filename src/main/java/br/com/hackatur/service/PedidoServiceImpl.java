package br.com.hackatur.service;

import br.com.hackatur.dao.PedidoDAO;
import br.com.hackatur.entity.Pedido;
import br.com.hackatur.entity.Pedido;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

  @Autowired
  PedidoDAO pedidoDAO;

  @Override
  public Pedido create(Pedido m) {
    Optional<Pedido> first = pedidoDAO.findById(m.getCdPedido());
    if (!first.isPresent()) {
      return pedidoDAO.save(m);
    }
    return null;
  }

  @Override
  public Optional<Pedido> findOne(Long codigo) {
    return pedidoDAO.findById(codigo);
  }

  @Override
  public Iterable<Pedido> findAll() {
    return pedidoDAO.findAll();
  }

  @Override
  public Pedido update(Pedido m) {
    return pedidoDAO.save(m);
  }

  @Override
  public void delete(Long id) {
    pedidoDAO.deleteById(id);
  }
}
