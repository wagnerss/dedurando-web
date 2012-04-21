package br.com.dedurando.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DDR_REVIEW")
@SequenceGenerator(name="SEQ_GEN_REVIEW", sequenceName="SEQ_REVIEW", allocationSize=1)
public class Review implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="SEQ_GEN_REVIEW", strategy=GenerationType.SEQUENCE)
	@Column(name="REVIEW_ID")
	private Long reviewId;
		
	//ok
	@Column(name="STATUS")
	private char status;
	
	//ok
	@ManyToOne
	private User user;
	
	
	@ManyToOne
	private CheckPoint checkPoint;
	
	//TODO
	//colocar mapeamento no POST
	@OneToMany
	private ReviewReason reviewReason;
	
	public ReviewReason getReviewReason() {
		return reviewReason;
	}
	public void setReviewReason(ReviewReason reviewReason) {
		this.reviewReason = reviewReason;
	}
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
	
	public Long getReviewId() {
		return reviewId;
	}
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	
}
