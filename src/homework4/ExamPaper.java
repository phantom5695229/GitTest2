package homework4;

public class ExamPaper {
	private Questions[] questions;
	private String name;
	
	public Questions[] getQuestions() {
		return questions;
	}
	public void setQuestions(Questions[] questions) {
		this.questions = questions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public ExamPaper() {
		super();
	}
	public ExamPaper(Questions[] questions, String name) {
		super();
		this.questions = questions;
		this.name = name;
	}

}
