package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the IDIOMA_INSTITUICAO database table.
 * 
 */
@Embeddable
public class IdiomaInstituicaoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_IDIOMA", insertable=false, updatable=false)
	private long cdIdioma;

	@Column(name="CD_INSTITUICAO", insertable=false, updatable=false)
	private long cdInstituicao;

	public IdiomaInstituicaoPK() {
	}
	public long getCdIdioma() {
		return this.cdIdioma;
	}
	public void setCdIdioma(long cdIdioma) {
		this.cdIdioma = cdIdioma;
	}
	public long getCdInstituicao() {
		return this.cdInstituicao;
	}
	public void setCdInstituicao(long cdInstituicao) {
		this.cdInstituicao = cdInstituicao;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IdiomaInstituicaoPK)) {
			return false;
		}
		IdiomaInstituicaoPK castOther = (IdiomaInstituicaoPK)other;
		return 
			(this.cdIdioma == castOther.cdIdioma)
			&& (this.cdInstituicao == castOther.cdInstituicao);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdIdioma ^ (this.cdIdioma >>> 32)));
		hash = hash * prime + ((int) (this.cdInstituicao ^ (this.cdInstituicao >>> 32)));
		
		return hash;
	}
}