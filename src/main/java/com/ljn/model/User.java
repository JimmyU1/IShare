package com.ljn.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "ishare")
public class User implements java.io.Serializable {

	// Fields

	private String id;
	private String userId;
	private String userName;
	private String password;
	private String company;
	private String department;
	private String telephone;
	private String phone;
	private Boolean isAffirm;
	private Timestamp gmtCreate;
	private Timestamp gmtUpdate;
	private Set<Borrow> borrows = new HashSet<Borrow>(0);
	private Set<Review> reviews = new HashSet<Review>(0);
	private Set<Ownership> ownerships = new HashSet<Ownership>(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String id) {
		this.id = id;
	}

	/** full constructor */
	public User(String id, String userId, String userName, String password,
			String company, String department, String telephone, String phone,
			Boolean isAffirm, Timestamp gmtCreate, Timestamp gmtUpdate,
			Set<Borrow> borrows, Set<Review> reviews, Set<Ownership> ownerships) {
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.company = company;
		this.department = department;
		this.telephone = telephone;
		this.phone = phone;
		this.isAffirm = isAffirm;
		this.gmtCreate = gmtCreate;
		this.gmtUpdate = gmtUpdate;
		this.borrows = borrows;
		this.reviews = reviews;
		this.ownerships = ownerships;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "user_id", length = 40)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "user_name", length = 40)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", length = 32)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "company", length = 40)
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column(name = "department", length = 100)
	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "telephone", length = 10)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "phone", length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "is_affirm")
	public Boolean getIsAffirm() {
		return this.isAffirm;
	}

	public void setIsAffirm(Boolean isAffirm) {
		this.isAffirm = isAffirm;
	}

	@Column(name = "gmt_create", length = 19)
	public Timestamp getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Timestamp gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	@Column(name = "gmt_update", length = 19)
	public Timestamp getGmtUpdate() {
		return this.gmtUpdate;
	}

	public void setGmtUpdate(Timestamp gmtUpdate) {
		this.gmtUpdate = gmtUpdate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Borrow> getBorrows() {
		return this.borrows;
	}

	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Ownership> getOwnerships() {
		return this.ownerships;
	}

	public void setOwnerships(Set<Ownership> ownerships) {
		this.ownerships = ownerships;
	}

}