package com.khuongtest.model;
// Generated Jan 17, 2017 4:41:58 PM by Hibernate Tools 5.2.0.CR

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account", catalog = "usvnrestaurants")
public class Account implements java.io.Serializable {

	private Integer idAccount;
	private Role role;
	private String phone;
	private String password;
	private Integer zipcode;
	private Set<Rate> rates = new HashSet<Rate>(0);

	public Account() {
	}

	public Account(Role role) {
		this.role = role;
	}

	public Account(Role role, String phone, String password, Integer zipcode, Set<Rate> rates) {
		this.role = role;
		this.phone = phone;
		this.password = password;
		this.zipcode = zipcode;
		this.rates = rates;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idAccount", unique = true, nullable = false)
	public Integer getIdAccount() {
		return this.idAccount;
	}

	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Role_idRole", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "phone", length = 15)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "zipcode")
	public Integer getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Rate> getRates() {
		return this.rates;
	}

	public void setRates(Set<Rate> rates) {
		this.rates = rates;
	}

}
