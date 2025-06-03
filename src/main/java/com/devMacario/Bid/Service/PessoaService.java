package com.devMacario.Bid.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devMacario.Bid.Entitys.Pessoa;
import com.devMacario.Bid.Repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> listar(){
		List<Pessoa> pessoas = repository.findAll();	
		return pessoas;
	}
	
	public Pessoa buscarPorId(Long id) {
		
		try {
			Optional<Pessoa> pessoas = repository.findById(id);
			return pessoas.orElse(null);
		} catch (Exception e) {
			System.out.println("Não Existe um Usuário cadastrado com este Id " + e.getMessage());
			return null;
			}
	}
	
	// METÓDO PARA SALVAR UM USUÁRIO
	@Transactional
	public Pessoa salvar(Pessoa pessoa) {
		
		return repository.save(pessoa);
	}
	
	// METÓDO PARA ATUALIZAR UM USUÁRIO
	
	public Pessoa atualizar(Long id, Pessoa dadosAtualizados) {
		
		try {
			
		 Pessoa pessoaExistente = buscarPorId(id);
				
			if (pessoaExistente != null) {
					
				pessoaExistente.setNome(dadosAtualizados.getNome());
						
				pessoaExistente.setNascimento(dadosAtualizados.getNascimento());
						
				return repository.save(pessoaExistente); 
						
		} return null;
		
		} catch (Exception e) {
			
			System.out.println("Erro ao Atualizar Pessoa: " + e.getMessage());
				
			return null;
		}
	}
	
	// METÓDO PARA DELETAR UM USUÁRIO
	
	public void deletarPessoa(Long id) {
		
		try {
			repository.deleteById(id);
			
		} catch (Exception e) {
			
			System.out.println("Erro ao deletar Um Usuário :" + e.getMessage());
		}
	}
	
	
	
	
}
