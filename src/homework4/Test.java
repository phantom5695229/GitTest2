package homework4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//��������1,2
		Questions q1 = new Questions("5+1=��",new String[]{"A.1","B.2","C.5","D.6"},"D",50);
		Questions q2 = new Questions("10+20=��",new String[]{"A.10","B.20","C.30","D.60"},"C",50);
		//���õ�һ���Ծ�
		ExamPaper p1 = new ExamPaper(new Questions[]{q1,q2},"����");
		//��������3,4
		Questions q3 = new Questions("�������������ĸ�ʡ��",new String[]{"A.����","B.����","C.������","D.����"},"A",50);
		Questions q4 = new Questions("�Ǹ�����ֱϽ�У�",new String[]{"A.����","B.����","C.�Ϻ�","D.����"},"B",50);
		//���õڶ����Ծ�
		ExamPaper p2 = new ExamPaper(new Questions[]{q3,q4},"����");
		//������ʦ
		Teacher t1 = new Teacher(new ExamPaper[]{p1,p2},"����ʦ");
		Teacher t2 = new Teacher(new ExamPaper[]{p1,p2},"����ʦ");
		//ѡ����ʦ
		System.out.println("��ѡ����ʦ");
		int input = scan.nextInt();
		Teacher t = null;
		if (input == 1) {
			t = t1;
		} else if (input == 2) {
			t = t2;
		} else {
			System.out.println("�����������������");
		} 
		ExamPaper[] paper = t.getPaper();
		//ѡ���Ծ�
		System.out.println("��ѡ���Ծ�");
		int input2 = scan.nextInt();
		Questions[] questions = paper[input2-1].getQuestions();
		int scoer = 0;
		//��ʼ����
		//����questions���飬�����Ŀ
		for (Questions q : questions) {
			System.out.println(q.getQuestion());
			//Options�����ѡ��
			for (String op : q.getOptions()) {
				System.out.println(op);
			}
			//�����
			System.out.println("�������");
			String answer = scan.next();
			//�������ֵ���ƥ�䣬��Ѹ���Ŀ�ķ����ۻ�������scoer��
			if (answer.equals(q.getAnswer())) {
				scoer += q.getScoer();
			}
		}
		System.out.println("����"+scoer);
		
			
		

		 
		
	}

}
