
public class Animation extends MyFrame{
	public void run() {
		//ctrl+shift+Fでインデントをそろえる
		double y=0;
		double x=0;
		float count=0;
		while(true) {
			clear();
			setColor(0,128,0);
			fillRect(200+x*100,100+y*200,30,30);
			x=Math.sin(count);
			y=Math.cos(count);
			if(y<0) {
				y*=-1;
			}
			count+=10*Math.PI/180;
			sleep(0.05);
		}
	}

}
