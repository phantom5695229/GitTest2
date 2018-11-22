package getSet;

public class Test {
	public static void main(String[] args) {
		Computer c = new Computer();
		c.setBrand("´÷¶û");
		c.setCpuType("i7-2600k");
		c.setMemorySize(16);
		c.setPrice(10000);
		System.out.println(c.getBrand());
		System.out.println(c.getCpuType());
		System.out.println(c.getMemorySize());
		System.out.println(c.getPrice());
	}

}
