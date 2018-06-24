package model;

import java.util.Date;

public abstract class Comment {
	String comment;
	Integer vote;
	Date date;
	Boolean recommend;
	Integer idComment;
	
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public Integer getVote() {
		return vote;
	}


	public void setVote(Integer vote) {
		this.vote = vote;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Boolean getRecommend() {
		return recommend;
	}


	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}


	public Integer getIdComment() {
		return idComment;
	}


	public void setIdComment(Integer idComment) {
		this.idComment = idComment;
	}

}
