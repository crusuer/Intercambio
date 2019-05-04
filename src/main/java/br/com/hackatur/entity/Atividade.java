package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ATIVIDADE database table.
 * 
 */
@Entity
@NamedQuery(name="Atividade.findAll", query="SELECT a FROM Atividade a")
public class Atividade implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AtividadePK id;

	@Column(name="DS_DESCRITIVO")
	private String dsDescritivo;

	@Column(name="DS_TITULO")
	private String dsTitulo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	//bi-directional many-to-one association to Instituicao
	@ManyToOne
	@JoinColumn(name="CD_INSTITUICAO_ATV", referencedColumnName = "CD_INSTITUICAO")
	private Instituicao instituicao;

	//bi-directional many-to-one association to AtividadeImagem
	@OneToMany(mappedBy="atividade")
	private List<AtividadeImagem> atividadeImagems;

	public Atividade() {
	}

	public AtividadePK getId() {
		return this.id;
	}

	public void setId(AtividadePK id) {
		this.id = id;
	}

	public String getDsDescritivo() {
		return this.dsDescritivo;
	}

	public void setDsDescritivo(String dsDescritivo) {
		this.dsDescritivo = dsDescritivo;
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

	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public List<AtividadeImagem> getAtividadeImagems() {
		return this.atividadeImagems;
	}

	public void setAtividadeImagems(List<AtividadeImagem> atividadeImagems) {
		this.atividadeImagems = atividadeImagems;
	}

	public AtividadeImagem addAtividadeImagem(AtividadeImagem atividadeImagem) {
		getAtividadeImagems().add(atividadeImagem);
		atividadeImagem.setAtividade(this);

		return atividadeImagem;
	}

	public AtividadeImagem removeAtividadeImagem(AtividadeImagem atividadeImagem) {
		getAtividadeImagems().remove(atividadeImagem);
		atividadeImagem.setAtividade(null);

		return atividadeImagem;
	}

}