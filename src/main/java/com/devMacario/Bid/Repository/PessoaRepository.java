package com.devMacario.Bid.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devMacario.Bid.Entitys.Pessoa;
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
