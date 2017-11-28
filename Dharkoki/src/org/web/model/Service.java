package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Service_tbl")
public class Service {

	@Id
	@Column(name="service_no")
	private int SERVICE_NO;
	
	public Service(int sERVICE_NO) {
		super();
		SERVICE_NO = sERVICE_NO;
	}

	public int getSERVICE_NO() {
		return SERVICE_NO;
	}

	public void setSERVICE_NO(int sERVICE_NO) {
		SERVICE_NO = sERVICE_NO;
	}
	
}
