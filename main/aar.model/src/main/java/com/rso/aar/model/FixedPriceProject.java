package com.rso.aar.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fixedpriceprojects")
public class FixedPriceProject implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "projectnumberplanmill", nullable = false, length = 20)
	private String projectnumberplanmill;

	@Column(name = "projectidtagetik", nullable = false, length = 20)
	private String projectidtagetik;

	@Column(name = "projectdescription", nullable = false, length = 200)
	private String projectdescription;

	@Column(name = "customernumber", nullable = false, length = 10)
	private String customernumber;

	@Column(name = "price", nullable = false)
	private BigDecimal price;

	public FixedPriceProject() {
	}

	public FixedPriceProject(String projectnumberplanmill, String projectidtagetik, String projectdescription,
			String customernumber, BigDecimal price) {
		this.projectnumberplanmill = projectnumberplanmill;
		this.projectidtagetik = projectidtagetik;
		this.projectdescription = projectdescription;
		this.customernumber = customernumber;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectnumberplanmill() {
		return projectnumberplanmill;
	}

	public void setProjectnumberplanmill(String projectnumberplanmill) {
		this.projectnumberplanmill = projectnumberplanmill;
	}

	public String getProjectidtagetik() {
		return projectidtagetik;
	}

	public void setProjectidtagetik(String projectidtagetik) {
		this.projectidtagetik = projectidtagetik;
	}

	public String getProjectdescription() {
		return projectdescription;
	}

	public void setProjectdescription(String projectdescription) {
		this.projectdescription = projectdescription;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customernumber == null) ? 0 : customernumber.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((projectdescription == null) ? 0 : projectdescription.hashCode());
		result = prime * result + ((projectidtagetik == null) ? 0 : projectidtagetik.hashCode());
		result = prime * result + ((projectnumberplanmill == null) ? 0 : projectnumberplanmill.hashCode());
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
		FixedPriceProject other = (FixedPriceProject) obj;
		if (customernumber == null) {
			if (other.customernumber != null)
				return false;
		} else if (!customernumber.equals(other.customernumber))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (projectdescription == null) {
			if (other.projectdescription != null)
				return false;
		} else if (!projectdescription.equals(other.projectdescription))
			return false;
		if (projectidtagetik == null) {
			if (other.projectidtagetik != null)
				return false;
		} else if (!projectidtagetik.equals(other.projectidtagetik))
			return false;
		if (projectnumberplanmill == null) {
			if (other.projectnumberplanmill != null)
				return false;
		} else if (!projectnumberplanmill.equals(other.projectnumberplanmill))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FixedPriceProjects [id=" + id + ", projectnumberplanmill=" + projectnumberplanmill
				+ ", projectidtagetik=" + projectidtagetik + ", projectdescription=" + projectdescription
				+ ", customernumber=" + customernumber + ", price=" + price + "]";
	}

}
