package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the RESERVA_PASSAGEIRO database table.
 * 
 */
@Embeddable
public class ReservaPassageiroPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_PEDIDO", insertable=false, updatable=false)
	private long cdPedido;

	@Column(name="CD_RESERVA", insertable=false, updatable=false)
	private long cdReserva;

	@Column(name="CD_PASSAGEIRO")
	private long cdPassageiro;

	public ReservaPassageiroPK() {
	}
	public long getCdPedido() {
		return this.cdPedido;
	}
	public void setCdPedido(long cdPedido) {
		this.cdPedido = cdPedido;
	}
	public long getCdReserva() {
		return this.cdReserva;
	}
	public void setCdReserva(long cdReserva) {
		this.cdReserva = cdReserva;
	}
	public long getCdPassageiro() {
		return this.cdPassageiro;
	}
	public void setCdPassageiro(long cdPassageiro) {
		this.cdPassageiro = cdPassageiro;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReservaPassageiroPK)) {
			return false;
		}
		ReservaPassageiroPK castOther = (ReservaPassageiroPK)other;
		return 
			(this.cdPedido == castOther.cdPedido)
			&& (this.cdReserva == castOther.cdReserva)
			&& (this.cdPassageiro == castOther.cdPassageiro);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdPedido ^ (this.cdPedido >>> 32)));
		hash = hash * prime + ((int) (this.cdReserva ^ (this.cdReserva >>> 32)));
		hash = hash * prime + ((int) (this.cdPassageiro ^ (this.cdPassageiro >>> 32)));
		
		return hash;
	}
}