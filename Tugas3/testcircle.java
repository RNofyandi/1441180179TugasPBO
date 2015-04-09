class testcircle{
	public static void main(String[] args) {
		
		//instance variabel
		circle lingkaran = new circle();
		circle lingkaranlagi = new circle(21);
		//circle lingkaranneh = new circle(21,"Pethak");

		//set color with setter
		lingkaran.setColor ("Grey"); 

		System.out.println("Radius = " +lingkaran.getRadius() + " Color = " +lingkaran.getColor() + " Luas = " +lingkaran.getArea());
		System.out.println("Radius = " +lingkaranlagi.getRadius() + " Color = " +lingkaranlagi.getColor() + " Luas = " +lingkaranlagi.getArea());
		//System.out.println("Radius = " +lingkaranneh.getRadius() + " Color = " +lingkaranneh.getColor() + " Luas = " +lingkaranneh.getArea());

	}
}