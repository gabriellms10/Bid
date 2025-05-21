package com.devMacario.Bid.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devMacario.Bid.Entitys.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
