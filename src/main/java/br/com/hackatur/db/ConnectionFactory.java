package br.com.hackatur.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  public static Connection getConnection() {
    try {
      final String dbUrl = "jdbc:oracle:thin:@dbintercloud.c8irzbjuqu7a.us-east-2.rds.amazonaws.com:1521:ORCL";
      return DriverManager.getConnection(dbUrl,"sysinter", "InterTestHack");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}