package com.project.agency.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "travels")
public class Travel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Type(type = "long")
	private long id;
	
	@Type(type = "string")
	@NotNull
	private String name;
	
	@Lob
	@NotNull
	private String description;
	
	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
	@NotNull
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date startDate;
	
	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
	@NotNull
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date endDate;
	
	@Type(type = "big_decimal")
	@NotNull
	private BigDecimal price;
	
	// Relationships
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	public Travel() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public String getDestiny() {
		return city.getDestinyName();
	}
	
	@Override
	public String toString() {
		return "Travel[id=" + id + ", name=" + name + ", description="
				+ description + ", startDate=" + startDate + ", endDate="
				+ endDate + ", price=" + price + ", city=" + city + "]";
	}

}
