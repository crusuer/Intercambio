package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the INSTITUICAO database table.
 * 
 */
@Entity
@NamedQuery(name="Instituicao.findAll", query="SELECT i FROM Instituicao i")
public class Instituicao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_INSTITUICAO")
	private long cdInstituicao;

	@Column(name="CD_CODIGO_JURIDICO")
	private String cdCodigoJuridico;

	@Column(name="DS_EMAIL")
	private String dsEmail;

	@Column(name="DS_INFO")
	private String dsInfo;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_CRIACAO")
	private Date dtCriacao;

	@Column(name="NM_INSTITUICAO")
	private String nmInstituicao;

	//bi-directional many-to-one association to Atividade
	@OneToMany(mappedBy="instituicao")
	private List<Atividade> atividades;

	//bi-directional many-to-one association to IdiomaInstituicao
	@OneToMany(mappedBy="instituicao")
	private List<IdiomaInstituicao> idiomaInstituicaos;

	//bi-directional many-to-one association to TipoInstituicao
	@ManyToOne
	@JoinColumn(name="CD_TIPO_INSTITUICAO_INST", referencedColumnName = "CD_TIPO_INSTITUICAO")
	private TipoInstituicao tipoInstituicao;

	//bi-directional many-to-one association to InstituicaoEndereco
	@OneToMany(mappedBy="instituicao")
	private List<InstituicaoEndereco> instituicaoEnderecos;

	//bi-directional many-to-one association to InstituicaoFone
	@OneToMany(mappedBy="instituicao")
	private List<InstituicaoFone> instituicaoFones;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="instituicao")
	private List<Reserva> reservas;

	//bi-directional many-to-one association to RespostaPesquisaInstituicao
	@OneToMany(mappedBy="instituicao")
	private List<RespostaPesquisaInstituicao> respostaPesquisaInstituicaos;

	public Instituicao() {
	}

	public long getCdInstituicao() {
		return this.cdInstituicao;
	}

	public void setCdInstituicao(long cdInstituicao) {
		this.cdInstituicao = cdInstituicao;
	}

	public String getCdCodigoJuridico() {
		return this.cdCodigoJuridico;
	}

	public void setCdCodigoJuridico(String cdCodigoJuridico) {
		this.cdCodigoJuridico = cdCodigoJuridico;
	}

	public String getDsEmail() {
		return this.dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getDsInfo() {
		return this.dsInfo;
	}

	public void setDsInfo(String dsInfo) {
		this.dsInfo = dsInfo;
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

	public String getNmInstituicao() {
		return this.nmInstituicao;
	}

	public void setNmInstituicao(String nmInstituicao) {
		this.nmInstituicao = nmInstituicao;
	}

	public List<Atividade> getAtividades() {
		return this.atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public Atividade addAtividade(Atividade atividade) {
		getAtividades().add(atividade);
		atividade.setInstituicao(this);

		return atividade;
	}

	public Atividade removeAtividade(Atividade atividade) {
		getAtividades().remove(atividade);
		atividade.setInstituicao(null);

		return atividade;
	}

	public List<IdiomaInstituicao> getIdiomaInstituicaos() {
		return this.idiomaInstituicaos;
	}

	public void setIdiomaInstituicaos(List<IdiomaInstituicao> idiomaInstituicaos) {
		this.idiomaInstituicaos = idiomaInstituicaos;
	}

	public IdiomaInstituicao addIdiomaInstituicao(IdiomaInstituicao idiomaInstituicao) {
		getIdiomaInstituicaos().add(idiomaInstituicao);
		idiomaInstituicao.setInstituicao(this);

		return idiomaInstituicao;
	}

	public IdiomaInstituicao removeIdiomaInstituicao(IdiomaInstituicao idiomaInstituicao) {
		getIdiomaInstituicaos().remove(idiomaInstituicao);
		idiomaInstituicao.setInstituicao(null);

		return idiomaInstituicao;
	}

	public TipoInstituicao getTipoInstituicao() {
		return this.tipoInstituicao;
	}

	public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
		this.tipoInstituicao = tipoInstituicao;
	}

	public List<InstituicaoEndereco> getInstituicaoEnderecos() {
		return this.instituicaoEnderecos;
	}

	public void setInstituicaoEnderecos(List<InstituicaoEndereco> instituicaoEnderecos) {
		this.instituicaoEnderecos = instituicaoEnderecos;
	}

	public InstituicaoEndereco addInstituicaoEndereco(InstituicaoEndereco instituicaoEndereco) {
		getInstituicaoEnderecos().add(instituicaoEndereco);
		instituicaoEndereco.setInstituicao(this);

		return instituicaoEndereco;
	}

	public InstituicaoEndereco removeInstituicaoEndereco(InstituicaoEndereco instituicaoEndereco) {
		getInstituicaoEnderecos().remove(instituicaoEndereco);
		instituicaoEndereco.setInstituicao(null);

		return instituicaoEndereco;
	}

	public List<InstituicaoFone> getInstituicaoFones() {
		return this.instituicaoFones;
	}

	public void setInstituicaoFones(List<InstituicaoFone> instituicaoFones) {
		this.instituicaoFones = instituicaoFones;
	}

	public InstituicaoFone addInstituicaoFone(InstituicaoFone instituicaoFone) {
		getInstituicaoFones().add(instituicaoFone);
		instituicaoFone.setInstituicao(this);

		return instituicaoFone;
	}

	public InstituicaoFone removeInstituicaoFone(InstituicaoFone instituicaoFone) {
		getInstituicaoFones().remove(instituicaoFone);
		instituicaoFone.setInstituicao(null);

		return instituicaoFone;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setInstituicao(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setInstituicao(null);

		return reserva;
	}

	public List<RespostaPesquisaInstituicao> getRespostaPesquisaInstituicaos() {
		return this.respostaPesquisaInstituicaos;
	}

	public void setRespostaPesquisaInstituicaos(List<RespostaPesquisaInstituicao> respostaPesquisaInstituicaos) {
		this.respostaPesquisaInstituicaos = respostaPesquisaInstituicaos;
	}

	public RespostaPesquisaInstituicao addRespostaPesquisaInstituicao(RespostaPesquisaInstituicao respostaPesquisaInstituicao) {
		getRespostaPesquisaInstituicaos().add(respostaPesquisaInstituicao);
		respostaPesquisaInstituicao.setInstituicao(this);

		return respostaPesquisaInstituicao;
	}

	public RespostaPesquisaInstituicao removeRespostaPesquisaInstituicao(RespostaPesquisaInstituicao respostaPesquisaInstituicao) {
		getRespostaPesquisaInstituicaos().remove(respostaPesquisaInstituicao);
		respostaPesquisaInstituicao.setInstituicao(null);

		return respostaPesquisaInstituicao;
	}

}