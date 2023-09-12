package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {

}
