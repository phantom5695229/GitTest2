package homework5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentManagement stm = new StudentManagement();
		while(true) {
			//打印主界面
			System.out.println("=================");
			System.out.println("      1.添加");
			System.out.println("      2.删除");
			System.out.println("      3.查询");
			System.out.println("      4.退出");
			System.out.println("=================");
			//提示玩家输入对应数字
			System.out.println("请输入对应数字");
			int input = scan.nextInt();
			
			//根据玩家的输入执行具体操作
			switch (input) {
			case 1 :
				Students st = new Students();
				System.out.println("请输入姓名");
				st.setName(scan.next());
				System.out.println("请输入学号");
				st.setId(scan.nextInt());
				System.out.println("请输入学生爱好");
				st.setHobi(scan.next());
				stm.save(st);
				break;
			case 2 :
				System.out.println("请输入想要删除的学生学号");
				stm.del(scan.nextInt());
				break;
			case 3 :
				stm.show();
				break;
			case 4 :
				System.out.println("感谢使用！");
				return;
			default : System.out.println("错误值请重新输入");
			}
		}
		
	}

}
