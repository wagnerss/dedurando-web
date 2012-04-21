package br.com.dedurando.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DDR_GROUP")
@SequenceGenerator(name="seqGroup", sequenceName="SEQ_GROUP", allocationSize=1)
public class Group implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="seqGroup", strategy=GenerationType.SEQUENCE)
	@Column(name="GROUP_ID")
	private Long id;
	
	@OneToMany
	@JoinTable(name="DDR_GROUP_POINT", 
		joinColumns=@JoinColumn(name="GROUP_ID"),
		inverseJoinColumns=@JoinColumn(name="POINT_ID"))
	private Collection<Point> point;
	
	public Collection<Point> getPoint() {
		return point;
	}

	public void setPoint(Collection<Point> point) {
		this.point = point;
	}

	@Column(name="NAME",length=30)
	private String name;

	
	@Column(name="STATUS")
	private boolean status;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
}
