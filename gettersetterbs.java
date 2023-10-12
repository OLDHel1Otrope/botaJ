package package1;

public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model, int year){
		this.setmake(make);
		this.setmodel(model);
		this.setyear(year);
	}
	
	public void copy(Car x) {
		this.setmake(x.getmake());
		this.setmodel(x.getmodel());
		this.setyear(x.getyear());
	}
	
	
	public void setmake(String make) {
		this.make=make;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public void setyear(int year) {
		this.year=year;
	}
	
	
	public String getmake() {
		return this.make;
	}
	public String getmodel() {
		return this.model;
	}
	public int getyear() {
		return this.year;
	}
	
}
