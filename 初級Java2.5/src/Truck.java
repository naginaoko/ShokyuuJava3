
public class Truck extends Vehicle{
	public Truck(int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+50, y+15, 15, 20);
		frame.fillRect(x+5, y+30, 60, 10);
		frame.fillOval(x+5, y+40, 10, 10);
		frame.fillOval(x+15, y+40, 10, 10);
		frame.fillOval(x+50, y+40, 10, 10);
	}

}
