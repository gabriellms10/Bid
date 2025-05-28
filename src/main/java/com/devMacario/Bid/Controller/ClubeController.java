package com.devMacario.Bid.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devMacario.Bid.Entitys.Clube;
import com.devMacario.Bid.Service.ClubeService;

@RestController
@RequestMapping("/Clubes")
public class ClubeController {
	@Autowired
	private ClubeService service;

	public List<Clube> listar() {
		List<Clube> Clubes = service.listar();
		return Clubes;
	}
}
