package br.com.dedurando.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="userNetwork")
@Table(name="USER_NETWORK")
@SequenceGenerator(name="seqUserNetwork", sequenceName="SEQ_USER_NETWORK", allocationSize=1)
public class UserNetwork implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="seqUserNetwork", strategy=GenerationType.SEQUENCE)
	@Column(name="ID")
	private Long id;
	
	@Column(name="CREATE_AT")
	private Calendar createdAt;
	
	
	public Calendar getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
