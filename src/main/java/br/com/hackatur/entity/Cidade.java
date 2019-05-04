package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CIDADE database table.
 * 
 */
@Entity
@NamedQuery(name="Cidade.findAll", query="SELECT c FROM Cidade c")
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CidadePK id;

	@Column(name="DS_CIDADE")
	private String dsCidade;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	//bi-directional many-to-one association to AnfitriaoEndereco
	@OneToMany(mappedBy="cidade")
	private List<AnfitriaoEndereco> anfitriaoEnderecos;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_ESTADO_CID", referencedColumnName="CD_ESTADO"),
		@JoinColumn(name="CD_PAIS_CID", referencedColumnName="CD_PAIS")
		})
	private Estado estado;

	//bi-directional many-to-one association to ClienteEndereco
	@OneToMany(mappedBy="cidade")
	private List<ClienteEndereco> clienteEnderecos;

	//bi-directional many-to-one association to InstituicaoEndereco
	@OneToMany(mappedBy="cidade")
	private List<InstituicaoEndereco> instituicaoEnderecos;

	public Cidade() {
	}

	public CidadePK getId() {
		return this.id;
	}

	public void setId(CidadePK id) {
		this.id = id;
	}

	public String getDsCidade() {
		return this.dsCidade;
	}

	public void setDsCidade(String dsCidade) {
		this.dsCidade = dsCidade;
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

	public List<AnfitriaoEndereco> getAnfitriaoEnderecos() {
		return this.anfitriaoEnderecos;
	}

	public void setAnfitriaoEnderecos(List<AnfitriaoEndereco> anfitriaoEnderecos) {
		this.anfitriaoEnderecos = anfitriaoEnderecos;
	}

	public AnfitriaoEndereco addAnfitriaoEndereco(AnfitriaoEndereco anfitriaoEndereco) {
		getAnfitriaoEnderecos().add(anfitriaoEndereco);
		anfitriaoEndereco.setCidade(this);

		return anfitriaoEndereco;
	}

	public AnfitriaoEndereco removeAnfitriaoEndereco(AnfitriaoEndereco anfitriaoEndereco) {
		getAnfitriaoEnderecos().remove(anfitriaoEndereco);
		anfitriaoEndereco.setCidade(null);

		return anfitriaoEndereco;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<ClienteEndereco> getClienteEnderecos() {
		return this.clienteEnderecos;
	}

	public void setClienteEnderecos(List<ClienteEndereco> clienteEnderecos) {
		this.clienteEnderecos = clienteEnderecos;
	}

	public ClienteEndereco addClienteEndereco(ClienteEndereco clienteEndereco) {
		getClienteEnderecos().add(clienteEndereco);
		clienteEndereco.setCidade(this);

		return clienteEndereco;
	}

	public ClienteEndereco removeClienteEndereco(ClienteEndereco clienteEndereco) {
		getClienteEnderecos().remove(clienteEndereco);
		clienteEndereco.setCidade(null);

		return clienteEndereco;
	}

	public List<InstituicaoEndereco> getInstituicaoEnderecos() {
		return this.instituicaoEnderecos;
	}

	public void setInstituicaoEnderecos(List<InstituicaoEndereco> instituicaoEnderecos) {
		this.instituicaoEnderecos = instituicaoEnderecos;
	}

	public InstituicaoEndereco addInstituicaoEndereco(InstituicaoEndereco instituicaoEndereco) {
		getInstituicaoEnderecos().add(instituicaoEndereco);
		instituicaoEndereco.setCidade(this);

		return instituicaoEndereco;
	}

	public InstituicaoEndereco removeInstituicaoEndereco(InstituicaoEndereco instituicaoEndereco) {
		getInstituicaoEnderecos().remove(instituicaoEndereco);
		instituicaoEndereco.setCidade(null);

		return instituicaoEndereco;
	}

}