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

import com.devMacario.Bid.Entitys.Post;
import com.devMacario.Bid.Service.PostService;

@RestController
@RequestMapping("/posters")
public class PostController {
	
	@Autowired
	private PostService service;
	
	@GetMapping
	public List<Post> listar() {
		List<Post> posters = service.listar();
		return posters;
	}
	
	@GetMapping("/{id}")
	public Post buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	
	@PostMapping
	public Post criarPost(@RequestBody Post post) {
		
		return service.salvar(post);
	}
	
	@PutMapping("/{id}")
	public Post atualizarPost(@PathVariable Long id, @RequestBody Post post) {
		
		return service.atualizar(id, post);
		
	}
	
	@DeleteMapping("/{id}")
	public void deletarPost(@PathVariable Long id) {
		
		service.deletarPost(id);
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

