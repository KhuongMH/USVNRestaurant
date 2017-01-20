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
@Transactional
public class AccountDAO implements AbstractDAO<Account> {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
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

	public Account getAccountByUsernameAndPassword(String phone, String password) {
		Account account = (Account) sessionFactory.getCurrentSession().createQuery("from Account where phone = :phone and password = :password")
				.setParameter("phone", phone).setParameter("password", password).uniqueResult();
		return account;
	}
}
