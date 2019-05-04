package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PAIS database table.
 * 
 */
@Entity
@Table(name="PAIS")
@NamedQuery(name="Pai.findAll", query="SELECT p FROM Pai p")
public class Pai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_PAIS")
	private long cdPais;

	@Column(name="DS_PAIS")
	private String dsPais;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	@Column(name="SG_PAIS")
	private String sgPais;

	//bi-directional many-to-one association to AnfitriaoEndereco
	@OneToMany(mappedBy="pai")
	private List<AnfitriaoEndereco> anfitriaoEnderecos;

	//bi-directional many-to-one association to ClienteEndereco
	@OneToMany(mappedBy="pai")
	private List<ClienteEndereco> clienteEnderecos;

	//bi-directional many-to-one association to Estado
	@OneToMany(mappedBy="pai")
	private List<Estado> estados;

	//bi-directional many-to-one association to InstituicaoEndereco
	@OneToMany(mappedBy="pai")
	private List<InstituicaoEndereco> instituicaoEnderecos;

	public Pai() {
	}

	public long getCdPais() {
		return this.cdPais;
	}

	public void setCdPais(long cdPais) {
		this.cdPais = cdPais;
	}

	public String getDsPais() {
		return this.dsPais;
	}

	public void setDsPais(String dsPais) {
		this.dsPais = dsPais;
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

	public String getSgPais() {
		return this.sgPais;
	}

	public void setSgPais(String sgPais) {
		this.sgPais = sgPais;
	}

	public List<AnfitriaoEndereco> getAnfitriaoEnderecos() {
		return this.anfitriaoEnderecos;
	}

	public void setAnfitriaoEnderecos(List<AnfitriaoEndereco> anfitriaoEnderecos) {
		this.anfitriaoEnderecos = anfitriaoEnderecos;
	}

	public AnfitriaoEndereco addAnfitriaoEndereco(AnfitriaoEndereco anfitriaoEndereco) {
		getAnfitriaoEnderecos().add(anfitriaoEndereco);
		anfitriaoEndereco.setPai(this);

		return anfitriaoEndereco;
	}

	public AnfitriaoEndereco removeAnfitriaoEndereco(AnfitriaoEndereco anfitriaoEndereco) {
		getAnfitriaoEnderecos().remove(anfitriaoEndereco);
		anfitriaoEndereco.setPai(null);

		return anfitriaoEndereco;
	}

	public List<ClienteEndereco> getClienteEnderecos() {
		return this.clienteEnderecos;
	}

	public void setClienteEnderecos(List<ClienteEndereco> clienteEnderecos) {
		this.clienteEnderecos = clienteEnderecos;
	}

	public ClienteEndereco addClienteEndereco(ClienteEndereco clienteEndereco) {
		getClienteEnderecos().add(clienteEndereco);
		clienteEndereco.setPai(this);

		return clienteEndereco;
	}

	public ClienteEndereco removeClienteEndereco(ClienteEndereco clienteEndereco) {
		getClienteEnderecos().remove(clienteEndereco);
		clienteEndereco.setPai(null);

		return clienteEndereco;
	}

	public List<Estado> getEstados() {
		return this.estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Estado addEstado(Estado estado) {
		getEstados().add(estado);
		estado.setPai(this);

		return estado;
	}

	public Estado removeEstado(Estado estado) {
		getEstados().remove(estado);
		estado.setPai(null);

		return estado;
	}

	public List<InstituicaoEndereco> getInstituicaoEnderecos() {
		return this.instituicaoEnderecos;
	}

	public void setInstituicaoEnderecos(List<InstituicaoEndereco> instituicaoEnderecos) {
		this.instituicaoEnderecos = instituicaoEnderecos;
	}

	public InstituicaoEndereco addInstituicaoEndereco(InstituicaoEndereco instituicaoEndereco) {
		getInstituicaoEnderecos().add(instituicaoEndereco);
		instituicaoEndereco.setPai(this);

		return instituicaoEndereco;
	}

	public InstituicaoEndereco removeInstituicaoEndereco(InstituicaoEndereco instituicaoEndereco) {
		getInstituicaoEnderecos().remove(instituicaoEndereco);
		instituicaoEndereco.setPai(null);

		return instituicaoEndereco;
	}

}