
public class RectIf extends MyFrame{
	public void run() {
		int x=10;
		setColor(0,128,0);
		while(x<=190) {
			fillRect(x+20,80,10,x);
			x+=20;
		}
	}

}
