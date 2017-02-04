package com.softtek.academy.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
public class AuditEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "create_date")
	private Date createDate; 
	
	@Column(name = "update_date")
	private Date updateDate; 
	
	@Column(name = "delete_date")
	private Date deleteDate;
	
	public AuditEntity(Date createDate, Date updateDate, Date deleteDate) {
		super();
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.deleteDate = deleteDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((deleteDate == null) ? 0 : deleteDate.hashCode());
		result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuditEntity other = (AuditEntity) obj;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (deleteDate == null) {
			if (other.deleteDate != null)
				return false;
		} else if (!deleteDate.equals(other.deleteDate))
			return false;
		if (updateDate == null) {
			if (other.updateDate != null)
				return false;
		} else if (!updateDate.equals(other.updateDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Audit [createDate=" + createDate + ", updateDate=" + updateDate + ", deleteDate=" + deleteDate + "]";
	}
}