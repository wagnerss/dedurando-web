package br.com.dedurando.bean;

import java.io.Serializable;

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
@Table(name="POINT")
@SequenceGenerator(name="SEQ_GEN_ITEM", sequenceName="SEQ_ITEM", allocationSize=1)
public class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ITEM_ID")
	@GeneratedValue(generator="SEQ_GEN_ITEM", strategy=GenerationType.SEQUENCE)
	private Long itemId;
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	private Category category;

	@Column(name="NAME", length=50)
	private String name;

	@Column(name="STATUS")
	private StatusType status;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="DESCRIPTION")
	private String description;
	
	
		
}
