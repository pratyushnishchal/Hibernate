package com.mapping1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Question {
	@Id
	private int q_id;
	private String question;
	@OneToMany(mappedBy = "q")
	private List<Answer> ans;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int q_id, String question, List<Answer> ans, Answer answer) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.ans = ans;
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
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [q_id=" + q_id + ", question=" + question + ", ans=" + ans + "]";
	}
}
