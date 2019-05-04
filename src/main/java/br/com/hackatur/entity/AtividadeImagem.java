package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ATIVIDADE_IMAGEM database table.
 * 
 */
@Entity
@Table(name="ATIVIDADE_IMAGEM")
@NamedQuery(name="AtividadeImagem.findAll", query="SELECT a FROM AtividadeImagem a")
public class AtividadeImagem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AtividadeImagemPK id;

	@Column(name="DS_PATH")
	private String dsPath;

	@Column(name="DS_TITULO")
	private String dsTitulo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	@Column(name="NR_IMAGEM")
	private BigDecimal nrImagem;

	//bi-directional many-to-one association to Atividade
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_ATIVIDADE_ATV", referencedColumnName="CD_ATIVIDADE"),
		@JoinColumn(name="CD_INSTITUICAO_ATV", referencedColumnName="CD_INSTITUICAO"),
		@JoinColumn(name="NR_ORDEM_ATV", referencedColumnName="NR_ORDEM")
		})
	private Atividade atividade;

	public AtividadeImagem() {
	}

	public AtividadeImagemPK getId() {
		return this.id;
	}

	public void setId(AtividadeImagemPK id) {
		this.id = id;
	}

	public String getDsPath() {
		return this.dsPath;
	}

	public void setDsPath(String dsPath) {
		this.dsPath = dsPath;
	}

	public String getDsTitulo() {
		return this.dsTitulo;
	}

	public void setDsTitulo(String dsTitulo) {
		this.dsTitulo = dsTitulo;
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

	public BigDecimal getNrImagem() {
		return this.nrImagem;
	}

	public void setNrImagem(BigDecimal nrImagem) {
		this.nrImagem = nrImagem;
	}

	public Atividade getAtividade() {
		return this.atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

}