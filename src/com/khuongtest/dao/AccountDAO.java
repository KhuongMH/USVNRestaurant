package com.khuongtest.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.khuongtest.model.Account;

@Repository
public class AccountDAO implements AbstractDAO<Account> {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Account> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Account.class).list();
	}

	@Override
	public Account find(int id) {
		return (Account) sessionFactory.getCurrentSession().createCriteria(Account.class)
				.add(Restrictions.eq("idAccount", id));
	}

	@Override
	public void create(Account account) {
		try {
			sessionFactory.getCurrentSession().persist(account);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void edit(Account account) {
		try {
			sessionFactory.getCurrentSession().merge(account);
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(Account account) {
		try {
			sessionFactory.getCurrentSession().delete(account);
		} catch (Exception e) {
			throw e;
		}
	}
}
