package homework5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentManagement stm = new StudentManagement();
		while(true) {
			//��ӡ������
			System.out.println("=================");
			System.out.println("      1.����");
			System.out.println("      2.ɾ��");
			System.out.println("      3.��ѯ");
			System.out.println("      4.�˳�");
			System.out.println("=================");
			//��ʾ��������Ӧ����
			System.out.println("�������Ӧ����");
			int input = scan.nextInt();
			
			//������ҵ�����ִ�о������
			switch (input) {
			case 1 :
				Students st = new Students();
				System.out.println("����������");
				st.setName(scan.next());
				System.out.println("������ѧ��");
				st.setId(scan.nextInt());
				System.out.println("������ѧ������");
				st.setHobi(scan.next());
				stm.save(st);
				break;
			case 2 :
				System.out.println("��������Ҫɾ����ѧ��ѧ��");
				stm.del(scan.nextInt());
				break;
			case 3 :
				stm.show();
				break;
			case 4 :
				System.out.println("��лʹ�ã�");
				return;
			default : System.out.println("����ֵ����������");
			}
		}
		
	}

}