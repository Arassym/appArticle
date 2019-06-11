package com.inti.formation.imetier;

import java.util.List;

public interface IGenericMetier<A,I> {

	public A ajouter(A a);
	public A update(A a);
	public void delete (I id);
	public A findOne(I id);
	public List<A> findAll();

}