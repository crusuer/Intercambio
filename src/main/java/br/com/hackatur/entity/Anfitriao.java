package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ANFITRIAO database table.
 * 
 */
@Entity
@NamedQuery(name="Anfitriao.findAll", query="SELECT a FROM Anfitriao a")
public class Anfitriao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_ANFITRIAO")
	private long cdAnfitriao;

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

	@Column(name="ID_TIPO_PESSOA")
	private String idTipoPessoa;

	@Column(name="NM_ANFITRIAO")
	private String nmAnfitriao;

	//bi-directional many-to-one association to TipoAnfitriao
	@ManyToOne
	@JoinColumn(name="CD_TIPO_ANFITRIAO")
	private TipoAnfitriao tipoAnfitriao;

	//bi-directional many-to-one association to AnfitriaoEndereco
	@OneToMany(mappedBy="anfitriao")
	private List<AnfitriaoEndereco> anfitriaoEnderecos;

	//bi-directional many-to-one association to AnfitriaoFone
	@OneToMany(mappedBy="anfitriao")
	private List<AnfitriaoFone> anfitriaoFones;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="anfitriao")
	private List<Reserva> reservas;

	//bi-directional many-to-one association to RespostaPesquisaAnfitriao
	@OneToMany(mappedBy="anfitriao")
	private List<RespostaPesquisaAnfitriao> respostaPesquisaAnfitriaos;

	public Anfitriao() {
	}

	public long getCdAnfitriao() {
		return this.cdAnfitriao;
	}

	public void setCdAnfitriao(long cdAnfitriao) {
		this.cdAnfitriao = cdAnfitriao;
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

	public String getIdTipoPessoa() {
		return this.idTipoPessoa;
	}

	public void setIdTipoPessoa(String idTipoPessoa) {
		this.idTipoPessoa = idTipoPessoa;
	}

	public String getNmAnfitriao() {
		return this.nmAnfitriao;
	}

	public void setNmAnfitriao(String nmAnfitriao) {
		this.nmAnfitriao = nmAnfitriao;
	}

	public TipoAnfitriao getTipoAnfitriao() {
		return this.tipoAnfitriao;
	}

	public void setTipoAnfitriao(TipoAnfitriao tipoAnfitriao) {
		this.tipoAnfitriao = tipoAnfitriao;
	}

	public List<AnfitriaoEndereco> getAnfitriaoEnderecos() {
		return this.anfitriaoEnderecos;
	}

	public void setAnfitriaoEnderecos(List<AnfitriaoEndereco> anfitriaoEnderecos) {
		this.anfitriaoEnderecos = anfitriaoEnderecos;
	}

	public AnfitriaoEndereco addAnfitriaoEndereco(AnfitriaoEndereco anfitriaoEndereco) {
		getAnfitriaoEnderecos().add(anfitriaoEndereco);
		anfitriaoEndereco.setAnfitriao(this);

		return anfitriaoEndereco;
	}

	public AnfitriaoEndereco removeAnfitriaoEndereco(AnfitriaoEndereco anfitriaoEndereco) {
		getAnfitriaoEnderecos().remove(anfitriaoEndereco);
		anfitriaoEndereco.setAnfitriao(null);

		return anfitriaoEndereco;
	}

	public List<AnfitriaoFone> getAnfitriaoFones() {
		return this.anfitriaoFones;
	}

	public void setAnfitriaoFones(List<AnfitriaoFone> anfitriaoFones) {
		this.anfitriaoFones = anfitriaoFones;
	}

	public AnfitriaoFone addAnfitriaoFone(AnfitriaoFone anfitriaoFone) {
		getAnfitriaoFones().add(anfitriaoFone);
		anfitriaoFone.setAnfitriao(this);

		return anfitriaoFone;
	}

	public AnfitriaoFone removeAnfitriaoFone(AnfitriaoFone anfitriaoFone) {
		getAnfitriaoFones().remove(anfitriaoFone);
		anfitriaoFone.setAnfitriao(null);

		return anfitriaoFone;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setAnfitriao(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setAnfitriao(null);

		return reserva;
	}

	public List<RespostaPesquisaAnfitriao> getRespostaPesquisaAnfitriaos() {
		return this.respostaPesquisaAnfitriaos;
	}

	public void setRespostaPesquisaAnfitriaos(List<RespostaPesquisaAnfitriao> respostaPesquisaAnfitriaos) {
		this.respostaPesquisaAnfitriaos = respostaPesquisaAnfitriaos;
	}

	public RespostaPesquisaAnfitriao addRespostaPesquisaAnfitriao(RespostaPesquisaAnfitriao respostaPesquisaAnfitriao) {
		getRespostaPesquisaAnfitriaos().add(respostaPesquisaAnfitriao);
		respostaPesquisaAnfitriao.setAnfitriao(this);

		return respostaPesquisaAnfitriao;
	}

	public RespostaPesquisaAnfitriao removeRespostaPesquisaAnfitriao(RespostaPesquisaAnfitriao respostaPesquisaAnfitriao) {
		getRespostaPesquisaAnfitriaos().remove(respostaPesquisaAnfitriao);
		respostaPesquisaAnfitriao.setAnfitriao(null);

		return respostaPesquisaAnfitriao;
	}

}