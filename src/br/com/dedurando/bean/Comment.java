package br.com.dedurando.bean;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="COMMENT")
@SequenceGenerator(name="seqComment", sequenceName="SEQ_COMMENT", allocationSize=1)
public class Comment {

	@Id
	@GeneratedValue(generator="seqComment", strategy=GenerationType.SEQUENCE)
	@Column(name="COMMENT_ID")
	private Long id;
	
	@Column(name="LIKE")
	private char like;
	
	@Column(name="CREATED_AT",nullable=false)
	private Calendar created_at;

	@ManyToOne
	private CheckPoint checkPoint;
	
	public CheckPoint getCheckPoint() {
		return checkPoint;
	}

	public void setCheckPoint(CheckPoint checkPoint) {
		this.checkPoint = checkPoint;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public char getLike() {
		return like;
	}

	public void setLike(char like) {
		this.like = like;
	}

	public Calendar getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Calendar created_at) {
		this.created_at = created_at;
	}
	
}
