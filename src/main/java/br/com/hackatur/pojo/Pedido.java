package br.com.hackatur.pojo;

import java.math.BigDecimal;

public class Pedido {

  private Long cdPedido;
  private Long cdCliente;
  private BigDecimal vlPedido;
  private Long cdStatus;

  public Long getCdPedido() {
    return cdPedido;
  }

  public void setCdPedido(Long cdPedido) {
    this.cdPedido = cdPedido;
  }

  public Long getCdCliente() {
    return cdCliente;
  }

  public void setCdCliente(Long cdCliente) {
    this.cdCliente = cdCliente;
  }

  public BigDecimal getVlPedido() {
    return vlPedido;
  }

  public void setVlPedido(BigDecimal vlPedido) {
    this.vlPedido = vlPedido;
  }

  public Long getCdStatus() {
    return cdStatus;
  }

  public void setCdStatus(Long cdStatus) {
    this.cdStatus = cdStatus;
  }
}
