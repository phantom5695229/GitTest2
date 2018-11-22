package enumTest;
enum Role{WARRIOR,ARCHER,CASTER,ASSASSIN}
	
public class Test {
	Role myRole;
	String skill;
	public Test(){}
	public Test(Role myrole){
		this.myRole = myrole;
		switch(this.myRole) {
		case WARRIOR :
			skill = "a";
			break;
		case ARCHER :
			skill = "b";
			break;
		case CASTER :
			skill = "c";
			break;
		case ASSASSIN :
			skill = "d";
			break;
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test(Role.ASSASSIN);
		System.out.println(t.skill);

		
	}
}
