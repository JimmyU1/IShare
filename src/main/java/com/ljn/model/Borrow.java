package com.ljn.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Borrow entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "borrow", catalog = "ishare")
public class Borrow implements java.io.Serializable {

	// Fields

	private String id;
	private User user;
	private Ownership ownership;
	private Date beginDate;
	private Date returnDate;
	private Boolean isAffirm;
	private Timestamp gmtCreate;
	private Timestamp gmtUpdate;

	// Constructors

	/** default constructor */
	public Borrow() {
	}

	/** minimal constructor */
	public Borrow(String id) {
		this.id = id;
	}

	/** full constructor */
	public Borrow(String id, User user, Ownership ownership, Date beginDate,
			Date returnDate, Boolean isAffirm, Timestamp gmtCreate,
			Timestamp gmtUpdate) {
		this.id = id;
		this.user = user;
		this.ownership = ownership;
		this.beginDate = beginDate;
		this.returnDate = returnDate;
		this.isAffirm = isAffirm;
		this.gmtCreate = gmtCreate;
		this.gmtUpdate = gmtUpdate;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 64)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "borrower_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ownership_id")
	public Ownership getOwnership() {
		return this.ownership;
	}

	public void setOwnership(Ownership ownership) {
		this.ownership = ownership;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "begin_date", length = 10)
	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "return_date", length = 10)
	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
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

    @Override
    public String toString() {
        return "Borrow{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", ownership=" + ownership +
                ", beginDate=" + beginDate +
                ", returnDate=" + returnDate +
                ", isAffirm=" + isAffirm +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                '}';
    }
}