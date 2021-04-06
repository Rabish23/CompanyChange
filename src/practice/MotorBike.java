package practice;

public class MotorBike {
	
	//state
	private int speed;
	//behaviour
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}
	
	
	void start() {
		System.out.println("Bike Started");
	}

}
