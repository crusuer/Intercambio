package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the INSTITUICAO_ENDERECO database table.
 * 
 */
@Entity
@Table(name="INSTITUICAO_ENDERECO")
@NamedQuery(name="InstituicaoEndereco.findAll", query="SELECT i FROM InstituicaoEndereco i")
public class InstituicaoEndereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InstituicaoEnderecoPK id;

	@Column(name="DS_COMPLEMENTO_LOGRADOURO")
	private String dsComplementoLogradouro;

	@Column(name="DS_LOGRADOURO")
	private String dsLogradouro;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	@Column(name="ID_TIPO_ENDERECO")
	private String idTipoEndereco;

	@Column(name="NR_CODIGO_POSTAL")
	private BigDecimal nrCodigoPostal;

	@Column(name="NR_LOGRADOURO")
	private BigDecimal nrLogradouro;

	//bi-directional many-to-one association to Cidade
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_CIDADE_IEND", referencedColumnName="CD_CIDADE"),
		@JoinColumn(name="CD_ESTADO_IEND", referencedColumnName="CD_ESTADO"),
		@JoinColumn(name="CD_PAIS_IEND", referencedColumnName="CD_PAIS")
		})
	private Cidade cidade;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_ESTADO_IENDS", referencedColumnName="CD_ESTADO"),
		@JoinColumn(name="CD_PAIS_IENDS", referencedColumnName="CD_PAIS")
		})
	private Estado estado;

	//bi-directional many-to-one association to Instituicao
	@ManyToOne
	@JoinColumn(name="CD_INSTITUICAO_IENDSS", referencedColumnName="CD_INSTITUICAO")
	private Instituicao instituicao;

	//bi-directional many-to-one association to Pai
	@ManyToOne
	@JoinColumn(name="CD_PAIS_IENDSS", referencedColumnName="CD_PAIS")
	private Pai pai;

	public InstituicaoEndereco() {
	}

	public InstituicaoEnderecoPK getId() {
		return this.id;
	}

	public void setId(InstituicaoEnderecoPK id) {
		this.id = id;
	}

	public String getDsComplementoLogradouro() {
		return this.dsComplementoLogradouro;
	}

	public void setDsComplementoLogradouro(String dsComplementoLogradouro) {
		this.dsComplementoLogradouro = dsComplementoLogradouro;
	}

	public String getDsLogradouro() {
		return this.dsLogradouro;
	}

	public void setDsLogradouro(String dsLogradouro) {
		this.dsLogradouro = dsLogradouro;
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

	public String getIdTipoEndereco() {
		return this.idTipoEndereco;
	}

	public void setIdTipoEndereco(String idTipoEndereco) {
		this.idTipoEndereco = idTipoEndereco;
	}

	public BigDecimal getNrCodigoPostal() {
		return this.nrCodigoPostal;
	}

	public void setNrCodigoPostal(BigDecimal nrCodigoPostal) {
		this.nrCodigoPostal = nrCodigoPostal;
	}

	public BigDecimal getNrLogradouro() {
		return this.nrLogradouro;
	}

	public void setNrLogradouro(BigDecimal nrLogradouro) {
		this.nrLogradouro = nrLogradouro;
	}

	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Instituicao getInstituicao() {
		return this.instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Pai getPai() {
		return this.pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

}