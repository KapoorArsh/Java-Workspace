package com.map.onetomany;

import javax.persistence.*;

@Entity
public class Answer1 {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	@ManyToOne
	private Question1 question;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question1 getQuestion() {
		return question;
	}
	public void setQuestion(Question1 question) {
		this.question = question;
	}
	public Answer1(int answerId, String answer, Question1 question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
