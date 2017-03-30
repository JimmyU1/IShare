package com.ljn.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ownership entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ownership", catalog = "ishare")
public class Ownership implements java.io.Serializable {

	// Fields

	private String ownershipId;
	private User user;
	private Basebook basebook;
	private Boolean isReturn;
	private Timestamp gmtCreate;
	private Timestamp gmtUpdate;
	private Set<Borrow> borrows = new HashSet<Borrow>(0);

	// Constructors

	/** default constructor */
	public Ownership() {
	}

	/** minimal constructor */
	public Ownership(String ownershipId) {
		this.ownershipId = ownershipId;
	}

	/** full constructor */
	public Ownership(String ownershipId, User user, Basebook basebook,
			Boolean isReturn, Timestamp gmtCreate, Timestamp gmtUpdate,
			Set<Borrow> borrows) {
		this.ownershipId = ownershipId;
		this.user = user;
		this.basebook = basebook;
		this.isReturn = isReturn;
		this.gmtCreate = gmtCreate;
		this.gmtUpdate = gmtUpdate;
		this.borrows = borrows;
	}

	// Property accessors
	@Id
	@Column(name = "ownership_id", unique = true, nullable = false, length = 32)
	public String getOwnershipId() {
		return this.ownershipId;
	}

	public void setOwnershipId(String ownershipId) {
		this.ownershipId = ownershipId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id")
	public Basebook getBasebook() {
		return this.basebook;
	}

	public void setBasebook(Basebook basebook) {
		this.basebook = basebook;
	}

	@Column(name = "is_return")
	public Boolean getIsReturn() {
		return this.isReturn;
	}

	public void setIsReturn(Boolean isReturn) {
		this.isReturn = isReturn;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ownership")
	public Set<Borrow> getBorrows() {
		return this.borrows;
	}

	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}

}