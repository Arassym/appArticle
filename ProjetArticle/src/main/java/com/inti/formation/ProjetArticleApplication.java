package com.inti.formation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inti.formation.imetier.IArticleMetier;
import com.inti.formation.model.Article;

@SpringBootApplication
public class ProjetArticleApplication implements CommandLineRunner {

	@Autowired
	private IArticleMetier metier;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetArticleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Date d1 = new Date(1855, 01, 01);
		Date d2 = new Date(1785, 01, 01);
		Article a1 = new Article(1, "The Daily Telegraph", "Centre-droite, conservateur", "https://www.telegraph.co.uk/",d1 );
		Article a2 = new Article(2, "The Times", "Centre-droite, conservateur", "https://www.thetimes.co.uk/", d2);
		
//		metier.ajouter(a1);
//		metier.ajouter(a2);
		
//		a1.setContenu("Centre-droite");
//		System.out.println(metier.update(a1));
		
//		System.out.println(metier.findOne(1));
		List<Article> articles = metier.findAll();
		for (Article a: articles) {
			System.out.println(a);
		}
		
	}

}
