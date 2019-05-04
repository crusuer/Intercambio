package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the IDIOMA_INSTITUICAO database table.
 * 
 */
@Entity
@Table(name="IDIOMA_INSTITUICAO")
@NamedQuery(name="IdiomaInstituicao.findAll", query="SELECT i FROM IdiomaInstituicao i")
public class IdiomaInstituicao implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IdiomaInstituicaoPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	//bi-directional many-to-one association to Idioma
	@ManyToOne
	@JoinColumn(name="CD_IDIOMA_INST", referencedColumnName = "CD_IDIOMA")
	private Idioma idioma;

	//bi-directional many-to-one association to Instituicao
	@ManyToOne
	@JoinColumn(name="CD_INSTITUICAO_INST", referencedColumnName="CD_INSTITUICAO")
	private Instituicao instituicao;

	public IdiomaInstituicao() {
	}

	public IdiomaInstituicaoPK getId() {
		return this.id;
	}

	public void setId(IdiomaInstituicaoPK id) {
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

	public Idioma getIdioma() {
		return this.idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

}