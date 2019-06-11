package com.inti.formation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private int id;
	private String titre;
	private String contenu;
	private String url;
	private Date parution;
	
	
	public Article() {
		super();
	}
	public Article(int id, String titre, String contenu, String url, Date parution) {
		super();
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.url = url;
		this.parution = parution;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getParution() {
		return parution;
	}
	public void setParution(Date parution) {
		this.parution = parution;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", titre=" + titre + ", contenu=" + contenu + ", url=" + url + ", parution="
				+ parution + "]";
	}
	
	
}
