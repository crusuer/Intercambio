package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PESQUISA_SATISFACAO database table.
 * 
 */
@Entity
@Table(name="PESQUISA_SATISFACAO")
@NamedQuery(name="PesquisaSatisfacao.findAll", query="SELECT p FROM PesquisaSatisfacao p")
public class PesquisaSatisfacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PesquisaSatisfacaoPK id;

	@Column(name="DS_PERGUNTA")
	private String dsPergunta;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	//bi-directional many-to-one association to RespostaPesquisaAnfitriao
	@OneToMany(mappedBy="pesquisaSatisfacao")
	private List<RespostaPesquisaAnfitriao> respostaPesquisaAnfitriaos;

	//bi-directional many-to-one association to RespostaPesquisaInstituicao
	@OneToMany(mappedBy="pesquisaSatisfacao")
	private List<RespostaPesquisaInstituicao> respostaPesquisaInstituicaos;

	public PesquisaSatisfacao() {
	}

	public PesquisaSatisfacaoPK getId() {
		return this.id;
	}

	public void setId(PesquisaSatisfacaoPK id) {
		this.id = id;
	}

	public String getDsPergunta() {
		return this.dsPergunta;
	}

	public void setDsPergunta(String dsPergunta) {
		this.dsPergunta = dsPergunta;
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

	public List<RespostaPesquisaAnfitriao> getRespostaPesquisaAnfitriaos() {
		return this.respostaPesquisaAnfitriaos;
	}

	public void setRespostaPesquisaAnfitriaos(List<RespostaPesquisaAnfitriao> respostaPesquisaAnfitriaos) {
		this.respostaPesquisaAnfitriaos = respostaPesquisaAnfitriaos;
	}

	public RespostaPesquisaAnfitriao addRespostaPesquisaAnfitriao(RespostaPesquisaAnfitriao respostaPesquisaAnfitriao) {
		getRespostaPesquisaAnfitriaos().add(respostaPesquisaAnfitriao);
		respostaPesquisaAnfitriao.setPesquisaSatisfacao(this);

		return respostaPesquisaAnfitriao;
	}

	public RespostaPesquisaAnfitriao removeRespostaPesquisaAnfitriao(RespostaPesquisaAnfitriao respostaPesquisaAnfitriao) {
		getRespostaPesquisaAnfitriaos().remove(respostaPesquisaAnfitriao);
		respostaPesquisaAnfitriao.setPesquisaSatisfacao(null);

		return respostaPesquisaAnfitriao;
	}

	public List<RespostaPesquisaInstituicao> getRespostaPesquisaInstituicaos() {
		return this.respostaPesquisaInstituicaos;
	}

	public void setRespostaPesquisaInstituicaos(List<RespostaPesquisaInstituicao> respostaPesquisaInstituicaos) {
		this.respostaPesquisaInstituicaos = respostaPesquisaInstituicaos;
	}

	public RespostaPesquisaInstituicao addRespostaPesquisaInstituicao(RespostaPesquisaInstituicao respostaPesquisaInstituicao) {
		getRespostaPesquisaInstituicaos().add(respostaPesquisaInstituicao);
		respostaPesquisaInstituicao.setPesquisaSatisfacao(this);

		return respostaPesquisaInstituicao;
	}

	public RespostaPesquisaInstituicao removeRespostaPesquisaInstituicao(RespostaPesquisaInstituicao respostaPesquisaInstituicao) {
		getRespostaPesquisaInstituicaos().remove(respostaPesquisaInstituicao);
		respostaPesquisaInstituicao.setPesquisaSatisfacao(null);

		return respostaPesquisaInstituicao;
	}

}