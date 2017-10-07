import java.applet.Applet;
import java.awt.Color;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class ColorChangeUsingScrallBar extends Applet implements AdjustmentListener
{
	Scrollbar sbr,sbg,sbb;
	
	public void init()
	{
		setLayout(null);
		
		setBackground(Color.BLACK);
		sbr=new Scrollbar(0,0,2,0,255);
		sbr.setBackground(Color.RED);
		
		sbb=new Scrollbar(0,0,2,0,255);
		sbb.setBackground(Color.BLUE);
		
		sbg=new Scrollbar(0,0,2,0,255);
		sbg.setBackground(Color.GREEN);
		
		sbr.setBounds(100, 300, 400, 50);
		add(sbr);
		sbr.addAdjustmentListener(this);
		
		sbb.setBounds(100, 400, 400, 50);
		add(sbb);
		sbb.addAdjustmentListener(this);
		
		sbg.setBounds(100, 500, 400, 50);
		add(sbg);
		sbg.addAdjustmentListener(this);
		
	}

	

	public void adjustmentValueChanged(AdjustmentEvent ae) {
		// TODO Auto-generated method stub
	
		int r=sbr.getValue();
		int b=sbb.getValue();
		int g=sbg.getValue();
		Color  col=new Color(r,b,g);
		setBackground(col);
		
	}

}
