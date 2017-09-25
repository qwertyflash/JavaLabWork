import java.applet.Applet;
import java.awt.Font;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class LableDraw extends Applet implements AdjustmentListener
{
	
	//------------------complete---------------------
	Label lab;
	Font f;
	Scrollbar sb;
	
	public void init()
	{
		setLayout(null);
		lab=new Label("elHello");
		f=new Font("Arial",Font.BOLD,70);
		sb=new Scrollbar(0,30,2,1,100);
		sb.setBounds(100, 400, 800, 50);
		add(sb);
		
		
		setFont(f);
		lab.setBounds(100, 100, 1600, 80);
		
		add(lab);
		sb.addAdjustmentListener(this);
	
	}



	public void adjustmentValueChanged(AdjustmentEvent ae) {
		// TODO Auto-generated method stub
		
		int size=ae.getValue();
		f=new Font("Arial",Font.BOLD,size);
		lab.setFont(f);
	}
}
