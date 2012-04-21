package br.com.dedurando.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DDR_COMMENT")
@SequenceGenerator(name="SEG_GEN_COMMENT", sequenceName="SEQ_COMMENT", allocationSize=1)
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COMMENT_ID")
	@GeneratedValue(generator="SEG_GEN_COMMENT", strategy=GenerationType.SEQUENCE)
	private Long commentId;
	
	@ManyToOne
	@JoinColumn(name="POST_ID")
	private Post post;
	
	@Column(name="STATUS")
	private StatusType status;

	@Column(name="LIKE")
	private boolean like;
	
	@Column(name="DESCRIPTION", nullable = false)
	private String description; 

	@Column(name="CREATED_AT", nullable = false)
	private Calendar created_at;

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public boolean isLike() {
		return like;
	}

	public void setLike(boolean like) {
		this.like = like;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Calendar created_at) {
		this.created_at = created_at;
	}	

}
