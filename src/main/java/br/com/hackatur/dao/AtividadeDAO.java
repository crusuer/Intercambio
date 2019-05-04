package br.com.hackatur.dao;

import br.com.hackatur.entity.Atividade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeDAO extends CrudRepository<Atividade, Long> {

}
