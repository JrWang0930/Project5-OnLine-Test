package onlineTest;

import java.io.Serializable;

public class TrueFalseQuestion extends Question implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean answer;

	public TrueFalseQuestion(String text, int examId, int questionNumber, double points, boolean answer) {
		super(text, examId, questionNumber, points);
		this.answer = answer;
	}

	public boolean getAnswer() {
		return answer;
	}

}
