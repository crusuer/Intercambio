package br.com.hackatur.service;

import br.com.hackatur.dao.ResumoDAO;
import br.com.hackatur.pojo.Resumo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumoServiceImpl implements ResumoService {

  @Autowired
  ResumoDAO resumoDAO;

  @Override
  public List<Resumo> findAll() {
    return resumoDAO.findAll();
  }
}
