package visit;

public class Test {	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "张三";
		p.age = 20;
		p.bloodyType = "o";
		//private属性，非本类无法访问
//		p.salary = 2000;
		
	}
}
