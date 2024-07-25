package com.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int a_id;
	private String answer;
	@OneToOne(mappedBy = "answer")
	private Question q;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	public Answer(int a_id, String answer) {
		super();
		this.a_id = a_id;
		this.answer = answer;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [a_id=" + a_id + ", answer=" + answer + ", q=" + q + "]";
	}
	
	
}
