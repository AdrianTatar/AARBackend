package com.rso.aar.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "surchargecustomersrates")
public class SurchargeCustomersRate implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "customernumber", nullable = false, length = 10)
	private String customernumber;
	
	@Column(name = "year", nullable = false)
	private Integer year;
	
	@Column(name = "dailyrate", nullable = false)
	private BigDecimal dailyrate;
	
	public SurchargeCustomersRate() {
	}
	
	public SurchargeCustomersRate(String customernumber, Integer year, BigDecimal dailyrate) {
		this.customernumber = customernumber;
		this.year = year;
		this.dailyrate = dailyrate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public BigDecimal getDailyrate() {
		return dailyrate;
	}

	public void setDailyrate(BigDecimal dailyrate) {
		this.dailyrate = dailyrate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customernumber == null) ? 0 : customernumber.hashCode());
		result = prime * result + ((dailyrate == null) ? 0 : dailyrate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		SurchargeCustomersRate other = (SurchargeCustomersRate) obj;
		if (customernumber == null) {
			if (other.customernumber != null)
				return false;
		} else if (!customernumber.equals(other.customernumber))
			return false;
		if (dailyrate == null) {
			if (other.dailyrate != null)
				return false;
		} else if (!dailyrate.equals(other.dailyrate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SurchargeCustomersRate [id=" + id + ", customernumber=" + customernumber + ", year=" + year
				+ ", dailyrate=" + dailyrate + "]";
	}

}
