package visit2;

import visit.Person;

public class Test {
	public static void main(String[] args) {
		//注意：跨包使用类需要先导入才能使用，方法等同于Scanner
		Person p1 = new Person();
		p1.name = "李四";
		//protected属性，非本包非子类无法访问
//		p1.age = 20;
		//默认属性，非本包无法访问
//		p1.bloodyType = "o";
		//private属性，非本类无法访问
//		p1.salary = 2000;
	}

}
