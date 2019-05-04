package br.com.hackatur.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import java.util.Date;

public class Reserva {

  private Long cdPedido;
  private Long cdReserva;
  private Long cdInstituicao;
  private Long cdAnfitriao;
  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  private Date dtSaida;
  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  private Date dtChegada;
  private BigDecimal vlReserva;
  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  private Date dtCriacao;
  @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
  private Date dtAtualizacao;

  public Long getCdPedido() {
    return cdPedido;
  }

  public void setCdPedido(Long cdPedido) {
    this.cdPedido = cdPedido;
  }

  public Long getCdReserva() {
    return cdReserva;
  }

  public void setCdReserva(Long cdReserva) {
    this.cdReserva = cdReserva;
  }

  public Long getCdInstituicao() {
    return cdInstituicao;
  }

  public void setCdInstituicao(Long cdInstituicao) {
    this.cdInstituicao = cdInstituicao;
  }

  public Long getCdAnfitriao() {
    return cdAnfitriao;
  }

  public void setCdAnfitriao(Long cdAnfitriao) {
    this.cdAnfitriao = cdAnfitriao;
  }

  public Date getDtSaida() {
    return dtSaida;
  }

  public void setDtSaida(Date dtSaida) {
    this.dtSaida = dtSaida;
  }

  public Date getDtChegada() {
    return dtChegada;
  }

  public void setDtChegada(Date dtChegada) {
    this.dtChegada = dtChegada;
  }

  public BigDecimal getVlReserva() {
    return vlReserva;
  }

  public void setVlReserva(BigDecimal vlReserva) {
    this.vlReserva = vlReserva;
  }

  public Date getDtCriacao() {
    return dtCriacao;
  }

  public void setDtCriacao(Date dtCriacao) {
    this.dtCriacao = dtCriacao;
  }

  public Date getDtAtualizacao() {
    return dtAtualizacao;
  }

  public void setDtAtualizacao(Date dtAtualizacao) {
    this.dtAtualizacao = dtAtualizacao;
  }
}
