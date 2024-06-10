
public class DisplayCarsTrains extends MyFrame{
	public void run() {
		Vehicle[] vehicles=new Vehicle[6];
		vehicles[0]=new Car(80,30,3,0);
		vehicles[1]=new Car(120,90,-5,0);
		vehicles[2]=new Train(150,160,7,0);
		vehicles[3]=new Train(80,230,-7,0);
		vehicles[4]=new Truck(50,270,4,0);
		vehicles[5]=new Truck(120,320,4,0);
		for(int i=0; i<30; i++) {
			clear();
			for(int j=0; j<vehicles.length; j++) {
				vehicles[j].draw(this);
				vehicles[j].move();
			}
			sleep(0.1);
		}
	}

}
