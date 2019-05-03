package br.com.hackatur.controller;

import br.com.hackatur.entity.Membro;
import br.com.hackatur.service.MembroServiceImpl;
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
public class MainController {

  @Autowired
  MembroServiceImpl membroService;

  @GetMapping(value = "/read/{usuario}")
  public Optional<Membro> read(@PathVariable("usuario") String usuario) {
    return membroService.findOne(usuario);
  }

  @GetMapping(value = "/readAll")
  public Iterable<Membro> read() {
    return membroService.findAll();
  }

  @PostMapping(value = "/create")
  public Membro create(@Valid @RequestBody Membro membro) {
    return membroService.create(membro);
  }

  @PutMapping(value = "/update")
  public Membro update(@Valid @RequestBody Membro membro) {
    return membroService.update(membro);
  }

  @DeleteMapping(value = "/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
    membroService.delete(id);
  }
}
