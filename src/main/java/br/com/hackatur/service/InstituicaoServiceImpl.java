package br.com.hackatur.service;

import br.com.hackatur.dao.InstituicaoDAO;
import br.com.hackatur.entity.Instituicao;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituicaoServiceImpl implements InstituicaoService {

  @Autowired
  InstituicaoDAO instituicaoDAO;

  @Override
  public Instituicao create(Instituicao m) {
    Optional<Instituicao> first = instituicaoDAO.findById(m.getCdInstituicao());
    if (!first.isPresent()) {
      return instituicaoDAO.save(m);
    }
    return null;
  }

  @Override
  public Optional<Instituicao> findOne(Long codigo) {
    return instituicaoDAO.findById(codigo);
  }

  @Override
  public Iterable<Instituicao> findAll() {
    return instituicaoDAO.findAll();
  }

  @Override
  public Instituicao update(Instituicao m) {
    return instituicaoDAO.save(m);
  }

  @Override
  public void delete(Long id) {
    instituicaoDAO.deleteById(id);
  }
}
