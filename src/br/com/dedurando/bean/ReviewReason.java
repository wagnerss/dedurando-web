package br.com.dedurando.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DDR_REVIEW_REASON")
@SequenceGenerator(name="SEQ_GEN_REVIEW_REASON", sequenceName="SEQ_REVIEW_REASON", allocationSize=1)
public class ReviewReason {

	@Id
	@GeneratedValue(generator="SEQ_GEN_REVIEW_REASON", strategy=GenerationType.SEQUENCE)
	@Column(name="REVIEW_REASON_ID")
	private long previewReasonId;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	public long getPreviewReasonId() {
		return previewReasonId;
	}
	public void setPreviewReasonId(long previewReasonId) {
		this.previewReasonId = previewReasonId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
