package com.khuongtest.service;

import java.util.List;

public interface AbstractService<T> {
	
	public List<T> findAll();

	public T find(int id);

	public void create(T item);

	public void edit(T item);

	public void delete(T item);
}
