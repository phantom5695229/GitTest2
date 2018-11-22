package homework2;

public class Computer {
	private String brand;
	private double cpuHz;
	private int price;
	private int hardDisk;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCpuHz() {
		return cpuHz;
	}
	public void setCpuHz(double cpuHz) {
		this.cpuHz = cpuHz;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Computer() {
		super();
	}
	public Computer(String brand) {
		super();
		this.brand = brand;
	}
	
	public void print(){
		System.out.println("-----------------");
		System.out.println("Ʒ�ƣ�"+brand);
		System.out.println("CPU��Ƶ:"+cpuHz+"Hz");
		System.out.println("�۸�:"+price);
		System.out.println("Ӳ�̴�С:"+hardDisk);
	}

}
