package br.com.hackatur.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoAnfitriao {

  @Id
  @Column
  private Long cdTipoAnfitriao;
  @Column
  private String dsTipoAnfitriao;
  @Column
  private LocalDateTime dtAtualizacao;
  @Column
  private LocalDateTime dtCriacao;

  public Long getCdTipoAnfitriao() {
    return cdTipoAnfitriao;
  }

  public void setCdTipoAnfitriao(Long cdTipoAnfitriao) {
    this.cdTipoAnfitriao = cdTipoAnfitriao;
  }

  public String getDsTipoAnfitriao() {
    return dsTipoAnfitriao;
  }

  public void setDsTipoAnfitriao(String dsTipoAnfitriao) {
    this.dsTipoAnfitriao = dsTipoAnfitriao;
  }

  public LocalDateTime getDtAtualizacao() {
    return dtAtualizacao;
  }

  public void setDtAtualizacao(LocalDateTime dtAtualizacao) {
    this.dtAtualizacao = dtAtualizacao;
  }

  public LocalDateTime getDtCriacao() {
    return dtCriacao;
  }

  public void setDtCriacao(LocalDateTime dtCriacao) {
    this.dtCriacao = dtCriacao;
  }
}
