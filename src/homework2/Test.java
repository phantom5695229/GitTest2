package homework2;

public class Test {
	public static void main(String[] args) {
		Computer c1 = new Computer("联想");
		c1.setCpuHz(2.0);
		c1.setHardDisk(1000);
		c1.setPrice(10000);
		c1.print();
		Computer c2 = new Computer("外星人");
		c2.setCpuHz(3.0);
		c2.setHardDisk(2000);
		c2.setPrice(15000);
		c2.print();
	}

}
