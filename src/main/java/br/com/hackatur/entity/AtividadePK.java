package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ATIVIDADE database table.
 * 
 */
@Embeddable
public class AtividadePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_ATIVIDADE")
	private long cdAtividade;

	@Column(name="NR_ORDEM")
	private long nrOrdem;

	@Column(name="CD_INSTITUICAO", insertable=false, updatable=false)
	private long cdInstituicao;

	public AtividadePK() {
	}
	public long getCdAtividade() {
		return this.cdAtividade;
	}
	public void setCdAtividade(long cdAtividade) {
		this.cdAtividade = cdAtividade;
	}
	public long getNrOrdem() {
		return this.nrOrdem;
	}
	public void setNrOrdem(long nrOrdem) {
		this.nrOrdem = nrOrdem;
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
		if (!(other instanceof AtividadePK)) {
			return false;
		}
		AtividadePK castOther = (AtividadePK)other;
		return 
			(this.cdAtividade == castOther.cdAtividade)
			&& (this.nrOrdem == castOther.nrOrdem)
			&& (this.cdInstituicao == castOther.cdInstituicao);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdAtividade ^ (this.cdAtividade >>> 32)));
		hash = hash * prime + ((int) (this.nrOrdem ^ (this.nrOrdem >>> 32)));
		hash = hash * prime + ((int) (this.cdInstituicao ^ (this.cdInstituicao >>> 32)));
		
		return hash;
	}
}