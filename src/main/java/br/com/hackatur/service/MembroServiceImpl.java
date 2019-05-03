package br.com.hackatur.service;

import br.com.hackatur.entity.Membro;
import br.com.hackatur.repository.MembroRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembroServiceImpl implements MembroService {

  @Autowired
  MembroRepository membroRepository;

  @Override
  public Membro create(Membro m) {
    Optional<Membro> first = membroRepository.findByUsuario(m.getUsuario());
    if (!first.isPresent()) {
      return membroRepository.save(m);
    }
    return null;
  }

  @Override
  public Optional<Membro> findOne(String usuario) {
    return membroRepository.findByUsuario(usuario);
  }

  @Override
  public Iterable<Membro> findAll() {
    return membroRepository.findAll();
  }

  @Override
  public Membro update(Membro m) {
    return membroRepository.save(m);
  }

  @Override
  public void delete(Long id) {
    membroRepository.deleteById(id);
  }
}
