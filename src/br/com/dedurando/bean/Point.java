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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="POINT")
@SequenceGenerator(name="seqPoint", sequenceName="SEQ_POINT", allocationSize=1)
public class Point implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="seqPoint", strategy=GenerationType.SEQUENCE)
	@Column(name="POINT_ID")
	private Long id;
	
	@Column(name="NAME",length=50)
	private String name;

	@ManyToOne
	private Group group;
	
	@OneToMany
	@JoinTable(name="DDR_POINT_CHECK_POINT", 
		joinColumns=@JoinColumn(name="POINT_ID"),
		inverseJoinColumns=@JoinColumn(name="CHECK_POINT_ID"))
	private Collection<CheckPoint> checkPoint;
	
	public Collection<CheckPoint> getCheckPoint() {
		return checkPoint;
	}

	public void setCheckPoint(Collection<CheckPoint> checkPoint) {
		this.checkPoint = checkPoint;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
