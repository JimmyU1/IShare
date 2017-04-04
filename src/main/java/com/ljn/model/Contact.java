package com.ljn.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Contact entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "contact", catalog = "ishare")
public class Contact implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String email;
	private String content;
	private Timestamp gmtCreate;
	private Timestamp gmtUpdate;

	// Constructors

	/** default constructor */
	public Contact() {
	}

	/** minimal constructor */
	public Contact(String id) {
		this.id = id;
	}

	/** full constructor */
	public Contact(String id, String name, String email, String content,
			Timestamp gmtCreate, Timestamp gmtUpdate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.content = content;
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

	@Column(name = "name", length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                '}';
    }
}