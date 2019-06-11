package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.model.Article;

@Repository("arepo")
public interface IArticleRepository extends JpaRepository<Article, Integer> {

	
}
