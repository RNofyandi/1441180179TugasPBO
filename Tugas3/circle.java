class circle{
	//variabels
	private double radius;
	private String color;

	//constructors
	//static constructor
	public circle(){
		radius = 7;
		color = "pink";
	}

	//konstructor 1/2 dinamis
	public circle(double r){
		radius = r;
		color = "pink";
	}

	//dynamic constructor
	public circle(double r , String c){
		radius = r;
		color = c;
	}

	//methods
	public double getRadius(){
		return radius;
	}

	public String getColor(){
		return color;
	}

	public double getArea(){
		return (radius * radius * Math.PI);
	}

	//setter for color
	public void setColor(String c){
		color = c;
	}

	//setter for radius
	public void setRadius(double r){
		radius = r;
	}
}