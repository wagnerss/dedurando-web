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
@Table(name="DDR_TRANSPORT")
@SequenceGenerator(name="SEQ_GEN_TRANSPORT", sequenceName="SEQ_TRANSPORT", allocationSize=1)
public class Transport {
	
	@Id
	@GeneratedValue(generator="SEQ_GEN_TRANSPORT", strategy=GenerationType.SEQUENCE)
	@Column(name="TRANSPORT_ID")
	private Long transportId;

	@ManyToOne
	private Post post;
	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public void setTransportId(Long transportId) {
		this.transportId = transportId;
	}

	public long getTransportId() {
		return transportId;
	}

	public void setTransportId(long transportId) {
		this.transportId = transportId;
	}
	
}
