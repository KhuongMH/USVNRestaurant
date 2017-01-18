package com.khuongtest.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface AbstractDAO<T> {
	public List<T> findAll();

	public T find(int id);

	public void create(T item);

	public void edit(T item);

	public void delete(T item);
}
