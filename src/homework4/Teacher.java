package homework4;

public class Teacher {
	private ExamPaper[] paper;
	private String name;
	public ExamPaper[] getPaper() {
		return paper;
	}
	public void setPaper(ExamPaper[] paper) {
		this.paper = paper;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher() {
		super();
	}
	public Teacher(ExamPaper[] paper, String name) {
		super();
		this.paper = paper;
		this.name = name;
	}
	
	
}
