package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TIPO_INSTITUICAO database table.
 * 
 */
@Entity
@Table(name="TIPO_INSTITUICAO")
@NamedQuery(name="TipoInstituicao.findAll", query="SELECT t FROM TipoInstituicao t")
public class TipoInstituicao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_TIPO_INSTITUICAO")
	private long cdTipoInstituicao;

	@Column(name="DS_TIPO_INSTITUICAO")
	private String dsTipoInstituicao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	//bi-directional many-to-one association to Instituicao
	@OneToMany(mappedBy="tipoInstituicao")
	private List<Instituicao> instituicaos;

	public TipoInstituicao() {
	}

	public long getCdTipoInstituicao() {
		return this.cdTipoInstituicao;
	}

	public void setCdTipoInstituicao(long cdTipoInstituicao) {
		this.cdTipoInstituicao = cdTipoInstituicao;
	}

	public String getDsTipoInstituicao() {
		return this.dsTipoInstituicao;
	}

	public void setDsTipoInstituicao(String dsTipoInstituicao) {
		this.dsTipoInstituicao = dsTipoInstituicao;
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

	public List<Instituicao> getInstituicaos() {
		return this.instituicaos;
	}

	public void setInstituicaos(List<Instituicao> instituicaos) {
		this.instituicaos = instituicaos;
	}

	public Instituicao addInstituicao(Instituicao instituicao) {
		getInstituicaos().add(instituicao);
		instituicao.setTipoInstituicao(this);

		return instituicao;
	}

	public Instituicao removeInstituicao(Instituicao instituicao) {
		getInstituicaos().remove(instituicao);
		instituicao.setTipoInstituicao(null);

		return instituicao;
	}

}