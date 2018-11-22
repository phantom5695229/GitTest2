package homework5;

public class StudentManagement {
	//开辟一个六位数组引用空间用来储存学生数据
	Students[] students = new Students[6];
	//用count变量来统计实际数据数量
	int count = 0;
	//储存数据方法
	public void save(Students student){
		//判断现在的数据个数，若不小于数组长度则不再添加数据，提示空间已满
		if (count < students.length) {
			//若实际数据个数小于数组长度则把当前实际数据个数作为位标，将学生数据导向该位标
			students[count++] = student;
		} else {
			System.out.println("储存空间已满");
		}
	}
	//删除数据
	public void del(int id){
		//创建index变量用来确认与删除数据相匹配的位标，初始值-1
		int index = -1;
		//遍历数组寻找匹配位标，若找到匹配位标则给index赋值
		for (int i = 0 ; i < count ; i++) {
			if (students[i].getId() == id) {
				index = i ;
				break;
			}
		}
		//如果找到位标（index!=-1）则进行删除操作（以位标为起始位，每一个位标的数据往前窜一个）
		if (index == -1) {
			System.out.println("未找到匹配学号");
		} else {
			for (int i = index ; i < count - 1 ; i++) {
				students[i] = students[i+1];
			}
			//由于删除了一个数据，要把实际数据个数count递减一次
			count--;
		}
		
	}
	public void show(){
		//遍历数组
		for (int i = 0 ; i < count ; i++) {
			System.out.println("学生姓名："+students[i].getName());
			System.out.println("学号："+students[i].getId());
			System.out.println("爱好："+students[i].getHobi());
		}
		
	} 

}
