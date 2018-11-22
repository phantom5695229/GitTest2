package homework3;

public class Test {
	public static void main(String[] args) {
		Brothers b1 = new Brothers("大娃","力大无穷","红");
		Brothers b2 = new Brothers("二娃","千里眼","橙");
		Brothers b3 = new Brothers("三娃","刀枪不入","黄");
		Brothers b4 = new Brothers("四娃","喷火","绿");
		Brothers b5 = new Brothers("大娃","吐水","青");
		Brothers b6 = new Brothers("大娃","隐身","蓝");
		Brothers b7 = new Brothers("大娃","葫芦","紫");
		Brothers[] bro = {b1,b2,b3,b4,b5,b6,b7};
		/*for (int i = 0 ; i < bro.length ; i++){
			bro[i].print();
		}*/
		for (Brothers i : bro){
			i.print();
		}
	}
}
