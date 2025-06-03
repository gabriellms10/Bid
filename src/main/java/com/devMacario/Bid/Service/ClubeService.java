package com.devMacario.Bid.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devMacario.Bid.Entitys.Clube;
import com.devMacario.Bid.Repository.ClubeRepository;

@Service
public class ClubeService {
	
	@Autowired
private ClubeRepository repository;
	
	public List<Clube> listar(){
		List<Clube> Clubes = repository.findAll();	
		return Clubes;
	}
	
	public Clube buscarPorId(Long id) {
		
		try {
			Optional<Clube> clube = repository.findById(id);
			return clube.orElse(null);
		} catch (Exception e) {
			System.out.println("Não Existe Clube cadastrado com este Id " + e.getMessage());
			return null;
			}
	}
	
	// METÓDO PARA SALVAR CLUBE
	@Transactional
	public Clube salvar(Clube clube) {
		
		return repository.save(clube);
	}
	
	// METÓDO PARA ATUALIZAR UM CLUBE
	
	public Clube atualizar(Long id, Clube dadosAtualizados) {
		
		try {
			
			Clube clubeExistente = buscarPorId(id);
				
			if (clubeExistente != null) {
					
				clubeExistente.setNome(dadosAtualizados.getNome());
						
				clubeExistente.setEstado(dadosAtualizados.getEstado());
						
				return repository.save(clubeExistente); 
						
		} return null;
		
		} catch (Exception e) {
			
			System.out.println("Erro ao Atualizar Clube: " + e.getMessage());
				
			return null;
		}
	}
	
	// METÓDO PARA DELETAR UM CLUBE
	
	public void deletar(Long id) {
		
		try {
			repository.deleteById(id);
			
		} catch (Exception e) {
			
			System.out.println("Erro ao deletar clube :" + e.getMessage());
		}
	}
	
	
	
	
}
