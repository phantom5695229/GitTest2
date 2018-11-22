package homework3;

public class Brothers {
	private String name;
	private String skill;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Brothers() {
		super();
	}
	public Brothers(String name, String skill, String color) {
		super();
		this.name = name;
		this.skill = skill;
		this.color = color;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println("ÑÕÉ«£º"+color);
		System.out.println("¼¼ÄÜ£º"+skill);
	}
	
	
}
