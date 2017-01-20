package com.khuongtest.model;
// Generated Jan 19, 2017 3:15:39 PM by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Food generated by hbm2java
 */
@Entity
@Table(name = "food", catalog = "usvnrestaurants")
public class Food implements java.io.Serializable {

	private Integer idfood;
	private String name;
	private String description;
	private String imageurl;
	private String type;
	private String from;
	private Integer status;
	private Set<Fooddetails> fooddetailses = new HashSet<Fooddetails>(0);

	public Food() {
	}

	public Food(String name, String description, String imageurl, String type, String from, Integer status,
			Set<Fooddetails> fooddetailses) {
		this.name = name;
		this.description = description;
		this.imageurl = imageurl;
		this.type = type;
		this.from = from;
		this.status = status;
		this.fooddetailses = fooddetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idfood", unique = true, nullable = false)
	public Integer getIdfood() {
		return this.idfood;
	}

	public void setIdfood(Integer idfood) {
		this.idfood = idfood;
	}

	@Column(name = "name", length = 1000)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 1000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "imageurl", length = 1000)
	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Column(name = "type", length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "from", length = 45)
	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "food")
	public Set<Fooddetails> getFooddetailses() {
		return this.fooddetailses;
	}

	public void setFooddetailses(Set<Fooddetails> fooddetailses) {
		this.fooddetailses = fooddetailses;
	}

}
