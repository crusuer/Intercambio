package br.com.hackatur.controller;


import br.com.hackatur.pojo.Pedido;
import br.com.hackatur.pojo.Reserva;
import br.com.hackatur.pojo.Resumo;
import br.com.hackatur.service.PedidoServiceImpl;
import br.com.hackatur.service.ReservaServiceImpl;
import br.com.hackatur.service.ResumoServiceImpl;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @Autowired
  PedidoServiceImpl pedidoService;
  @Autowired
  ReservaServiceImpl reservaService;
  @Autowired
  ResumoServiceImpl resumoService;

  @GetMapping(value = "/resumo")
  public List<Resumo> resumo(){
    return resumoService.findAll();
  }

  @PostMapping(value = "/pedido/create")
  public Pedido createPedido(@Valid @RequestBody Pedido m) {
    return pedidoService.create(m);
  }

  @PostMapping(value = "/reserva/create")
  public Reserva createReserva(@Valid @RequestBody Reserva m) {
    return reservaService.create(m);
  }
}
