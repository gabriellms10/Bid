package com.devMacario.Bid.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devMacario.Bid.Entitys.Pessoa;
import com.devMacario.Bid.Repository.PessoaRepository;


@Service
public class PessoaService {


	@Autowired
	private PessoaRepository repository;

	public List<Pessoa> listar() {
		List<Pessoa> Pessoas = repository.findAll();
		return Pessoas;

	}

	
}


