package com.devMacario.Bid.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devMacario.Bid.Entitys.Post;
import com.devMacario.Bid.Repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	
	public List<Post> listar(){
		List<Post> Posts = repository.findAll();
		return Posts;
	}
	
}
