package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the RESERVA_PASSAGEIRO database table.
 * 
 */
@Entity
@Table(name="RESERVA_PASSAGEIRO")
@NamedQuery(name="ReservaPassageiro.findAll", query="SELECT r FROM ReservaPassageiro r")
public class ReservaPassageiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReservaPassageiroPK id;

	@Column(name="CD_CPF")
	private String cdCpf;

	@Column(name="CD_ORGAO_EXPEDIDOR")
	private String cdOrgaoExpedidor;

	@Column(name="CD_RG")
	private String cdRg;

	@Column(name="DS_EMAIL")
	private String dsEmail;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_NASCIMENTO")
	private Date dtNascimento;

	@Column(name="ID_SEXO")
	private String idSexo;

	@Column(name="NM_PASSAGEIRO")
	private String nmPassageiro;

	//bi-directional many-to-one association to Reserva
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_PEDIDO_RES", referencedColumnName="CD_PEDIDO"),
		@JoinColumn(name="CD_RESERVA_RES", referencedColumnName="CD_RESERVA")
		})
	private Reserva reserva;

	public ReservaPassageiro() {
	}

	public ReservaPassageiroPK getId() {
		return this.id;
	}

	public void setId(ReservaPassageiroPK id) {
		this.id = id;
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

	public String getNmPassageiro() {
		return this.nmPassageiro;
	}

	public void setNmPassageiro(String nmPassageiro) {
		this.nmPassageiro = nmPassageiro;
	}

	public Reserva getReserva() {
		return this.reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

}