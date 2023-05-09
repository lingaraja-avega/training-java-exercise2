package com.avega.training.books;

import java.util.Objects;

public class Publisher  {

	private String publisherId;
	private String publisherName;
	private String address;

	public Publisher() {
	}

	public Publisher(String publisherId, String publisherName, String address) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.address = address;
	}

	public String getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", address=" + address
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(publisherId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return publisherId == other.publisherId;
	}
}
