package com.rso.aar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "surchargecustomers")
public class SurchargeCustomer implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "debitornumber", nullable = false, length = 10)
	private String debitornumber;

	@Column(name = "debitorname", nullable = false, length = 100)
	private String debitorname;

	@Column(name = "type", nullable = false, length = 20)
	private String type;

	@Column(name = "customernumber", nullable = false, length = 10)
	private String customernumber;

	@Column(name = "customername", nullable = false, length = 100)
	private String customername;

	public SurchargeCustomer() {
	}

	public SurchargeCustomer(String debitornumber, String debitorname, String type, String customernumber,
			String customername) {
		this.debitornumber = debitornumber;
		this.debitorname = debitorname;
		this.type = type;
		this.customernumber = customernumber;
		this.customername = customername;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDebitornumber() {
		return debitornumber;
	}

	public void setDebitornumber(String debitornumber) {
		this.debitornumber = debitornumber;
	}

	public String getDebitorname() {
		return debitorname;
	}

	public void setDebitorname(String debitorname) {
		this.debitorname = debitorname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customername == null) ? 0 : customername.hashCode());
		result = prime * result + ((customernumber == null) ? 0 : customernumber.hashCode());
		result = prime * result + ((debitorname == null) ? 0 : debitorname.hashCode());
		result = prime * result + ((debitornumber == null) ? 0 : debitornumber.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		SurchargeCustomer other = (SurchargeCustomer) obj;
		if (customername == null) {
			if (other.customername != null)
				return false;
		} else if (!customername.equals(other.customername))
			return false;
		if (customernumber == null) {
			if (other.customernumber != null)
				return false;
		} else if (!customernumber.equals(other.customernumber))
			return false;
		if (debitorname == null) {
			if (other.debitorname != null)
				return false;
		} else if (!debitorname.equals(other.debitorname))
			return false;
		if (debitornumber == null) {
			if (other.debitornumber != null)
				return false;
		} else if (!debitornumber.equals(other.debitornumber))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SurchargeCustomer [id=" + id + ", debitornumber=" + debitornumber + ", debitorname=" + debitorname
				+ ", type=" + type + ", customernumber=" + customernumber + ", customername=" + customername + "]";
	}

}
