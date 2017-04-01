package com.ljn.model;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "category", catalog = "ishare")
public class Category implements java.io.Serializable {

	// Fields

	private String categoryId;
	private String categoryCh;
	private String categoryEn;
	private Timestamp gmtCreate;
	private Timestamp gmtUpdate;
	private Set<Basebook> basebooks = new HashSet<Basebook>(0);

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(String categoryId) {
		this.categoryId = categoryId;
	}

	/** full constructor */
	public Category(String categoryId, String categoryCh, String categoryEn,
			Timestamp gmtCreate, Timestamp gmtUpdate, Set<Basebook> basebooks) {
		this.categoryId = categoryId;
		this.categoryCh = categoryCh;
		this.categoryEn = categoryEn;
		this.gmtCreate = gmtCreate;
		this.gmtUpdate = gmtUpdate;
		this.basebooks = basebooks;
	}

	// Property accessors
	@Id
	@Column(name = "category_id", unique = true, nullable = false, length = 64)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "category_ch")
	public String getCategoryCh() {
		return this.categoryCh;
	}

	public void setCategoryCh(String categoryCh) {
		this.categoryCh = categoryCh;
	}

	@Column(name = "category_en")
	public String getCategoryEn() {
		return this.categoryEn;
	}

	public void setCategoryEn(String categoryEn) {
		this.categoryEn = categoryEn;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Basebook> getBasebooks() {
		return this.basebooks;
	}

	public void setBasebooks(Set<Basebook> basebooks) {
		this.basebooks = basebooks;
	}

}