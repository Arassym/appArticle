package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.imetier.IArticleMetier;
import com.inti.formation.model.Article;

@RestController
@RequestMapping("/apiArticle")
public class ArticleRestController {

	@Autowired
	private IArticleMetier metier;
	
	public IArticleMetier getMetier() {
		return metier;
	}

	public void setMetier(IArticleMetier metier) {
		this.metier = metier;
	}

	@RequestMapping(value="/articles", method=RequestMethod.GET)
	public List<Article> findAll(){
		return metier.findAll();
	}
	
	@RequestMapping(value="/personne/{id}", method=RequestMethod.GET)
	public Article findOne(int id) {
		return metier.findOne(id);
	}
	
	@RequestMapping(value="/ajouterA", method=RequestMethod.POST)
	public Article ajouter(Article a) {
		return metier.ajouter(a);
	}
	
	@RequestMapping(value="/updateA", method=RequestMethod.POST)
	public Article update(Article a ) {
		return metier.update(a);
	}
	

}
