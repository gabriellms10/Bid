package com.devMacario.Bid.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devMacario.Bid.Entitys.Pessoa;
import com.devMacario.Bid.Service.PessoaService;


@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	@Autowired
	private PessoaService service;

	@GetMapping
	public List<Pessoa> listar() {
		List<Pessoa> Pessoas = service.listar();
		return Pessoas;
	}
	
	

}


