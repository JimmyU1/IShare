package com.ljn.model;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import javax.persistence.*;

/**
 * Review entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "review", catalog = "ishare")
public class Review implements java.io.Serializable {

	// Fields

	private String reviewId;
	private User user;
	private Basebook basebook;
	private String content;
	private Timestamp gmtCreate;
	private Timestamp gmtUpdate;

	// Constructors

	/** default constructor */
	public Review() {
	}

	/** minimal constructor */
	public Review(String reviewId) {
		this.reviewId = reviewId;
	}

	/** full constructor */
	public Review(String reviewId, User user, Basebook basebook,
			String content, Timestamp gmtCreate, Timestamp gmtUpdate) {
		this.reviewId = reviewId;
		this.user = user;
		this.basebook = basebook;
		this.content = content;
		this.gmtCreate = gmtCreate;
		this.gmtUpdate = gmtUpdate;
	}

	// Property accessors
	@Id
	@Column(name = "review_id", unique = true, nullable = false, length = 64)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	public String getReviewId() {
		return this.reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
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

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

}