package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CLIENTE database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_CLIENTE")
	private long cdCliente;

	@Column(name="CD_CPF")
	private String cdCpf;

	@Column(name="CD_ORGAO_EXPEDIDOR")
	private String cdOrgaoExpedidor;

	@Column(name="CD_RG")
	private String cdRg;

	@Column(name="DS_EMAIL")
	private String dsEmail;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Date dtNascimento;

	@Column(name="ID_SEXO")
	private String idSexo;

	@Column(name="NM_CLIENTE")
	private String nmCliente;

	//bi-directional many-to-one association to ClienteEndereco
	@OneToMany(mappedBy="cliente")
	private List<ClienteEndereco> clienteEnderecos;

	//bi-directional many-to-one association to ClienteFone
	@OneToMany(mappedBy="cliente")
	private List<ClienteFone> clienteFones;

	//bi-directional many-to-one association to RespostaPesquisaAnfitriao
	@OneToMany(mappedBy="cliente")
	private List<RespostaPesquisaAnfitriao> respostaPesquisaAnfitriaos;

	//bi-directional many-to-one association to RespostaPesquisaInstituicao
	@OneToMany(mappedBy="cliente")
	private List<RespostaPesquisaInstituicao> respostaPesquisaInstituicaos;

	public Cliente() {
	}

	public long getCdCliente() {
		return this.cdCliente;
	}

	public void setCdCliente(long cdCliente) {
		this.cdCliente = cdCliente;
	}

	public String getCdCpf() {
		return this.cdCpf;
	}

	public void setCdCpf(String cdCpf) {
		this.cdCpf = cdCpf;
	}

	public String getCdOrgaoExpedidor() {
		return this.cdOrgaoExpedidor;
	}

	public void setCdOrgaoExpedidor(String cdOrgaoExpedidor) {
		this.cdOrgaoExpedidor = cdOrgaoExpedidor;
	}

	public String getCdRg() {
		return this.cdRg;
	}

	public void setCdRg(String cdRg) {
		this.cdRg = cdRg;
	}

	public String getDsEmail() {
		return this.dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
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

	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getIdSexo() {
		return this.idSexo;
	}

	public void setIdSexo(String idSexo) {
		this.idSexo = idSexo;
	}

	public String getNmCliente() {
		return this.nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public List<ClienteEndereco> getClienteEnderecos() {
		return this.clienteEnderecos;
	}

	public void setClienteEnderecos(List<ClienteEndereco> clienteEnderecos) {
		this.clienteEnderecos = clienteEnderecos;
	}

	public ClienteEndereco addClienteEndereco(ClienteEndereco clienteEndereco) {
		getClienteEnderecos().add(clienteEndereco);
		clienteEndereco.setCliente(this);

		return clienteEndereco;
	}

	public ClienteEndereco removeClienteEndereco(ClienteEndereco clienteEndereco) {
		getClienteEnderecos().remove(clienteEndereco);
		clienteEndereco.setCliente(null);

		return clienteEndereco;
	}

	public List<ClienteFone> getClienteFones() {
		return this.clienteFones;
	}

	public void setClienteFones(List<ClienteFone> clienteFones) {
		this.clienteFones = clienteFones;
	}

	public ClienteFone addClienteFone(ClienteFone clienteFone) {
		getClienteFones().add(clienteFone);
		clienteFone.setCliente(this);

		return clienteFone;
	}

	public ClienteFone removeClienteFone(ClienteFone clienteFone) {
		getClienteFones().remove(clienteFone);
		clienteFone.setCliente(null);

		return clienteFone;
	}

	public List<RespostaPesquisaAnfitriao> getRespostaPesquisaAnfitriaos() {
		return this.respostaPesquisaAnfitriaos;
	}

	public void setRespostaPesquisaAnfitriaos(List<RespostaPesquisaAnfitriao> respostaPesquisaAnfitriaos) {
		this.respostaPesquisaAnfitriaos = respostaPesquisaAnfitriaos;
	}

	public RespostaPesquisaAnfitriao addRespostaPesquisaAnfitriao(RespostaPesquisaAnfitriao respostaPesquisaAnfitriao) {
		getRespostaPesquisaAnfitriaos().add(respostaPesquisaAnfitriao);
		respostaPesquisaAnfitriao.setCliente(this);

		return respostaPesquisaAnfitriao;
	}

	public RespostaPesquisaAnfitriao removeRespostaPesquisaAnfitriao(RespostaPesquisaAnfitriao respostaPesquisaAnfitriao) {
		getRespostaPesquisaAnfitriaos().remove(respostaPesquisaAnfitriao);
		respostaPesquisaAnfitriao.setCliente(null);

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
		respostaPesquisaInstituicao.setCliente(this);

		return respostaPesquisaInstituicao;
	}

	public RespostaPesquisaInstituicao removeRespostaPesquisaInstituicao(RespostaPesquisaInstituicao respostaPesquisaInstituicao) {
		getRespostaPesquisaInstituicaos().remove(respostaPesquisaInstituicao);
		respostaPesquisaInstituicao.setCliente(null);

		return respostaPesquisaInstituicao;
	}

}