import java.applet.*;
import java.awt.Color.*;
import java.awt.*;


public class Face extends Applet
{
public void  init()
{
//FACE

}	

public void paint(Graphics g)
{Color c1=new Color(223,219,32);
		g.setColor(c1);
//g.fillOval(Color.blue);
g.fillOval(400,250,200,200);
c1=new Color(11,112,234);
		g.setColor(c1);
		g.drawOval(365,325,35,75);
g.drawOval(600,325,35,75);
g.drawOval(440,330,25,25);
g.drawOval(535,330,25,25);
g.drawRect(445,380,100,20);
g.drawLine(445,390,545,390);
g.drawRect(445,380,10,20);g.drawRect(445,380,20,20);g.drawRect(445,380,30,20);
g.drawRect(445,380,40,20);g.drawRect(445,380,50,20);g.drawRect(445,380,60,20);g.drawRect(445,380,70,20);g.drawRect(445,380,80,20);g.drawRect(445,380,90,20);
g.drawLine(500,327,520,360);
g.drawLine(500,327,480,360);
g.drawLine(520,360,480,360);


}


}