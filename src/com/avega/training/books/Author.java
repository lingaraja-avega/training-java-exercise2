package com.avega.training.books;

import java.util.Objects;

public class Author {

	private String authorId;
	private String authorName;
	private long contact;
	private String mailid;
	
	public Author() {}
	
	public Author(String authorId, String authorName, long contact, String mailid) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.contact = contact;
		this.mailid = mailid;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", contact=" + contact + ", mailid="
				+ mailid + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return authorId == other.authorId;
	}
	
}
