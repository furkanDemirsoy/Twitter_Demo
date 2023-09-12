package com.example.demo.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entities.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long> {

	
	
	List<Comment> findByUserIdAndPostId(Long userId,Long postId);

	List<Comment> findByUserId(Long userId);

	List<Comment> findByPostId(Long postId);

	

}
