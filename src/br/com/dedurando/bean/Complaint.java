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
@Table(name="COMPLAINT")
@SequenceGenerator(name="seqComplaint", sequenceName="SEQ_COMPLAINT", allocationSize=1)
public class Complaint {
	
	@Id
	@GeneratedValue(generator="seqComplaint", strategy=GenerationType.SEQUENCE)
	@Column(name="COMPLAINT_ID")
	private Long complaintId;

	@ManyToOne
	private CheckPoint checkPoint;
	
	public CheckPoint getCheckPoint() {
		return checkPoint;
	}

	public void setCheckPoint(CheckPoint checkPoint) {
		this.checkPoint = checkPoint;
	}
	
	public long getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(long complaintId) {
		this.complaintId = complaintId;
	}
	
}
