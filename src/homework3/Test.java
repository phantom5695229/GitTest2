package homework3;

public class Test {
	public static void main(String[] args) {
		Brothers b1 = new Brothers("����","��������","��");
		Brothers b2 = new Brothers("����","ǧ����","��");
		Brothers b3 = new Brothers("����","��ǹ����","��");
		Brothers b4 = new Brothers("����","���","��");
		Brothers b5 = new Brothers("����","��ˮ","��");
		Brothers b6 = new Brothers("����","����","��");
		Brothers b7 = new Brothers("����","��«","��");
		Brothers[] bro = {b1,b2,b3,b4,b5,b6,b7};
		/*for (int i = 0 ; i < bro.length ; i++){
			bro[i].print();
		}*/
		for (Brothers i : bro){
			i.print();
		}
	}
}
