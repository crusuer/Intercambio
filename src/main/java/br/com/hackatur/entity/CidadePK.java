package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CIDADE database table.
 * 
 */
@Embeddable
public class CidadePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_PAIS", insertable=false, updatable=false)
	private long cdPais;

	@Column(name="CD_ESTADO", insertable=false, updatable=false)
	private long cdEstado;

	@Column(name="CD_CIDADE")
	private long cdCidade;

	public CidadePK() {
	}
	public long getCdPais() {
		return this.cdPais;
	}
	public void setCdPais(long cdPais) {
		this.cdPais = cdPais;
	}
	public long getCdEstado() {
		return this.cdEstado;
	}
	public void setCdEstado(long cdEstado) {
		this.cdEstado = cdEstado;
	}
	public long getCdCidade() {
		return this.cdCidade;
	}
	public void setCdCidade(long cdCidade) {
		this.cdCidade = cdCidade;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CidadePK)) {
			return false;
		}
		CidadePK castOther = (CidadePK)other;
		return 
			(this.cdPais == castOther.cdPais)
			&& (this.cdEstado == castOther.cdEstado)
			&& (this.cdCidade == castOther.cdCidade);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdPais ^ (this.cdPais >>> 32)));
		hash = hash * prime + ((int) (this.cdEstado ^ (this.cdEstado >>> 32)));
		hash = hash * prime + ((int) (this.cdCidade ^ (this.cdCidade >>> 32)));
		
		return hash;
	}
}