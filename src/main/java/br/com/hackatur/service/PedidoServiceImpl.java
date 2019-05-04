package br.com.hackatur.service;

import br.com.hackatur.dao.PedidoDAO;
import br.com.hackatur.pojo.Pedido;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

  @Autowired
  PedidoDAO pedidoDAO;

  @Override
  public Pedido create(Pedido m) {
    pedidoDAO.save(m);
    return null;
  }
}
