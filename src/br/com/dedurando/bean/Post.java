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
@Table(name="DDR_POST")
@SequenceGenerator(name="SEQ_GEN_POST", sequenceName="SEQ_GEN_POST", allocationSize=1)
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="SEQ_GEN_POST", strategy=GenerationType.SEQUENCE)
	@Column(name="DDR_POST_ID")
	private Long postId;
	
	@ManyToOne
	private Item item;
	
	@ManyToOne
	@JoinColumn(name="PLACE_ID")
	private Place place;

	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	@Column(name="PHOTO")
	private byte[] photo;
	
	@Column(name="LEGEND",length=40,nullable=true,unique=true)
	private String legend;

	@Column(name="CREATED_AT",nullable=false)
	private Calendar createdAt;

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getLegend() {
		return legend;
	}

	public void setLegend(String legend) {
		this.legend = legend;
	}

	public Calendar getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
	