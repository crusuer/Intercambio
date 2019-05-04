package br.com.hackatur.dao;

import br.com.hackatur.db.ConnectionFactory;
import br.com.hackatur.pojo.Pedido;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoDAO {

  public void save(Pedido m) {
    Connection con = ConnectionFactory.getConnection();
    Statement stmt = null;
    try {
      String sql =
          " INSERT INTO Pedido (CD_PEDIDO, CD_CLIENTE, VL_PEDIDO, CD_STATUS) VALUES "
              + "( '" + m.getCdPedido() + "','" + m.getCdCliente() + "','"
              + m.getVlPedido() + "','" + m.getCdStatus() + "')";

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
