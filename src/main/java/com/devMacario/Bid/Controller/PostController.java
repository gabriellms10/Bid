package com.devMacario.Bid.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devMacario.Bid.Entitys.Post;
import com.devMacario.Bid.Service.PostService;

@RestController
@RequestMapping("/Posts")
public class PostController {
	@Autowired
	private PostService service;

	@GetMapping
	public List<Post> listar() {
		List<Post> Posts = service.listar();
		return Posts;
	}
}
