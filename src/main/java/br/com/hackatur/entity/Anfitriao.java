package br.com.hackatur.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Anfitriao {

  @Id
  @Column
  private Long cdAnfitriao;
  @Column
  private String cdCodigoJuridico;
  @ManyToOne
  @JoinColumn(name = "cd_tipo_anfitriao")
  private TipoAnfitriao tipoAnfitriao;
  @Column
  private LocalDateTime dtAtualizacao;
  @Column
  private LocalDateTime dtCriacao;
  @Column
  private String idTipoPessoa;
  @Column
  private String nmAnfitriao;

  public Long getCdAnfitriao() {
    return cdAnfitriao;
  }

  public void setCdAnfitriao(Long cdAnfitriao) {
    this.cdAnfitriao = cdAnfitriao;
  }

  public String getCdCodigoJuridico() {
    return cdCodigoJuridico;
  }

  public void setCdCodigoJuridico(String cdCodigoJuridico) {
    this.cdCodigoJuridico = cdCodigoJuridico;
  }

  public TipoAnfitriao getCdTipoAnfitriao() {
    return tipoAnfitriao;
  }

  public void setCdTipoAnfitriao(TipoAnfitriao tipoAnfitriao) {
    this.tipoAnfitriao = tipoAnfitriao;
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

  public String getIdTipoPessoa() {
    return idTipoPessoa;
  }

  public void setIdTipoPessoa(String idTipoPessoa) {
    this.idTipoPessoa = idTipoPessoa;
  }

  public String getNmAnfitriao() {
    return nmAnfitriao;
  }

  public void setNmAnfitriao(String nmAnfitriao) {
    this.nmAnfitriao = nmAnfitriao;
  }
}
