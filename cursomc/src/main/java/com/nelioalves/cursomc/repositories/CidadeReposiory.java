package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.entities.Cidade;

@Repository
public interface CidadeReposiory extends JpaRepository<Cidade, Integer>{

}
