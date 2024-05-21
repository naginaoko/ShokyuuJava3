
public class RectIf extends MyFrame{
	public void run() {
		int x=30;
		int r=0;
		int g=0;
		int b=0;
		setColor(r,g,b);
		while(x<=210) {
			fillRect(x,80,10,100);
			x+=20;
			r+=20;
			g+=20;
			b+=20;
			setColor(r,g,b);
		}
	}

}
