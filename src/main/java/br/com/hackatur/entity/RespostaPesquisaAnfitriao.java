package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RESPOSTA_PESQUISA_ANFITRIAO database table.
 * 
 */
@Entity
@Table(name="RESPOSTA_PESQUISA_ANFITRIAO")
@NamedQuery(name="RespostaPesquisaAnfitriao.findAll", query="SELECT r FROM RespostaPesquisaAnfitriao r")
public class RespostaPesquisaAnfitriao implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespostaPesquisaAnfitriaoPK id;

	@Column(name="DS_COMENTARIO")
	private String dsComentario;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_PESQUISA")
	private Date dtPesquisa;

	@Column(name="NR_NOTA")
	private BigDecimal nrNota;

	//bi-directional many-to-one association to Anfitriao
	@ManyToOne
	@JoinColumn(name="CD_ANFITRIAO_PESQ", referencedColumnName = "CD_ANFITRIAO")
	private Anfitriao anfitriao;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="CD_CLIENTE_PESQ", referencedColumnName = "CD_CLIENTE")
	private Cliente cliente;

	//bi-directional many-to-one association to PesquisaSatisfacao
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_PERGUNTA_PESQ", referencedColumnName="CD_PERGUNTA"),
		@JoinColumn(name="CD_PESQUISA_SATISFACAO_PESQ", referencedColumnName="CD_PESQUISA_SATISFACAO")
		})
	private PesquisaSatisfacao pesquisaSatisfacao;

	public RespostaPesquisaAnfitriao() {
	}

	public RespostaPesquisaAnfitriaoPK getId() {
		return this.id;
	}

	public void setId(RespostaPesquisaAnfitriaoPK id) {
		this.id = id;
	}

	public String getDsComentario() {
		return this.dsComentario;
	}

	public void setDsComentario(String dsComentario) {
		this.dsComentario = dsComentario;
	}

	public Date getDtPesquisa() {
		return this.dtPesquisa;
	}

	public void setDtPesquisa(Date dtPesquisa) {
		this.dtPesquisa = dtPesquisa;
	}

	public BigDecimal getNrNota() {
		return this.nrNota;
	}

	public void setNrNota(BigDecimal nrNota) {
		this.nrNota = nrNota;
	}

	public Anfitriao getAnfitriao() {
		return this.anfitriao;
	}

	public void setAnfitriao(Anfitriao anfitriao) {
		this.anfitriao = anfitriao;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PesquisaSatisfacao getPesquisaSatisfacao() {
		return this.pesquisaSatisfacao;
	}

	public void setPesquisaSatisfacao(PesquisaSatisfacao pesquisaSatisfacao) {
		this.pesquisaSatisfacao = pesquisaSatisfacao;
	}

}