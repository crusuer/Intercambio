package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RESPOSTA_PESQUISA_INSTITUICAO database table.
 * 
 */
@Entity
@Table(name="RESPOSTA_PESQUISA_INSTITUICAO")
@NamedQuery(name="RespostaPesquisaInstituicao.findAll", query="SELECT r FROM RespostaPesquisaInstituicao r")
public class RespostaPesquisaInstituicao implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RespostaPesquisaInstituicaoPK id;

	@Column(name="DS_COMENTARIO")
	private String dsComentario;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_PESQUISA")
	private Date dtPesquisa;

	@Column(name="NR_NOTA")
	private BigDecimal nrNota;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="CD_CLIENTE_RESP", referencedColumnName = "CD_CLIENTE")
	private Cliente cliente;

	//bi-directional many-to-one association to Instituicao
	@ManyToOne
	@JoinColumn(name="CD_INSTITUICAO_RESP")
	private Instituicao instituicao;

	//bi-directional many-to-one association to PesquisaSatisfacao
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_PERGUNTA_RESP", referencedColumnName="CD_PERGUNTA"),
		@JoinColumn(name="CD_PESQUISA_SATISFACAO_RESP", referencedColumnName="CD_PESQUISA_SATISFACAO")
		})
	private PesquisaSatisfacao pesquisaSatisfacao;

	public RespostaPesquisaInstituicao() {
	}

	public RespostaPesquisaInstituicaoPK getId() {
		return this.id;
	}

	public void setId(RespostaPesquisaInstituicaoPK id) {
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

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public PesquisaSatisfacao getPesquisaSatisfacao() {
		return this.pesquisaSatisfacao;
	}

	public void setPesquisaSatisfacao(PesquisaSatisfacao pesquisaSatisfacao) {
		this.pesquisaSatisfacao = pesquisaSatisfacao;
	}

}