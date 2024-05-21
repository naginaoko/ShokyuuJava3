
public class RectIf extends MyFrame{
	public void run() {
		int x=-10;
		int y=-10;
		int w=10;
		int h=10;
		setColor(0,128,0);
		while(x<=410) {
			fillRect(x,y,w,h);
			x+=w;
			y+=h;
			w+=10;
			h+=10;
		}
	}

}
