package br.com.hackatur.entity;

import java.io.Serializable;
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

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_PEDIDO")
	private Date dtPedido;

	@Column(name="VL_PEDIDO")
	private BigDecimal vlPedido;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="pedido")
	private List<Reserva> reservas;

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

	public Date getDtAtualizacao() {
		return this.dtAtualizacao;
	}

	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public Date getDtPedido() {
		return this.dtPedido;
	}

	public void setDtPedido(Date dtPedido) {
		this.dtPedido = dtPedido;
	}

	public BigDecimal getVlPedido() {
		return this.vlPedido;
	}

	public void setVlPedido(BigDecimal vlPedido) {
		this.vlPedido = vlPedido;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setPedido(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setPedido(null);

		return reserva;
	}

}