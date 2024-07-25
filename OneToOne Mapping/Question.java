package com.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int q_id;
	private String question;
	@OneToOne
	@JoinColumn(name="a_ids")
	private Answer answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int q_id, String question, Answer answer) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.answer = answer;
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
}
