package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ESTADO database table.
 * 
 */
@Entity
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EstadoPK id;

	@Column(name="DS_ESTADO")
	private String dsEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	@Column(name="SG_ESTADO")
	private String sgEstado;

	//bi-directional many-to-one association to AnfitriaoEndereco
	@OneToMany(mappedBy="estado")
	private List<AnfitriaoEndereco> anfitriaoEnderecos;

	//bi-directional many-to-one association to Cidade
	@OneToMany(mappedBy="estado")
	private List<Cidade> cidades;

	//bi-directional many-to-one association to ClienteEndereco
	@OneToMany(mappedBy="estado")
	private List<ClienteEndereco> clienteEnderecos;

	//bi-directional many-to-one association to Pai
	@ManyToOne
	@JoinColumn(name="CD_PAIS_EST", referencedColumnName = "CD_PAIS")
	private Pai pai;

	//bi-directional many-to-one association to InstituicaoEndereco
	@OneToMany(mappedBy="estado")
	private List<InstituicaoEndereco> instituicaoEnderecos;

	public Estado() {
	}

	public EstadoPK getId() {
		return this.id;
	}

	public void setId(EstadoPK id) {
		this.id = id;
	}

	public String getDsEstado() {
		return this.dsEstado;
	}

	public void setDsEstado(String dsEstado) {
		this.dsEstado = dsEstado;
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

	public String getSgEstado() {
		return this.sgEstado;
	}

	public void setSgEstado(String sgEstado) {
		this.sgEstado = sgEstado;
	}

	public List<AnfitriaoEndereco> getAnfitriaoEnderecos() {
		return this.anfitriaoEnderecos;
	}

	public void setAnfitriaoEnderecos(List<AnfitriaoEndereco> anfitriaoEnderecos) {
		this.anfitriaoEnderecos = anfitriaoEnderecos;
	}

	public AnfitriaoEndereco addAnfitriaoEndereco(AnfitriaoEndereco anfitriaoEndereco) {
		getAnfitriaoEnderecos().add(anfitriaoEndereco);
		anfitriaoEndereco.setEstado(this);

		return anfitriaoEndereco;
	}

	public AnfitriaoEndereco removeAnfitriaoEndereco(AnfitriaoEndereco anfitriaoEndereco) {
		getAnfitriaoEnderecos().remove(anfitriaoEndereco);
		anfitriaoEndereco.setEstado(null);

		return anfitriaoEndereco;
	}

	public List<Cidade> getCidades() {
		return this.cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	public Cidade addCidade(Cidade cidade) {
		getCidades().add(cidade);
		cidade.setEstado(this);

		return cidade;
	}

	public Cidade removeCidade(Cidade cidade) {
		getCidades().remove(cidade);
		cidade.setEstado(null);

		return cidade;
	}

	public List<ClienteEndereco> getClienteEnderecos() {
		return this.clienteEnderecos;
	}

	public void setClienteEnderecos(List<ClienteEndereco> clienteEnderecos) {
		this.clienteEnderecos = clienteEnderecos;
	}

	public ClienteEndereco addClienteEndereco(ClienteEndereco clienteEndereco) {
		getClienteEnderecos().add(clienteEndereco);
		clienteEndereco.setEstado(this);

		return clienteEndereco;
	}

	public ClienteEndereco removeClienteEndereco(ClienteEndereco clienteEndereco) {
		getClienteEnderecos().remove(clienteEndereco);
		clienteEndereco.setEstado(null);

		return clienteEndereco;
	}

	public Pai getPai() {
		return this.pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

	public List<InstituicaoEndereco> getInstituicaoEnderecos() {
		return this.instituicaoEnderecos;
	}

	public void setInstituicaoEnderecos(List<InstituicaoEndereco> instituicaoEnderecos) {
		this.instituicaoEnderecos = instituicaoEnderecos;
	}

	public InstituicaoEndereco addInstituicaoEndereco(InstituicaoEndereco instituicaoEndereco) {
		getInstituicaoEnderecos().add(instituicaoEndereco);
		instituicaoEndereco.setEstado(this);

		return instituicaoEndereco;
	}

	public InstituicaoEndereco removeInstituicaoEndereco(InstituicaoEndereco instituicaoEndereco) {
		getInstituicaoEnderecos().remove(instituicaoEndereco);
		instituicaoEndereco.setEstado(null);

		return instituicaoEndereco;
	}

}