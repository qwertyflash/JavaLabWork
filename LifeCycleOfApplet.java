import java.applet.*;
import java.awt.*;


public class LifeCycleOfApplet extends Applet
{
	Font f;
	public void init()
	{
		System.out.print("\nin INIT");
		f=new Font("\nArial",Font.BOLD+Font.PLAIN,30);
		setFont(f);
		setBackground(Color.cyan);
		setForeground(Color.blue);
		
	}
	
	public void start()
	{
		
	}
	public void paint(Graphics g)
	{	
		g.drawString("HELLO", 10, 500);
		g.drawLine(50, 55, 200, 55);
		g.setColor(Color.red);
		g.drawArc(500, 300, 100, 100, 90, 270);
		g.drawArc(500, 300, 500, 500, 90, 270);
		g.fillArc(600, 300, 100, 100, 90, 270);
		//int [X] = { 700 , 800 , 500 }
		//int [Y]={ 700 , 800 , 800 }
		//g.drawPolygon(X, Y, 3);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
