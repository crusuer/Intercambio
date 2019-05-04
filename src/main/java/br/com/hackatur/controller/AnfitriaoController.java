package br.com.hackatur.controller;

import br.com.hackatur.entity.Anfitriao;
import br.com.hackatur.service.AnfitriaoServiceimpl;
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
public class AnfitriaoController {

  @Autowired
  AnfitriaoServiceimpl anfitriaoService;

  @GetMapping(value = "/anfitriao/read/{codigo}")
  public Optional<Anfitriao> read(@PathVariable("codigo") Long codigo) {
    return anfitriaoService.findOne(codigo);
  }

  @GetMapping(value = "/anfitriao/readAll")
  public Iterable<Anfitriao> readAll() {
    return anfitriaoService.findAll();
  }

  @PostMapping(value = "/anfitriao/create")
  public Anfitriao create(@Valid @RequestBody Anfitriao m) {
    return anfitriaoService.create(m);
  }

  @PutMapping(value = "/anfitriao/update")
  public Anfitriao update(@Valid @RequestBody Anfitriao m) {
    return anfitriaoService.update(m);
  }

  @DeleteMapping(value = "/anfitriao/delete/{id}")
  public void delete(@PathVariable("id") Long id) {
    anfitriaoService.delete(id);
  }

}
