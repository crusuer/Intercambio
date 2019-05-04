package br.com.hackatur.controller;

import br.com.hackatur.entity.TipoAnfitriao;
import br.com.hackatur.service.TipoAnfitriaoServiceImpl;
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
public class TipoAnfitriaoController {

  @Autowired
  TipoAnfitriaoServiceImpl tipoAnfitriaoService;

  @GetMapping(value = "/tipoAnfitriao/read/{codigo}")
  public Optional<TipoAnfitriao> read(@PathVariable("codigo") Long codigo) {
    return tipoAnfitriaoService.findOne(codigo);
  }

  @GetMapping(value = "/tipoAnfitriao/readAll")
  public Iterable<TipoAnfitriao> readAll() {
    return tipoAnfitriaoService.findAll();
  }

  @PostMapping(value = "/tipoAnfitriao/create")
  public TipoAnfitriao create(@Valid @RequestBody TipoAnfitriao m) {
    return tipoAnfitriaoService.create(m);
  }

  @PutMapping(value = "/tipoAnfitriao/update")
  public TipoAnfitriao update(@Valid @RequestBody TipoAnfitriao m) {
    return tipoAnfitriaoService.update(m);
  }

  @DeleteMapping(value = "/tipoAnfitriao/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
    tipoAnfitriaoService.delete(id);
  }

}
