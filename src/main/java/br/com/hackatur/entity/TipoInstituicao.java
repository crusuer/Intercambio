package br.com.hackatur.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the TIPO_INSTITUICAO database table.
 */
@Entity
@Table(name = "TIPO_INSTITUICAO")
@NamedQuery(name = "TipoInstituicao.findAll", query = "SELECT t FROM TipoInstituicao t")
public class TipoInstituicao implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "CD_TIPO_INSTITUICAO")
  private long cdTipoInstituicao;

  @Column(name = "DS_TIPO_INSTITUICAO")
  private String dsTipoInstituicao;

  @Column(name = "DT_ATUALIZACAO")
  private LocalDateTime dtAtualizacao;

  @Column(name = "DT_CRIACAO")
  private LocalDateTime dtCriacao;


  public TipoInstituicao() {
  }

  public long getCdTipoInstituicao() {
    return this.cdTipoInstituicao;
  }

  public void setCdTipoInstituicao(long cdTipoInstituicao) {
    this.cdTipoInstituicao = cdTipoInstituicao;
  }

  public String getDsTipoInstituicao() {
    return this.dsTipoInstituicao;
  }

  public void setDsTipoInstituicao(String dsTipoInstituicao) {
    this.dsTipoInstituicao = dsTipoInstituicao;
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