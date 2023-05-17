package encapsulation;

public class Car {

	private int Cmodel;
	private String Cname;
	private int Speedlimit;

	public void setModel(int model) {

		this.Cmodel = model;
	}

	public void setName(String name) {
		this.Cname = name;
	}

	public void setspeedlimit(int limit) {
		this.Speedlimit = limit;
	}

	public int getModel() {
		return Cmodel;
	}

	public String getName() {
		return Cname;
	}

	public int getspeedlimit() {
		return Speedlimit;
	}

}
