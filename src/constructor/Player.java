package constructor;

public class Player {
	private String name;
	private int level;
	private int money;
	private char gender;
	private String job;
	
	Player(){
		
	}
	Player(String n,char g,String j){
		name = n;
		gender = g;
		job = j;
		level = 1;
		money = 100;
	}
	Player(String n,int l,int m,char g,String j){
		name = n;
		level = l;
		money = m;
		gender = g;
		job = j;
	}
	public String toString(){
		return "角色名："+name+"，性别："+gender+"，职业："+job+"，金钱："+money+"，等级："+level;
	}
	
	public static void main(String[] args) {
		Player p = new Player("ZS",'男',"战士");
		Player gm = new Player("GM",99,99999,'女',"法师");
		System.out.println(p.toString());
		System.out.println(gm.toString());
		
	}

}
