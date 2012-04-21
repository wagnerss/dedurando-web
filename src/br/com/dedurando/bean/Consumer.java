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
@Table(name="CONSUMER")
@SequenceGenerator(name="seqConsumer", sequenceName="SEQ_CONSUMER", allocationSize=1)
public class Consumer {
	
	@Id
	@GeneratedValue(generator="seqConsumer", strategy=GenerationType.SEQUENCE)
	@Column(name="CONSUMER_ID")
	private Long consumerId;

	@ManyToOne
	private CheckPoint checkPoint;
	
	
	
	public CheckPoint getCheckPoint() {
		return checkPoint;
	}

	public void setCheckPoint(CheckPoint checkPoint) {
		this.checkPoint = checkPoint;
	}

	public long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(long consumerId) {
		this.consumerId = consumerId;
	}
	
}
