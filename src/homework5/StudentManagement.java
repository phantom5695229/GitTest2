package homework5;

public class StudentManagement {
	//����һ����λ�������ÿռ���������ѧ������
	Students[] students = new Students[6];
	//��count������ͳ��ʵ����������
	int count = 0;
	//�������ݷ���
	public void save(Students student){
		//�ж����ڵ����ݸ���������С�����鳤������������ݣ���ʾ�ռ�����
		if (count < students.length) {
			//��ʵ�����ݸ���С�����鳤����ѵ�ǰʵ�����ݸ�����Ϊλ�꣬��ѧ�����ݵ����λ��
			students[count++] = student;
		} else {
			System.out.println("����ռ�����");
		}
	}
	//ɾ������
	public void del(int id){
		//����index��������ȷ����ɾ��������ƥ���λ�꣬��ʼֵ-1
		int index = -1;
		//��������Ѱ��ƥ��λ�꣬���ҵ�ƥ��λ�����index��ֵ
		for (int i = 0 ; i < count ; i++) {
			if (students[i].getId() == id) {
				index = i ;
				break;
			}
		}
		//����ҵ�λ�꣨index!=-1�������ɾ����������λ��Ϊ��ʼλ��ÿһ��λ���������ǰ��һ����
		if (index == -1) {
			System.out.println("δ�ҵ�ƥ��ѧ��");
		} else {
			for (int i = index ; i < count - 1 ; i++) {
				students[i] = students[i+1];
			}
			//����ɾ����һ�����ݣ�Ҫ��ʵ�����ݸ���count�ݼ�һ��
			count--;
		}
		
	}
	public void show(){
		//��������
		for (int i = 0 ; i < count ; i++) {
			System.out.println("ѧ��������"+students[i].getName());
			System.out.println("ѧ�ţ�"+students[i].getId());
			System.out.println("���ã�"+students[i].getHobi());
		}
		
	} 

}
