package thisKeyWord;

public class Person {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

	public Person() {
		super();
	}

	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		Person p = new Person();
		p.setName("zs");
		p.setAge(20);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.toString());
	}
	

}
