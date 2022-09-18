
import java.awt.*;

public class Graphicss extends Frame{
    public static void main(String[] args) {
        Frame f=new Frame("Payal");
        f.setVisible(true);
        f.setSize(500,500);
        Graphics g=f.getGraphics();
        try{Thread.sleep(1000);}catch(InterruptedException e){}
        System.out.println("awake");
//        g.drawString("Payal",50,50);
//        g.drawLine(60,60,100,100);
//        g.setColor(new Color(255,255,0));
//        g.fillRect(0,0,300,300);
//        g.setColor(new Color(255,0,0));
//        g.setFont(new Font(Font.DIALOG,Font.BOLD,3));
//        g.drawString("abcd",20,20);
//        g.fillOval(100,100,30,30);
//        g.drawArc(150,150,50,50,-90,45);


//        Button n=new Button("abcd");
//        n.setSize(100,100);
//        f.add(n);
//        Graphics g1=n.getGraphics();
//        g1.setColor(Color.red);
//        g1.drawString("payal",20,20);
//        g1.fillOval(50,50,20,20);

        Label l=new Label("acbdb");
        //l.setSize(40,10);
        f.add(l);
        Graphics g3=l.getGraphics();
        g3.setColor(Color.red);
        g3.drawString("hello",0,0);
        g3.fillRect(10,10,20,20);

        try{Thread.sleep(10000);}catch(InterruptedException e){}
        System.exit(0);
    }
}
