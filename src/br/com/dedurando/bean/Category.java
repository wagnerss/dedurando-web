package br.com.dedurando.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DDR_CATEGORY")
@SequenceGenerator(name="SEG_GEN_CATEGORY", sequenceName="SEQ_CATEGORY", allocationSize=1)
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(generator="SEG_GEN_CATEGORY", strategy=GenerationType.SEQUENCE)
	private Long categoryId;
	
	@OneToMany
    @JoinColumn(name="CATEGORY_ID")
    private Collection<Category> categories;
	
	@Column(name="NAME",length=30)
	private String name;
	
	@Column(name="STATUS")
	private StatusType status;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Collection<Category> getCategories() {
		return categories;
	}

	public void setCategories(Collection<Category> categories) {
		this.categories = categories;
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

}
