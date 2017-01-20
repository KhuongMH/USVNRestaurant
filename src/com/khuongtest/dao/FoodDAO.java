package com.khuongtest.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.khuongtest.model.Account;
import com.khuongtest.model.Food;

@Repository
@Transactional
public class FoodDAO implements AbstractDAO<Food> {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Food> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Food.class).list();
	}

	@Override
	public Food find(int id) {
		return (Food) sessionFactory.getCurrentSession().createCriteria(Account.class)
				.add(Restrictions.eq("idfood", id));
	}

	@Override
	public void create(Food item) {
		try {
			sessionFactory.getCurrentSession().persist(item);
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public void edit(Food item) {
		try {
			sessionFactory.getCurrentSession().merge(item);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(Food item) {
		try {
			sessionFactory.getCurrentSession().delete(item);
		} catch (Exception e) {
			throw e;
		}
	}

}
