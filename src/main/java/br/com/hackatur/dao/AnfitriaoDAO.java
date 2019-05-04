package br.com.hackatur.dao;

import br.com.hackatur.entity.Anfitriao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnfitriaoDAO extends CrudRepository<Anfitriao, Long> {

}
