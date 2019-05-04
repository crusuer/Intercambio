package br.com.hackatur.service;

import br.com.hackatur.dao.AnfitriaoDAO;
import br.com.hackatur.entity.Anfitriao;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnfitriaoServiceImpl implements AnfitriaoService {

  @Autowired
  AnfitriaoDAO anfitriaoDAO;

  @Override
  public Anfitriao create(Anfitriao m) {
    Optional<Anfitriao> first = anfitriaoDAO.findById(m.getCdAnfitriao());
    if (!first.isPresent()) {
      return anfitriaoDAO.save(m);
    }
    return null;
  }

  @Override
  public Optional<Anfitriao> findOne(Long codigo) {
    return anfitriaoDAO.findById(codigo);
  }

  @Override
  public Iterable<Anfitriao> findAll() {
    return anfitriaoDAO.findAll();
  }

  @Override
  public Anfitriao update(Anfitriao m) {
    return anfitriaoDAO.save(m);
  }

  @Override
  public void delete(Long id) {
    anfitriaoDAO.deleteById(id);
  }
}