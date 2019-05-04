package br.com.hackatur.service;

import br.com.hackatur.dao.TipoAnfitriaoDAO;
import br.com.hackatur.entity.TipoAnfitriao;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoAnfitriaoServiceImpl implements TipoAnfitriaoService {

  @Autowired
  TipoAnfitriaoDAO tipoAnfitriaoDAO;

  @Override
  public TipoAnfitriao create(TipoAnfitriao tipoAnfitriao) {
    Optional<TipoAnfitriao> first = tipoAnfitriaoDAO.findById(tipoAnfitriao.getCdTipoAnfitriao());
    if (!first.isPresent()) {
      return tipoAnfitriaoDAO.save(tipoAnfitriao);
    }
    return null;
  }

  @Override
  public Optional<TipoAnfitriao> findOne(Long codigo) {
    return tipoAnfitriaoDAO.findById(codigo);
  }

  @Override
  public Iterable<TipoAnfitriao> findAll() {
    return tipoAnfitriaoDAO.findAll();
  }

  @Override
  public TipoAnfitriao update(TipoAnfitriao m) {
    return tipoAnfitriaoDAO.save(m);
  }

  @Override
  public void delete(Long id) {
    tipoAnfitriaoDAO.deleteById(id);
  }
}
