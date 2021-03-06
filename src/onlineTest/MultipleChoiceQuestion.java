package onlineTest;

import java.io.Serializable;
import java.util.Arrays;

public class MultipleChoiceQuestion extends Question implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] answer;

	public MultipleChoiceQuestion(String text, int examId, int questionNumber, double points, String[] answer) {
		super(text, examId, questionNumber, points);
		this.answer = answer;
	}

	public String[] getAnswer() {
		Arrays.sort(answer);
		return answer;
	}

}
