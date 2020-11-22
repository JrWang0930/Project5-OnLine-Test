package onlineTest;

import java.io.Serializable;

public class Question implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String text;
	private int examId;
	private int questionNumber;
	private double points;

	public Question(String text, int examId, int questionNumber, double points) {
		this.text = text;
		this.examId = examId;
		this.questionNumber = questionNumber;
		this.points = points;
	}

	public int getQuestionNumber() {
		return questionNumber;
	}

	public String getText() {
		return text;
	}

	public double getPoints() {
		return points;
	}
}
