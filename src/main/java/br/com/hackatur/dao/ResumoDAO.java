package br.com.hackatur.dao;

import br.com.hackatur.db.ConnectionFactory;
import br.com.hackatur.pojo.Resumo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ResumoDAO {

  public List<Resumo> findAll() {
    Connection con = ConnectionFactory.getConnection();
    Statement stmt = null;
    List<Resumo> resumos = new ArrayList<>();
    try {
      String sql = " select"
          + "  ins.cd_instituicao,"
          + "  ins.nm_instituicao,"
          + "  ins.cd_codigo_juridico,"
          + "  ins.cd_tipo_instituicao,"
          + "  ta.ds_tipo_instituicao,  "
          + "  ins.ds_email,"
          + "  ins.ds_info,"
          + "  decode(ins_end.id_tipo_endereco, 'C', 'Comercial', 'R', 'Residencial') tipo_endereco,"
          + "  ins_end.ds_logradouro,"
          + "  ins_end.nr_logradouro,"
          + "  ins_end.ds_complemento_logradouro,"
          + "  ins_end.nr_codigo_postal,"
          + "  pais.ds_pais,"
          + "  estado.ds_estado,"
          + "  cidade.ds_cidade,"
          + "  ins_fone.cd_instituicao,"
          + "  ins_fone.cd_sequencia,"
          + "  decode(ins_fone.id_tipo, 'C', 'Celular', 'R', 'Residencial') tipo_telefone,"
          + "  ins_fone.nr_ddi,"
          + "  ins_fone.nr_ddd,"
          + "  ins_fone.nr_telefone"
          + " from"
          + "  instituicao ins"
          + "  left outer join"
          + "    instituicao_endereco ins_end"
          + "  on ins.cd_instituicao = ins_end.cd_instituicao"
          + "  inner join"
          + "    pais"
          + "  on ins_end.cd_pais = pais.cd_pais"
          + "  inner join"
          + "    estado"
          + "  on ins_end.cd_pais = estado.cd_pais and"
          + "     ins_end.cd_estado = estado.cd_estado"
          + "  inner join"
          + "    cidade"
          + "  on ins_end.cd_pais = cidade.cd_pais and"
          + "     ins_end.cd_estado = cidade.cd_estado and"
          + "     ins_end.cd_cidade = cidade.cd_cidade  "
          + "  inner join"
          + "    tipo_instituicao ta"
          + "  on ins.cd_tipo_instituicao = ta.cd_tipo_instituicao  "
          + "  left outer join"
          + "    instituicao_fone ins_fone"
          + "  on ins.cd_instituicao = ins_fone.cd_instituicao"
          + " where"
          + "  ins_end.cd_cidade = 1 and"
          + "  ins_end.cd_estado = 1 and"
          + "  ins_end.cd_cidade = 1 ";

      stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(sql);

      while (rs.next()) {
        Resumo resumo = new Resumo();
        resumo.setCd_sequencia(rs.getString("cd_sequencia"));
        resumo.setCdCodigoJuridico(rs.getLong("cd_codigo_juridico"));
        resumo.setCdInstituicao(rs.getLong("cd_instituicao"));
        resumo.setCdTipoInstituicao(rs.getLong("cd_tipo_instituicao"));
        resumo.setTipoTelefone(rs.getString("tipo_telefone"));
        resumo.setNmInstituicao(rs.getString("nm_instituicao"));
        resumo.setDsCidade(rs.getString("ds_cidade"));
        resumo.setDsComplementoLogradouro(rs.getString("ds_complemento_logradouro"));
        resumo.setDsestado(rs.getString("ds_estado"));
        resumo.setDsPais(rs.getString("ds_pais"));
        resumo.setDsInfo(rs.getString("ds_info"));
        resumo.setNrCodigoPostal(rs.getString("nr_codigo_postal"));
        resumo.setNrDdd(rs.getString("nr_ddd"));
        resumo.setNrDdi(rs.getString("nr_ddi"));
        resumo.setNrLogradouro(rs.getString("nr_logradouro"));
        resumo.setDsLogradouro(rs.getString("ds_logradouro"));
        resumo.setNrTelefone(rs.getString("nr_telefone"));
        resumos.add(resumo);

      }
      rs.close();
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
    return resumos;
  }
}
