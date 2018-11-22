package constructor;

public class Child {
	private String name;
	private int age ;
	private char gender;
	private int year;
	Child(){
		
	}
	Child(String n,int a,char g,int y){
		name = n; 
		age = a;
		gender = g;
		year = y;
	}
	
	
	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		System.out.println(c1.year);
		
		Child c2 = new Child("ÄÄß¸",3,'ÄĞ',999);
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.gender);
		System.out.println(c2.year);
	}
}
