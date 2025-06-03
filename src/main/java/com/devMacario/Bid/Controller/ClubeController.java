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

import com.devMacario.Bid.Entitys.Clube;
import com.devMacario.Bid.Service.ClubeService;

@RestController
@RequestMapping("/clubes")
public class ClubeController {
	@Autowired
	private ClubeService service;
	
	@GetMapping
	public List<Clube> listar() {
		List<Clube> Clubes = service.listar();
		return Clubes;
	}
	
	@GetMapping("/{id}")
	public Clube buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	
	@PostMapping
	public Clube criarClube(@RequestBody Clube clube) {
		
		return service.salvar(clube);
	}
	
	@PutMapping("/{id}")
	public Clube atualizarClube(@PathVariable Long id, @RequestBody Clube clube) {
		
		return service.atualizar(id, clube);
		
	}
	
	@DeleteMapping("/{id}")
	public void deletarClube(@PathVariable Long id) {
		
		service.deletar(id);
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

