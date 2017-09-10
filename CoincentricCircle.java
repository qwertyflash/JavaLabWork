import java.applet.*;
import java.awt.*;
import java.util.Random;
//-----------complete----------------------------

public  class CoincentricCircle extends Applet implements Runnable
{
	int c,r,d,rr,gg,bb;
	int flag;
	Random ra;
	Thread th;
	
	public void init()
	{
		th=new Thread(this);
		ra=new Random();
		flag=1;
		c=550;
		r=300;
		d=100;
		setBackground(Color.cyan);
		th.start();
		
	}
	public void run()
	{
		while(true)
		{	
				rr=ra.nextInt(256);
				gg=ra.nextInt(256);
				bb=ra.nextInt(256);
				repaint();
				try{Thread.sleep(60);}
				catch(Exception e){}
				if(flag==1)
				{
					if(c>=300)
					{
						r=r-5;
						c=c-5;
						d=d+10;
					}
					else flag=0;
				}
				if(flag==0)
				{
					if(c<=540)
					{
						r=r+10;
						c=c+10;
						d=d-20;
					}
					else flag=1;
				}
				
				
				
				//d=d+5;
			
		}
	}
	
	public void paint (Graphics g)
	{
		Color col=new Color(rr,gg,bb);
		g.setColor(col);
		g.drawOval(c, r, d, d);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
