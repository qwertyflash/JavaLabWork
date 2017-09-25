import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;






public class ClickCircle extends Applet implements  MouseListener
{
	int x=0,y=0;
//-----------------complete----------------------
	public void init()
	{
		
		
		addMouseListener(this);
	
		
	}
	
/*	public void paint(Graphics g)
	{
		g.drawOval(x, y, 100, 100);
	}
*/
	public void update(Graphics g)
	{
		g.fillOval(x-50, y-50, 100, 100);
		
	}
	
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		x=me.getX();
		y=me.getY();
		repaint();
		

	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
