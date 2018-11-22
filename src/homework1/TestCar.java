package homework1;

public class TestCar {
	public static void main(String[] args) {
		Light l = new Light();
		l.setLightColor();
		Car c = new Car();
		c.run(l);
	}
}
