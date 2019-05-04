package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ANFITRIAO_ENDERECO database table.
 * 
 */
@Embeddable
public class AnfitriaoEnderecoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_ANFITRIAO", insertable=false, updatable=false)
	private long cdAnfitriao;

	@Column(name="CD_SEQUENCIA")
	private long cdSequencia;

	public AnfitriaoEnderecoPK() {
	}
	public long getCdAnfitriao() {
		return this.cdAnfitriao;
	}
	public void setCdAnfitriao(long cdAnfitriao) {
		this.cdAnfitriao = cdAnfitriao;
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
		if (!(other instanceof AnfitriaoEnderecoPK)) {
			return false;
		}
		AnfitriaoEnderecoPK castOther = (AnfitriaoEnderecoPK)other;
		return 
			(this.cdAnfitriao == castOther.cdAnfitriao)
			&& (this.cdSequencia == castOther.cdSequencia);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdAnfitriao ^ (this.cdAnfitriao >>> 32)));
		hash = hash * prime + ((int) (this.cdSequencia ^ (this.cdSequencia >>> 32)));
		
		return hash;
	}
}