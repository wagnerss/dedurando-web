package br.com.dedurando.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DDR_SANITATION")
@SequenceGenerator(name="SEQ_GEN_SANITATION", sequenceName="SEQ_SANITATION", allocationSize=1)
public class Sanitation {
	
	@Id
	@GeneratedValue(generator="SEQ_GEN_SANITATION", strategy=GenerationType.SEQUENCE)
	@Column(name="SANITATION_ID")
	private Long sanitationId;

	@ManyToOne
	private Post post;
	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public void setSanitationId(Long sanitationId) {
		this.sanitationId = sanitationId;
	}

	public long getSanitationId() {
		return sanitationId;
	}

	public void setSanitationId(long sanitationId) {
		this.sanitationId = sanitationId;
	}
	
}
