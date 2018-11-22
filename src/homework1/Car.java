package homework1;

public class Car {
	public void run(Light light){
		
		String lightColor =  light.getLightColor();
		if (lightColor.equals("ºì")) {
			System.out.println("ºìµÆÍ£");
		} else if (lightColor.equals("»Æ")) {
			System.out.println("»ÆµÆÐìÐÐ");
		} else if (lightColor.equals("ÂÌ")) {
			System.out.println("ÂÌµÆÐÐ");
		}
	}

}
