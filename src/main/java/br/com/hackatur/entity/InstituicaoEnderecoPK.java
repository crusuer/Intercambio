package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the INSTITUICAO_ENDERECO database table.
 * 
 */
@Embeddable
public class InstituicaoEnderecoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_INSTITUICAO", insertable=false, updatable=false)
	private long cdInstituicao;

	@Column(name="CD_SEQUENCIA")
	private long cdSequencia;

	public InstituicaoEnderecoPK() {
	}
	public long getCdInstituicao() {
		return this.cdInstituicao;
	}
	public void setCdInstituicao(long cdInstituicao) {
		this.cdInstituicao = cdInstituicao;
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
		if (!(other instanceof InstituicaoEnderecoPK)) {
			return false;
		}
		InstituicaoEnderecoPK castOther = (InstituicaoEnderecoPK)other;
		return 
			(this.cdInstituicao == castOther.cdInstituicao)
			&& (this.cdSequencia == castOther.cdSequencia);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdInstituicao ^ (this.cdInstituicao >>> 32)));
		hash = hash * prime + ((int) (this.cdSequencia ^ (this.cdSequencia >>> 32)));
		
		return hash;
	}
}