package homework1;

import java.util.Random;

public class Light {
	private String lightColor;


	public void setLightColor() {
		Random rand = new Random();
		int color = rand.nextInt(3);
		if (color == 0) {
			lightColor = "ºì";
		} else if (color == 1) {
			lightColor = "»Æ";
		} else if (color == 2) {
			lightColor = "ÂÌ";
		}
		
	}
	public String getLightColor() {
		return lightColor;
	}
}
