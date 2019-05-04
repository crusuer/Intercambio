package br.com.hackatur.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the RESPOSTA_PESQUISA_ANFITRIAO database table.
 * 
 */
@Embeddable
public class RespostaPesquisaAnfitriaoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CD_PESQUISA_SATISFACAO", insertable=false, updatable=false)
	private long cdPesquisaSatisfacao;

	@Column(name="CD_PERGUNTA", insertable=false, updatable=false)
	private long cdPergunta;

	@Column(name="CD_ANFITRIAO", insertable=false, updatable=false)
	private long cdAnfitriao;

	@Column(name="CD_CLIENTE", insertable=false, updatable=false)
	private long cdCliente;

	public RespostaPesquisaAnfitriaoPK() {
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
	public long getCdAnfitriao() {
		return this.cdAnfitriao;
	}
	public void setCdAnfitriao(long cdAnfitriao) {
		this.cdAnfitriao = cdAnfitriao;
	}
	public long getCdCliente() {
		return this.cdCliente;
	}
	public void setCdCliente(long cdCliente) {
		this.cdCliente = cdCliente;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RespostaPesquisaAnfitriaoPK)) {
			return false;
		}
		RespostaPesquisaAnfitriaoPK castOther = (RespostaPesquisaAnfitriaoPK)other;
		return 
			(this.cdPesquisaSatisfacao == castOther.cdPesquisaSatisfacao)
			&& (this.cdPergunta == castOther.cdPergunta)
			&& (this.cdAnfitriao == castOther.cdAnfitriao)
			&& (this.cdCliente == castOther.cdCliente);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cdPesquisaSatisfacao ^ (this.cdPesquisaSatisfacao >>> 32)));
		hash = hash * prime + ((int) (this.cdPergunta ^ (this.cdPergunta >>> 32)));
		hash = hash * prime + ((int) (this.cdAnfitriao ^ (this.cdAnfitriao >>> 32)));
		hash = hash * prime + ((int) (this.cdCliente ^ (this.cdCliente >>> 32)));
		
		return hash;
	}
}