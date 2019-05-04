package br.com.hackatur.dao;

import br.com.hackatur.entity.Instituicao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituicaoDAO extends CrudRepository<Instituicao, Long> {

}
