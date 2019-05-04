package br.com.hackatur.controller;

import br.com.hackatur.entity.Atividade;
import br.com.hackatur.service.AtividadeServiceImpl;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeController {
  @Autowired
  AtividadeServiceImpl atividadeService;

  @GetMapping(value = "/atividade/read/{codigo}")
  public Optional<Atividade> read(@PathVariable("codigo") Long codigo) {
    return atividadeService.findOne(codigo);
  }

  @GetMapping(value = "/atividade/readAll")
  public Iterable<Atividade> readAll() {
    return atividadeService.findAll();
  }

  @PostMapping(value = "/atividade/create")
  public Atividade create(@Valid @RequestBody Atividade m) {
    return atividadeService.create(m);
  }

  @PutMapping(value = "/atividade/update")
  public Atividade update(@Valid @RequestBody Atividade m) {
    return atividadeService.update(m);
  }

  @DeleteMapping(value = "/atividade/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
    atividadeService.delete(id);
  }
}
