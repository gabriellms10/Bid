package com.devMacario.Bid.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/{id}")
	public Pessoa buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	
	@PostMapping
	public Pessoa criarPessoa(@RequestBody Pessoa Pessoa) {
		
		return service.salvar(Pessoa);
	}
	
	@PutMapping("/{id}")
	public Pessoa atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa Pessoa) {
		
		return service.atualizar(id, Pessoa);
		
	}
	
	@DeleteMapping("/{id}")
	public void deletarPessoa(@PathVariable Long id) {
		
		service.deletarPessoa(id);
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

