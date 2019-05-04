package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CLIENTE_ENDERECO database table.
 * 
 */
@Embeddable
public class ClienteEnderecoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_CLIENTE", insertable=false, updatable=false)
	private long cdCliente;

	@Column(name="CD_SEQUENCIA")
	private long cdSequencia;

	public ClienteEnderecoPK() {
	}
	public long getCdClienteEnd() {
		return this.cdCliente;
	}
	public void setCdClienteEnd(long cdCliente) {
		this.cdCliente = cdCliente;
	}
	public long getCdSequencia() {
		return this.cdSequencia;
	}
	public void setCdSequencia(long cdSequencia) {
		this.cdSequencia = cdSequencia;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClienteEnderecoPK)) {
			return false;
		}
		ClienteEnderecoPK castOther = (ClienteEnderecoPK)other;
		return 
			(this.cdCliente == castOther.cdCliente)
			&& (this.cdSequencia == castOther.cdSequencia);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdCliente ^ (this.cdCliente >>> 32)));
		hash = hash * prime + ((int) (this.cdSequencia ^ (this.cdSequencia >>> 32)));
		
		return hash;
	}
}