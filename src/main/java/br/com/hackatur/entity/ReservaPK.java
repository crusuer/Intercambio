package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the RESERVA database table.
 * 
 */
@Embeddable
public class ReservaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_PEDIDO", insertable=false, updatable=false)
	private long cdPedido;

	@Column(name="CD_RESERVA")
	private long cdReserva;

	public ReservaPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReservaPK)) {
			return false;
		}
		ReservaPK castOther = (ReservaPK)other;
		return 
			(this.cdPedido == castOther.cdPedido)
			&& (this.cdReserva == castOther.cdReserva);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdPedido ^ (this.cdPedido >>> 32)));
		hash = hash * prime + ((int) (this.cdReserva ^ (this.cdReserva >>> 32)));
		
		return hash;
	}
}