package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TIPO_ANFITRIAO database table.
 * 
 */
@Entity
@Table(name="TIPO_ANFITRIAO")
@NamedQuery(name="TipoAnfitriao.findAll", query="SELECT t FROM TipoAnfitriao t")
public class TipoAnfitriao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_TIPO_ANFITRIAO")
	private long cdTipoAnfitriao;

	@Column(name="DS_TIPO_ANFITRIAO")
	private String dsTipoAnfitriao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	//bi-directional many-to-one association to Anfitriao
	@OneToMany(mappedBy="tipoAnfitriao")
	private List<Anfitriao> anfitriaos;

	public TipoAnfitriao() {
	}

	public long getCdTipoAnfitriao() {
		return this.cdTipoAnfitriao;
	}

	public void setCdTipoAnfitriao(long cdTipoAnfitriao) {
		this.cdTipoAnfitriao = cdTipoAnfitriao;
	}

	public String getDsTipoAnfitriao() {
		return this.dsTipoAnfitriao;
	}

	public void setDsTipoAnfitriao(String dsTipoAnfitriao) {
		this.dsTipoAnfitriao = dsTipoAnfitriao;
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

	public List<Anfitriao> getAnfitriaos() {
		return this.anfitriaos;
	}

	public void setAnfitriaos(List<Anfitriao> anfitriaos) {
		this.anfitriaos = anfitriaos;
	}

	public Anfitriao addAnfitriao(Anfitriao anfitriao) {
		getAnfitriaos().add(anfitriao);
		anfitriao.setTipoAnfitriao(this);

		return anfitriao;
	}

	public Anfitriao removeAnfitriao(Anfitriao anfitriao) {
		getAnfitriaos().remove(anfitriao);
		anfitriao.setTipoAnfitriao(null);

		return anfitriao;
	}

}