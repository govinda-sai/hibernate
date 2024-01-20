package pubs.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "pubs.entities.Title")
@Table (name = "titles")
public class Title {
	@Id 
	@Column (name = "title_id")
	private String titleId;
	
	@Column (name = "title")
	private String title;
	
	@Column
	private String type;
	
	@Column (name = "pub_id")
	private Integer pubId;
	
	@Column
	private Double price;
	
	@Column (name = "pubdate")
	private LocalDate publishedDate;

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPubId() {
		return pubId;
	}

	public void setPubId(Integer pubId) {
		this.pubId = pubId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	@Override 
	public String toString() {
		return String.format("%-13s %-65s %-10s %-8d %-9.2f %-12s\n", 
				this.titleId, this.title, this.type, this.pubId, this.price, this.publishedDate);
	}
}