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
@Table(name="SANITATION")
@SequenceGenerator(name="seqSanitation", sequenceName="SEQ_SANITATION", allocationSize=1)
public class Sanitation {
	
	@Id
	@GeneratedValue(generator="seqSanitation", strategy=GenerationType.SEQUENCE)
	@Column(name="SANITATION_ID")
	private Long sanitationId;

	@ManyToOne
	private CheckPoint checkPoint;
		
	public CheckPoint getCheckPoint() {
		return checkPoint;
	}

	public void setCheckPoint(CheckPoint checkPoint) {
		this.checkPoint = checkPoint;
	}
	
	public long getSanitationId() {
		return sanitationId;
	}

	public void setSanitationId(long sanitationId) {
		this.sanitationId = sanitationId;
	}
	
}
