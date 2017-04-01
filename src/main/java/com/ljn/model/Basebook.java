package com.ljn.model;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * Basebook entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "basebook", catalog = "ishare")
public class Basebook implements java.io.Serializable {

	// Fields

	private String bookId;
	private Category category;
	private String bookName;
	private String author;
	private String authorIntro;
	private String isbn10;
	private String isbn13;
	private String publisher;
	private String imagePath;
	private String summary;
	private Timestamp gmtCreate;
	private Timestamp gmtUpdate;
	private Set<Review> reviews = new HashSet<Review>(0);
	private Set<Ownership> ownerships = new HashSet<Ownership>(0);

	// Constructors

	/** default constructor */
	public Basebook() {
	}

	/** minimal constructor */
	public Basebook(String bookId) {
		this.bookId = bookId;
	}

	/** full constructor */
	public Basebook(String bookId, Category category, String bookName,
			String author, String authorIntro, String isbn10, String isbn13,
			String publisher, String imagePath, String summary,
			Timestamp gmtCreate, Timestamp gmtUpdate, Set<Review> reviews,
			Set<Ownership> ownerships) {
		this.bookId = bookId;
		this.category = category;
		this.bookName = bookName;
		this.author = author;
		this.authorIntro = authorIntro;
		this.isbn10 = isbn10;
		this.isbn13 = isbn13;
		this.publisher = publisher;
		this.imagePath = imagePath;
		this.summary = summary;
		this.gmtCreate = gmtCreate;
		this.gmtUpdate = gmtUpdate;
		this.reviews = reviews;
		this.ownerships = ownerships;
	}

	// Property accessors
	@Id
	@Column(name = "book_id", unique = true, nullable = false, length = 64)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "book_name")
	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Column(name = "author")
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "author_intro", length = 65535)
	public String getAuthorIntro() {
		return this.authorIntro;
	}

	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}

	@Column(name = "isbn10", length = 10)
	public String getIsbn10() {
		return this.isbn10;
	}

	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}

	@Column(name = "isbn13", length = 13)
	public String getIsbn13() {
		return this.isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	@Column(name = "publisher")
	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Column(name = "image_path")
	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Column(name = "summary", length = 65535)
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "basebook")
	public Set<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "basebook")
	public Set<Ownership> getOwnerships() {
		return this.ownerships;
	}

	public void setOwnerships(Set<Ownership> ownerships) {
		this.ownerships = ownerships;
	}

}