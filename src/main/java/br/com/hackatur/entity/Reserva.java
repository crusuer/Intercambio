package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the RESERVA database table.
 * 
 */
@Entity
@NamedQuery(name="Reserva.findAll", query="SELECT r FROM Reserva r")
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReservaPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CHEGADA")
	private Date dtChegada;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_SAIDA")
	private Date dtSaida;

	@Column(name="VL_RESERVA")
	private BigDecimal vlReserva;

	//bi-directional many-to-one association to Anfitriao
	@ManyToOne
	@JoinColumn(name="CD_ANFITRIAO_RSV", referencedColumnName = "CD_ANFITRIAO")
	private Anfitriao anfitriao;

	//bi-directional many-to-one association to Instituicao
	@ManyToOne
	@JoinColumn(name="CD_INSTITUICAO_RSV", referencedColumnName = "CD_INSTITUICAO")
	private Instituicao instituicao;

	//bi-directional many-to-one association to Pedido
	@ManyToOne
	@JoinColumn(name="CD_PEDIDO_RSV", referencedColumnName = "CD_PEDIDO")
	private Pedido pedido;

	//bi-directional many-to-one association to ReservaPassageiro
	@OneToMany(mappedBy="reserva")
	private List<ReservaPassageiro> reservaPassageiros;

	public Reserva() {
	}

	public ReservaPK getId() {
		return this.id;
	}

	public void setId(ReservaPK id) {
		this.id = id;
	}

	public Date getDtAtualizacao() {
		return this.dtAtualizacao;
	}

	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public Date getDtChegada() {
		return this.dtChegada;
	}

	public void setDtChegada(Date dtChegada) {
		this.dtChegada = dtChegada;
	}

	public Date getDtCriacao() {
		return this.dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public Date getDtSaida() {
		return this.dtSaida;
	}

	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
	}

	public BigDecimal getVlReserva() {
		return this.vlReserva;
	}

	public void setVlReserva(BigDecimal vlReserva) {
		this.vlReserva = vlReserva;
	}

	public Anfitriao getAnfitriao() {
		return this.anfitriao;
	}

	public void setAnfitriao(Anfitriao anfitriao) {
		this.anfitriao = anfitriao;
	}

	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<ReservaPassageiro> getReservaPassageiros() {
		return this.reservaPassageiros;
	}

	public void setReservaPassageiros(List<ReservaPassageiro> reservaPassageiros) {
		this.reservaPassageiros = reservaPassageiros;
	}

	public ReservaPassageiro addReservaPassageiro(ReservaPassageiro reservaPassageiro) {
		getReservaPassageiros().add(reservaPassageiro);
		reservaPassageiro.setReserva(this);

		return reservaPassageiro;
	}

	public ReservaPassageiro removeReservaPassageiro(ReservaPassageiro reservaPassageiro) {
		getReservaPassageiros().remove(reservaPassageiro);
		reservaPassageiro.setReserva(null);

		return reservaPassageiro;
	}

}