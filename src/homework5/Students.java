package homework5;

public class Students {
	private String name;
	private int id;
	private String hobi;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHobi() {
		return hobi;
	}
	public void setHobi(String hobi) {
		this.hobi = hobi;
	}
	public Students() {
		super();
	}
	public Students(String name, int id, String hobi) {
		super();
		this.name = name;
		this.id = id;
		this.hobi = hobi;
	} 

}
