package homework4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//设置问题1,2
		Questions q1 = new Questions("5+1=？",new String[]{"A.1","B.2","C.5","D.6"},"D",50);
		Questions q2 = new Questions("10+20=？",new String[]{"A.10","B.20","C.30","D.60"},"C",50);
		//设置第一张试卷
		ExamPaper p1 = new ExamPaper(new Questions[]{q1,q2},"算数");
		//设置问题3,4
		Questions q3 = new Questions("长春市是属于哪个省？",new String[]{"A.吉林","B.辽宁","C.哈尔滨","D.沈阳"},"A",50);
		Questions q4 = new Questions("那个不是直辖市？",new String[]{"A.北京","B.大连","C.上海","D.深圳"},"B",50);
		//设置第二章试卷
		ExamPaper p2 = new ExamPaper(new Questions[]{q3,q4},"地理");
		//设置老师
		Teacher t1 = new Teacher(new ExamPaper[]{p1,p2},"王老师");
		Teacher t2 = new Teacher(new ExamPaper[]{p1,p2},"李老师");
		//选择老师
		System.out.println("请选择老师");
		int input = scan.nextInt();
		Teacher t = null;
		if (input == 1) {
			t = t1;
		} else if (input == 2) {
			t = t2;
		} else {
			System.out.println("输入错误请重新输入");
		} 
		ExamPaper[] paper = t.getPaper();
		//选择试卷
		System.out.println("请选择试卷");
		int input2 = scan.nextInt();
		Questions[] questions = paper[input2-1].getQuestions();
		int scoer = 0;
		//开始答题
		//遍历questions数组，输出题目
		for (Questions q : questions) {
			System.out.println(q.getQuestion());
			//Options，输出选项
			for (String op : q.getOptions()) {
				System.out.println(op);
			}
			//输入答案
			System.out.println("请输入答案");
			String answer = scan.next();
			//如果输入值与答案匹配，则把该题目的分数累积到变量scoer上
			if (answer.equals(q.getAnswer())) {
				scoer += q.getScoer();
			}
		}
		System.out.println("分数"+scoer);
		
			
		

		 
		
	}

}
