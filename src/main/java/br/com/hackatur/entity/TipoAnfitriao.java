package br.com.hackatur.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the TIPO_ANFITRIAO database table.
 */
@Entity
@Table(name = "TIPO_ANFITRIAO")
@NamedQuery(name = "TipoAnfitriao.findAll", query = "SELECT t FROM TipoAnfitriao t")
public class TipoAnfitriao implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "CD_TIPO_ANFITRIAO")
  private long cdTipoAnfitriao;

  @Column(name = "DS_TIPO_ANFITRIAO")
  private String dsTipoAnfitriao;

  @Column(name = "DT_ATUALIZACAO")
  private LocalDateTime dtAtualizacao;

  @Column(name = "DT_CRIACAO")
  private LocalDateTime dtCriacao;

  public TipoAnfitriao() {
  }

  public long getCdTipoAnfitriao() {
    return this.cdTipoAnfitriao;
  }

  public void setCdTipoAnfitriao(long cdTipoAnfitriao) {
    this.cdTipoAnfitriao = cdTipoAnfitriao;
  }

  public String getDsTipoAnfitriao() {
    return this.dsTipoAnfitriao;
  }

  public void setDsTipoAnfitriao(String dsTipoAnfitriao) {
    this.dsTipoAnfitriao = dsTipoAnfitriao;
  }

  public LocalDateTime getDtAtualizacao() {
    return this.dtAtualizacao;
  }

  public void setDtAtualizacao(LocalDateTime dtAtualizacao) {
    this.dtAtualizacao = dtAtualizacao;
  }

  public LocalDateTime getDtCriacao() {
    return this.dtCriacao;
  }

  public void setDtCriacao(LocalDateTime dtCriacao) {
    this.dtCriacao = dtCriacao;
  }

}