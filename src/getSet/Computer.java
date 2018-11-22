package getSet;

public class Computer {
	private String brand;
	private int price;
	private String cpuType;
	private int memorySize;
	
	public void setBrand(String b){
		brand = b;
	}
	public void setPrice(int p){
		price = p;
	}
	public void setCpuType(String c){
		cpuType = c;
	}
	public void setMemorySize(int m){
		memorySize = m;
	}
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	}
	public String getCpuType(){
		return cpuType;
	}
	public int getMemorySize(){
		return memorySize;
	}
}
