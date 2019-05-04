package br.com.hackatur.service;

import br.com.hackatur.dao.AtividadeDAO;
import br.com.hackatur.entity.Atividade;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtividadeServiceImpl implements AtividadeService {

  @Autowired
  AtividadeDAO atividadeDAO;

  @Override
  public Atividade create(Atividade m) {
    Optional<Atividade> first = atividadeDAO.findById(m.getId().getCdAtividade());
    if (!first.isPresent()) {
      return atividadeDAO.save(m);
    }
    return null;
  }

  @Override
  public Optional<Atividade> findOne(Long codigo) {
    return atividadeDAO.findById(codigo);
  }

  @Override
  public Iterable<Atividade> findAll() {
    return atividadeDAO.findAll();
  }

  @Override
  public Atividade update(Atividade m) {
    return atividadeDAO.save(m);
  }

  @Override
  public void delete(Long id) {
    atividadeDAO.deleteById(id);
  }

}
