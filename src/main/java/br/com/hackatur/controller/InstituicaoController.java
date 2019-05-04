package br.com.hackatur.controller;

import br.com.hackatur.entity.Instituicao;
import br.com.hackatur.service.InstituicaoServiceImpl;
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
public class InstituicaoController {
  @Autowired
  InstituicaoServiceImpl instituicaoService;

  @GetMapping(value = "/instituicao/read/{codigo}")
  public Optional<Instituicao> read(@PathVariable("codigo") Long codigo) {
    return instituicaoService.findOne(codigo);
  }

  @GetMapping(value = "/instituicao/readAll")
  public Iterable<Instituicao> readAll() {
    return instituicaoService.findAll();
  }

  @PostMapping(value = "/instituicao/create")
  public Instituicao create(@Valid @RequestBody Instituicao m) {
    return instituicaoService.create(m);
  }

  @PutMapping(value = "/instituicao/update")
  public Instituicao update(@Valid @RequestBody Instituicao m) {
    return instituicaoService.update(m);
  }

  @DeleteMapping(value = "/instituicao/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
    instituicaoService.delete(id);
  }
}
