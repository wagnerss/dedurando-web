package br.com.dedurando.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DDR_POST")
@SequenceGenerator(name="SEQ_GEN_POST", sequenceName="SEQ_GEN_POST", allocationSize=1)
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="SEQ_GEN_POST", strategy=GenerationType.SEQUENCE)
	@Column(name="DDR_POST_ID")
	private Long postId;
	
	@Column(name="PHOTO")
	private byte[] photo;
	
	
	
	@Column(name="CREATED_AT",nullable=false)
	private Calendar createdAt;
	
	@Column(name="LEGEND",length=40,nullable=true,unique=true)
	private String legend;
	
	@ManyToOne
	private Point point;
		
	@OneToMany
	@JoinTable(name="DDR_POST_COMMENT", 
		joinColumns=@JoinColumn(name="POST_ID"),
		inverseJoinColumns=@JoinColumn(name="COMMENT_ID"))
	private Collection<Comment> comment;
	
	@ManyToOne
	private User user;
	
	@OneToMany
	@JoinTable(name="DDR_POST_REVIEW", 
		joinColumns=@JoinColumn(name="POST_ID"),
		inverseJoinColumns=@JoinColumn(name="REVIEW_ID"))
	private Collection<Review> review;
	
	@OneToMany
	@JoinTable(name="DDR_POST_COMPLAINT", 
		joinColumns=@JoinColumn(name="POST_ID"),
		inverseJoinColumns=@JoinColumn(name="COMPLAINT_ID"))
	private Collection<Complaint> complaint;
	
	@OneToMany
	@JoinTable(name="DDR_POST_CONSUMER", 
		joinColumns=@JoinColumn(name="POST_ID"),
		inverseJoinColumns=@JoinColumn(name="CONSUMER_ID"))
	private Collection<Consumer> consumer;
	
	@OneToMany
	@JoinTable(name="DDR_POST_SANITATION", 
		joinColumns=@JoinColumn(name="POST_ID"),
		inverseJoinColumns=@JoinColumn(name="SANITATION_ID"))
	private Collection<Sanitation> sanitation;
	
	@OneToMany
	@JoinTable(name="DDR_POST_TRANSPORT", 
		joinColumns=@JoinColumn(name="POST_ID"),
		inverseJoinColumns=@JoinColumn(name="TRANSPORT_ID"))
	private Collection<Transport> transport;
	
	@ManyToOne
	@JoinTable(name="DDR_POST_PLACE", 
		joinColumns=@JoinColumn(name="POST_ID"),
		inverseJoinColumns=@JoinColumn(name="PLACE_ID"))
	private Collection<Place> place;
		
	public Collection<Consumer> getConsumer() {
		return consumer;
	}
	public void setConsumer(Collection<Consumer> consumer) {
		this.consumer = consumer;
	}
	public Collection<Sanitation> getSanitation() {
		return sanitation;
	}
	public void setSanitation(Collection<Sanitation> sanitation) {
		this.sanitation = sanitation;
	}
	public Collection<Transport> getTransport() {
		return transport;
	}
	public void setTransport(Collection<Transport> transport) {
		this.transport = transport;
	}
	public Collection<Complaint> getComplaint() {
		return complaint;
	}
	public void setComplaint(Collection<Complaint> complaint) {
		this.complaint = complaint;
	}
	public Collection<Review> getReview() {
		return review;
	}
	public void setReview(Collection<Review> review) {
		this.review = review;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Collection<Comment> getComment() {
		return comment;
	}
	public void setComment(Collection<Comment> comment) {
		this.comment = comment;
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	public Calendar getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}
	public String getLegend() {
		return legend;
	}
	public void setLegend(String legend) {
		this.legend = legend;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public Collection<Place> getPlace() {
		return place;
	}
	public void setPlace(Collection<Place> place) {
		this.place = place;
	}

	
}
