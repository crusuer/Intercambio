package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ANFITRIAO_ENDERECO database table.
 * 
 */
@Entity
@Table(name="ANFITRIAO_ENDERECO")
@NamedQuery(name="AnfitriaoEndereco.findAll", query="SELECT a FROM AnfitriaoEndereco a")
public class AnfitriaoEndereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AnfitriaoEnderecoPK id;

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

	//bi-directional many-to-one association to Anfitriao
	@ManyToOne
	@JoinColumn(name="CD_ANFITRIAO_AEND", referencedColumnName = "CD_ANFITRIAO")
	private Anfitriao anfitriao;

	//bi-directional many-to-one association to Cidade
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_CIDADE_AEND", referencedColumnName="CD_CIDADE"),
		@JoinColumn(name="CD_ESTADO_AEND", referencedColumnName="CD_ESTADO"),
		@JoinColumn(name="CD_PAIS_AEND", referencedColumnName="CD_PAIS")
		})
	private Cidade cidade;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_ESTADO_AENDS", referencedColumnName="CD_ESTADO"),
		@JoinColumn(name="CD_PAIS_AENDS", referencedColumnName="CD_PAIS")
		})
	private Estado estado;

	//bi-directional many-to-one association to Pai
	@ManyToOne
	@JoinColumn(name="CD_PAIS")
	private Pai pai;

	public AnfitriaoEndereco() {
	}

	public AnfitriaoEnderecoPK getId() {
		return this.id;
	}

	public void setId(AnfitriaoEnderecoPK id) {
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

	public Anfitriao getAnfitriao() {
		return this.anfitriao;
	}

	public void setAnfitriao(Anfitriao anfitriao) {
		this.anfitriao = anfitriao;
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

	public Pai getPai() {
		return this.pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

}