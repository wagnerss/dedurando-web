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
@Table(name="CHECK_POINT")
@SequenceGenerator(name="seqCheckPoint", sequenceName="SEQ_CHECK_POINT", allocationSize=1)
public class CheckPoint implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="seqCheckPoint", strategy=GenerationType.SEQUENCE)
	@Column(name="CHECK_POINT_ID")
	private Long id;
	
	@Column(name="PHOTO")
	private byte[] photo;
	
	@Column(name="LATITUDE")
	private long latitude;
	
	@Column(name="LONGITUDE")
	private long longitude;
	
	@Column(name="CREATED_AT",nullable=false)
	private Calendar createdAt;
	
	@Column(name="LEGEND",length=40,nullable=true,unique=true)
	private String legend;
	
	@ManyToOne
	private Point point;
		
	@OneToMany
	@JoinTable(name="DDR_CHECK_POINT_COMMENT", 
		joinColumns=@JoinColumn(name="CHECK_POINT_ID"),
		inverseJoinColumns=@JoinColumn(name="COMMENT_ID"))
	private Collection<Comment> comment;
	
	@ManyToOne
	private User user;
	
	@OneToMany
	@JoinTable(name="DDR_CHECK_POINT_REVIEW", 
		joinColumns=@JoinColumn(name="CHECK_POINT_ID"),
		inverseJoinColumns=@JoinColumn(name="REVIEW_ID"))
	private Collection<Review> review;
	
	@OneToMany
	@JoinTable(name="DDR_CHECK_POINT_COMPLAINT", 
		joinColumns=@JoinColumn(name="CHECK_POINT_ID"),
		inverseJoinColumns=@JoinColumn(name="COMPLAINT_ID"))
	private Collection<Complaint> complaint;
	
	@OneToMany
	@JoinTable(name="DDR_CHECK_POINT_CONSUMER", 
		joinColumns=@JoinColumn(name="CHECK_POINT_ID"),
		inverseJoinColumns=@JoinColumn(name="CONSUMER_ID"))
	private Collection<Consumer> consumer;
	
	@OneToMany
	@JoinTable(name="DDR_CHECK_POINT_SANITATION", 
		joinColumns=@JoinColumn(name="CHECK_POINT_ID"),
		inverseJoinColumns=@JoinColumn(name="SANITATION_ID"))
	private Collection<Sanitation> sanitation;
	
	@OneToMany
	@JoinTable(name="DDR_CHECK_POINT_TRANSPORT", 
		joinColumns=@JoinColumn(name="CHECK_POINT_ID"),
		inverseJoinColumns=@JoinColumn(name="TRANSPORT_ID"))
	private Collection<Transport> transport;
	
		
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
	public long getLatitude() {
		return latitude;
	}
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	public long getLongitude() {
		return longitude;
	}
	public void setLongitude(long longitude) {
		this.longitude = longitude;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
