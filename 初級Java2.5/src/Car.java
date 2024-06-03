
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+15, y, 45, 30);
		frame.fillRect(x, y+20, 80, 20);
		frame.fillOval(x+5, y+40, 20, 20);
		frame.fillOval(x+50, y+40, 20, 20);
	}
	public void move() {
		x+=vx;
		y+=vy;
	}

}
