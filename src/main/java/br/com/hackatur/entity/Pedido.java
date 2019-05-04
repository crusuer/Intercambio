package br.com.hackatur.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PEDIDO database table.
 * 
 */
@Entity
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_PEDIDO")
	private long cdPedido;

	@Column(name="CD_CLIENTE")
	private BigDecimal cdCliente;

	@Column(name="CD_STATUS")
	private BigDecimal cdStatus;

	@Column(name="DT_ATUALIZACAO")
	private LocalDateTime dtAtualizacao;

	@Column(name="DT_PEDIDO")
	private LocalDateTime dtPedido;

	@Column(name="VL_PEDIDO")
	private BigDecimal vlPedido;

	public Pedido() {
	}

	public long getCdPedido() {
		return this.cdPedido;
	}

	public void setCdPedido(long cdPedido) {
		this.cdPedido = cdPedido;
	}

	public BigDecimal getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(BigDecimal cdCliente) {
		this.cdCliente = cdCliente;
	}

	public BigDecimal getCdStatus() {
		return this.cdStatus;
	}

	public void setCdStatus(BigDecimal cdStatus) {
		this.cdStatus = cdStatus;
	}

	public LocalDateTime getDtAtualizacao() {
		return this.dtAtualizacao;
	}

	public void setDtAtualizacao(LocalDateTime dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public LocalDateTime getDtPedido() {
		return this.dtPedido;
	}

	public void setDtPedido(LocalDateTime dtPedido) {
		this.dtPedido = dtPedido;
	}

	public BigDecimal getVlPedido() {
		return this.vlPedido;
	}

	public void setVlPedido(BigDecimal vlPedido) {
		this.vlPedido = vlPedido;
	}

}