package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the IDIOMA database table.
 * 
 */
@Entity
@NamedQuery(name="Idioma.findAll", query="SELECT i FROM Idioma i")
public class Idioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_IDIOMA")
	private long cdIdioma;

	@Column(name="DS_IDIOMA")
	private String dsIdioma;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	//bi-directional many-to-one association to IdiomaInstituicao
	@OneToMany(mappedBy="idioma")
	private List<IdiomaInstituicao> idiomaInstituicaos;

	public Idioma() {
	}

	public long getCdIdioma() {
		return this.cdIdioma;
	}

	public void setCdIdioma(long cdIdioma) {
		this.cdIdioma = cdIdioma;
	}

	public String getDsIdioma() {
		return this.dsIdioma;
	}

	public void setDsIdioma(String dsIdioma) {
		this.dsIdioma = dsIdioma;
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

	public List<IdiomaInstituicao> getIdiomaInstituicaos() {
		return this.idiomaInstituicaos;
	}

	public void setIdiomaInstituicaos(List<IdiomaInstituicao> idiomaInstituicaos) {
		this.idiomaInstituicaos = idiomaInstituicaos;
	}

	public IdiomaInstituicao addIdiomaInstituicao(IdiomaInstituicao idiomaInstituicao) {
		getIdiomaInstituicaos().add(idiomaInstituicao);
		idiomaInstituicao.setIdioma(this);

		return idiomaInstituicao;
	}

	public IdiomaInstituicao removeIdiomaInstituicao(IdiomaInstituicao idiomaInstituicao) {
		getIdiomaInstituicaos().remove(idiomaInstituicao);
		idiomaInstituicao.setIdioma(null);

		return idiomaInstituicao;
	}

}