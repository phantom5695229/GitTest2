package homework1;

public class Car {
	public void run(Light light){
		
		String lightColor =  light.getLightColor();
		if (lightColor.equals("��")) {
			System.out.println("���ͣ");
		} else if (lightColor.equals("��")) {
			System.out.println("�Ƶ�����");
		} else if (lightColor.equals("��")) {
			System.out.println("�̵���");
		}
	}

}
