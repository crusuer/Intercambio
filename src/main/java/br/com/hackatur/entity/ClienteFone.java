package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CLIENTE_FONE database table.
 * 
 */
@Entity
@Table(name="CLIENTE_FONE")
@NamedQuery(name="ClienteFone.findAll", query="SELECT c FROM ClienteFone c")
public class ClienteFone implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ClienteFonePK id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	@Column(name="ID_TIPO")
	private String idTipo;

	@Column(name="NR_DDD")
	private BigDecimal nrDdd;

	@Column(name="NR_DDI")
	private BigDecimal nrDdi;

	@Column(name="NR_TELEFONE")
	private BigDecimal nrTelefone;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="CD_CLIENTE_CFONE", referencedColumnName = "CD_CLIENTE")
	private Cliente cliente;

	public ClienteFone() {
	}

	public ClienteFonePK getId() {
		return this.id;
	}

	public void setId(ClienteFonePK id) {
		this.id = id;
	}

	public Date getDtAtualizacao() {
		return this.dtAtualizacao;
	}

	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public Date getDtCriacao() {
		return this.dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

	public String getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public BigDecimal getNrDdd() {
		return this.nrDdd;
	}

	public void setNrDdd(BigDecimal nrDdd) {
		this.nrDdd = nrDdd;
	}

	public BigDecimal getNrDdi() {
		return this.nrDdi;
	}

	public void setNrDdi(BigDecimal nrDdi) {
		this.nrDdi = nrDdi;
	}

	public BigDecimal getNrTelefone() {
		return this.nrTelefone;
	}

	public void setNrTelefone(BigDecimal nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}