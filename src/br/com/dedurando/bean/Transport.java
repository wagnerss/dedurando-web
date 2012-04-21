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
@Table(name="TRANSPORT")
@SequenceGenerator(name="seqTransport", sequenceName="SEQ_TRANSPORT", allocationSize=1)
public class Transport {
	
	@Id
	@GeneratedValue(generator="seqTransport", strategy=GenerationType.SEQUENCE)
	@Column(name="TRANSPORT_ID")
	private Long transportId;

	@ManyToOne
	private CheckPoint checkPoint;
	
	public CheckPoint getCheckPoint() {
		return checkPoint;
	}

	public void setCheckPoint(CheckPoint checkPoint) {
		this.checkPoint = checkPoint;
	}
	
	public long getTransportId() {
		return transportId;
	}

	public void setTransportId(long transportId) {
		this.transportId = transportId;
	}
	
}
