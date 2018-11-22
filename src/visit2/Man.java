package visit2;

import visit.Person;
//man继承Person，成为Person的子类
public class Man extends Person {
	public void print(){
		System.out.println(name);
		System.out.println(bloodyType);
		//子类无法跨包使用默认属性
//		System.out.println(age);
		//子类无法跨包使用private属性
//		System.out.println(salary);
	}
}
