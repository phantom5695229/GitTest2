package homework1;

import java.util.Random;

public class Light {
	private String lightColor;


	public void setLightColor() {
		Random rand = new Random();
		int color = rand.nextInt(3);
		if (color == 0) {
			lightColor = "��";
		} else if (color == 1) {
			lightColor = "��";
		} else if (color == 2) {
			lightColor = "��";
		}
		
	}
	public String getLightColor() {
		return lightColor;
	}
}
