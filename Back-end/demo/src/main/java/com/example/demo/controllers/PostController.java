package com.example.demo.controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Post;
import com.example.demo.repository.PostRepository;
import com.example.demo.requestsDTO.PostCreateRequest;
import com.example.demo.requestsDTO.PostUpdateRequest;
import com.example.demo.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	PostService postService;
	
	public PostController(PostService postService)
	{
		this.postService=postService;
	}
	
	
	@GetMapping
	public List<Post> getAllPosts(@RequestParam Optional<Long> userId)
	{
		return postService.getAllPosts(userId);
		
	}
	
	
	
	@PostMapping
	public Post createOnePost(@RequestBody PostCreateRequest newPostRequest)
	{
		return postService.createOnePost(newPostRequest);
	}
	
	
	
	
	@GetMapping("/{postId}")
	public Post getOnePost(@PathVariable Long postId)
	{
		return postService.getOnePostById(postId);
	}
	
	@PutMapping("/{postId}")
	public Post updateOnePost(@PathVariable Long postId,@RequestBody PostUpdateRequest updatePost)
	{
		return postService.updateOnePostId(postId,updatePost);
	}
	
	@DeleteMapping("/{postId}")
	public void deleteOnePost(@PathVariable Long postId)
	{
		postService.deleteOnePostById(postId);
	}
	
	
}
