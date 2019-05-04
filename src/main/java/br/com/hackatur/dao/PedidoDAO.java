package br.com.hackatur.dao;

import br.com.hackatur.entity.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoDAO extends CrudRepository<Pedido, Long> {

}
