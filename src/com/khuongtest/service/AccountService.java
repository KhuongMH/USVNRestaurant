package com.khuongtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khuongtest.dao.AccountDAO;
import com.khuongtest.model.Account;

@Service
public class AccountService implements AbstractService<Account>{

	@Autowired
	AccountDAO accountDAO;

	@Override
	public List<Account> findAll() {
		return accountDAO.findAll();
	}

	@Override
	public Account find(int id) {
		return accountDAO.find(id);
	}

	@Override
	public void create(Account item) {
		accountDAO.create(item);
	}

	@Override
	public void edit(Account item) {
		accountDAO.edit(item);
	}

	@Override
	public void delete(Account item) {
		accountDAO.delete(item);
	}

}
