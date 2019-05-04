package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PESQUISA_SATISFACAO database table.
 * 
 */
@Embeddable
public class PesquisaSatisfacaoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_PESQUISA_SATISFACAO")
	private long cdPesquisaSatisfacao;

	@Column(name="CD_PERGUNTA")
	private long cdPergunta;

	public PesquisaSatisfacaoPK() {
	}
	public long getCdPesquisaSatisfacao() {
		return this.cdPesquisaSatisfacao;
	}
	public void setCdPesquisaSatisfacao(long cdPesquisaSatisfacao) {
		this.cdPesquisaSatisfacao = cdPesquisaSatisfacao;
	}
	public long getCdPergunta() {
		return this.cdPergunta;
	}
	public void setCdPergunta(long cdPergunta) {
		this.cdPergunta = cdPergunta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PesquisaSatisfacaoPK)) {
			return false;
		}
		PesquisaSatisfacaoPK castOther = (PesquisaSatisfacaoPK)other;
		return 
			(this.cdPesquisaSatisfacao == castOther.cdPesquisaSatisfacao)
			&& (this.cdPergunta == castOther.cdPergunta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdPesquisaSatisfacao ^ (this.cdPesquisaSatisfacao >>> 32)));
		hash = hash * prime + ((int) (this.cdPergunta ^ (this.cdPergunta >>> 32)));
		
		return hash;
	}
}