package com.devMacario.Bid.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	
	
}
