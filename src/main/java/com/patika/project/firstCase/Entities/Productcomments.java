package com.patika.project.firstCase.Entities;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="productcomments")
public class Productcomments {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="commentdate")
	private Date commentDate;
	
	@Column(name="productid")
	private int productId;
	
	@Column(name="userid")
	private int userId;

	public Productcomments(int id, String comment, Date commentDate, int productId, int userId) {
		super();
		this.id = id;
		this.comment = comment;
		this.commentDate = commentDate;
		this.productId = productId;
		this.userId = userId;
	}
	public Productcomments() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
