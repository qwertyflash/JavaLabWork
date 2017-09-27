import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class DrawLine extends Applet implements MouseListener , MouseMotionListener 
{
	String msg;
	int x1,y1,x2,y2;
//	--------------------complete----------------------------------
	public void init()
	{
		
		x1=0;y1=0;x2=0;y2=0;
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawLine(x1,y1, x2, y2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void mouseDragged(MouseEvent me) {
		// TODO Auto-generated method stub
		x2=me.getX();
		y2=me.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		
				
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		x1=me.getX();
		y1=me.getY();
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
