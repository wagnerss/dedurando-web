package br.com.dedurando.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="REVIEW")
@SequenceGenerator(name="seqReview", sequenceName="SEQ_REVIEW", allocationSize=1)
public class Review implements Serializable{

	// como nao sabia que tipo colocar, coloquei esses ai 
	//                        so para nao ficar em branco
	public enum type{
		DENUNCIAFALSA,
		PORNOGRAFIA,
		ABUSO
	}
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="seqReview", strategy=GenerationType.SEQUENCE)
	@Column(name="REVIEW_ID")
	private Long id;
		
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="STATUS")
	private char status;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private CheckPoint checkPoint;
		
	
	public CheckPoint getCheckPoint() {
		return checkPoint;
	}
	public void setCheckPoint(CheckPoint checkPoint) {
		this.checkPoint = checkPoint;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	
}
