package homework4;
public class Questions {
	private String question;
	private String[] options;
	private String answer;
	private int scoer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getScoer() {
		return scoer;
	}
	public void setScoer(int scoer) {
		this.scoer = scoer;
	}
	
	public Questions() {
		super();
	}
	public Questions(String question, String[] options, String answer, int scoer) {
		super();
		this.question = question;
		this.options = options;
		this.answer = answer;
		this.scoer = scoer;
	}

	
}
