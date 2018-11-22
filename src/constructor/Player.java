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
		return "��ɫ����"+name+"���Ա�"+gender+"��ְҵ��"+job+"����Ǯ��"+money+"���ȼ���"+level;
	}
	
	public static void main(String[] args) {
		Player p = new Player("ZS",'��',"սʿ");
		Player gm = new Player("GM",99,99999,'Ů',"��ʦ");
		System.out.println(p.toString());
		System.out.println(gm.toString());
		
	}

}
