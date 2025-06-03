package com.devMacario.Bid.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devMacario.Bid.Entitys.Post;
import com.devMacario.Bid.Repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public List<Post> listar(){
		List<Post> posters = repository.findAll();	
		return posters;
	}
	
	public Post buscarPorId(Long id) {
		
		try {
			Optional<Post> post = repository.findById(id);
			return post.orElse(null);
		} catch (Exception e) {
			System.out.println("Não Existe um Poster cadastrado com este Id " + e.getMessage());
			return null;
			}
	}
	
	// METÓDO PARA SALVAR UM POSTER
	@Transactional
	public Post salvar(Post post) {
		
		return repository.save(post);
	}
	
	// METÓDO PARA ATUALIZAR UM USUÁRIO
	
	public Post atualizar(Long id, Post dadosAtualizados) {
		
		try {
			
		 Post postExistente = buscarPorId(id);
				
			if (postExistente != null) {
					
				postExistente.setAtleta(dadosAtualizados.getAtleta());
										
				postExistente.setData_publicada(dadosAtualizados.getData_publicada());
				
				postExistente.setTipo_contrato(dadosAtualizados.getTipo_contrato());
				
				return repository.save(postExistente); 
						
		} return null;
		
		} catch (Exception e) {
			
			System.out.println("Erro ao Atualizar Post: " + e.getMessage());
				
			return null;
		}
	}
	
	// METÓDO PARA DELETAR UM POST
	
	public void deletarPost(Long id) {
		
		try {
			repository.deleteById(id);
			
		} catch (Exception e) {
			
			System.out.println("Erro ao deletar Um Post :" + e.getMessage());
		}
	}
	
	
	
	
}
