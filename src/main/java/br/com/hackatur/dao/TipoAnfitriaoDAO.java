package br.com.hackatur.dao;

import br.com.hackatur.entity.TipoAnfitriao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoAnfitriaoDAO extends CrudRepository<TipoAnfitriao, Long> {

}
