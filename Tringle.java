package shape_package;

public class Tringle implements Shape{
	private double base;
	private double height;
	
	public Tringle() {		
		
		this.base = 0;
		this.height = 0;
	}
	
	public Tringle(double base,double height){			
		this.base = base;
		this.height = height;
	}
	
	public void display() {								
	      System.out.println("Calculating Area of Triangle");
	}
	
	public double calculate_area() {						
		return 0.5*this.base*this.height;
	}

	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
