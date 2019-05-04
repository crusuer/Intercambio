package br.com.hackatur.dao;

import br.com.hackatur.db.ConnectionFactory;
import br.com.hackatur.pojo.Reserva;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.stereotype.Repository;

@Repository
public class ReservaDAO {

  public void save(Reserva m) {
    Connection con = ConnectionFactory.getConnection();
    Statement stmt = null;
    try {
      String sql =
          " insert into reserva( CD_INSTITUICAO,  CD_ANFITRIAO,  DT_SAIDA,  DT_CHEGADA,  VL_RESERVA,  DT_CRIACAO, DT_ATUALIZACAO) values "
              + "( '" + m.getCdInstituicao() + "','" + m.getCdAnfitriao() + "','"
              + m.getDtSaida() + "','" + m.getDtChegada() + "','" + m.getVlReserva() + "','" + m
              .getDtCriacao() + "','" + m.getDtAtualizacao() + "')";

      stmt = con.createStatement();
      stmt.executeUpdate(sql);

    } catch (SQLException e) {

      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        con.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }

    }
  }
}
