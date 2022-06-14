package Vehicle;

public class car {
	public static int iGear;
	protected String sMake;
	protected int iModel;
		
	public car() {
		iGear=5;
	}
	
	protected void displayDetails() {
		System.out.println("No of Gears are: " +iGear);
		System.out.println("Car is made by: " +sMake);
		System.out.println("Model of the Car is: " +iModel);
	}
}
