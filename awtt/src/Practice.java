import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Practice extends Frame implements ActionListener{
    String name="",hobbies="",gender="",address="",city="",skills="";

    Label l1,l2,l3,l4,l5,l6,l7;
    TextField tf1,tf2;
    Checkbox c1,c2,c3,c4,c5;
    TextArea ta;
    Choice ch;
    List lt;
    Scrollbar sb,sb1;

    MenuBar mb;
    Menu m1,m2,m3;

    Button bt;

    Practice()
    {
        setSize(500,500);
        setVisible(true);
        setBackground(Color.gray);
        setTitle("Form");
        setLayout(new FlowLayout());
        setIconImage(new ImageIcon("799795.jpg").getImage());
        setResizable(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        l1=new Label("Name",Label.RIGHT);
        l2=new Label("Password");
        l3=new Label("Hobbies");
        l4=new Label("Gender");
        l5=new Label("Address");
        l6=new Label("city");
        l7=new Label("skills");

        a a=new a();
        tf1=new TextField("enter your name",20);
        tf1.setForeground(Color.gray);
        tf1.addMouseListener(a);

        tf2=new TextField("enter your password");
        tf2.setForeground(Color.gray);
        tf2.setEchoChar('*');
        tf2.addMouseListener(a);

        b b=new b();
        c1=new Checkbox("Reading");
        c1.addItemListener(b);

        c2=new Checkbox("Dancing");
        c2.addItemListener(b);

        c3=new Checkbox("Singing");
        c3.addItemListener(b);

        CheckboxGroup cg=new CheckboxGroup();

        c4=new Checkbox("Male",false,cg);
        c5=new Checkbox("Female",false,cg);

        ta=new TextArea("enter your address",5,20,TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta.setForeground(Color.gray);
        ta.addMouseListener(new d());

        ch=new Choice();
        ch.addItemListener(new c());
        ch.add("rohtak");
        ch.add("mumbai");
        ch.add("pune");
        ch.add("bhopal");
        ch.add("jaipur");

        lt=new List(3,true);
        lt.add("c");
        lt.add("cpp");
        lt.add("java");
        lt.add("c#");
        lt.add("hadoop");
        lt.add("sdjdhkdjhlkdssjhgfdsasdfuiopmhh jfh");

        sb=new Scrollbar(Scrollbar.VERTICAL);
        sb.setBounds(450,100,50,400);
        sb1=new Scrollbar(Scrollbar.HORIZONTAL);
        sb1.setBounds(0,450,400,50);
        sb.addAdjustmentListener(new e(this));

        mb=new MenuBar();
        setMenuBar(mb);

        m1=new Menu("File");
        mb.add(m1);

        m2=new Menu("Edit",true);
        mb.add(m2);

        MenuItem mi1,mi2,mi3,mi4,mi5;
        mi1=m1.add(new MenuItem("New"));
        mi1.addActionListener(new e(this));
        mi2=m1.add(new MenuItem("Open"));
        mi3=m1.add(new MenuItem("Close"));
        mi4=m1.add(new MenuItem("-"));
        mi5=m1.add(new MenuItem("Quit"));

        MenuItem mi6,mi7,mi8,mi9;
        mi6=m2.add(new MenuItem("Cut"));
        mi7=m2.add(new MenuItem("Copy"));
        mi8=m2.add(new MenuItem("Paste"));
        mi9=m2.add(new MenuItem("-"));

        m3=new Menu("Special");
        m2.add(m3);

        MenuItem mi10,mi11,mi12;
        mi10=m3.add(new MenuItem("First"));
        mi11=m3.add(new MenuItem("Second"));
        mi12=m3.add(new MenuItem("Third"));

        CheckboxMenuItem cmi1,cmi2;
        cmi1=new CheckboxMenuItem("Debug");
        cmi2=new CheckboxMenuItem("Testing");
        m2.add(cmi1);
        m2.add(cmi2);

        bt=new Button("Submit");
        bt.addActionListener(this);

        add(l1);add(tf1);
        add(l2);add(tf2);
        add(l3);add(c1);add(c2);add(c3);
        add(l4);add(c4);add(c5);
        add(l5);add(ta);
        add(l6);add(ch);
        add(l7);add(lt);
        add(sb);add(sb1);
        add(bt);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name=tf1.getText();

        if(c1.getState()==true)
            hobbies+=c1.getLabel();
        if(c2.getState()==true)
            hobbies+=c2.getLabel();
        if(c3.getState()==true)
            hobbies+=c3.getLabel();

        if(c4.getState()==true)
            gender="Male";
        else
            gender="Female";

        address=ta.getText();

        city=ch.getSelectedItem();

        String[] str=lt.getSelectedItems();
        for(String s:str)
            skills+=s;

        repaint();

    }

    public void paint(Graphics g)
    {
        g.drawString(name,10,300);
        g.drawString(hobbies,10,310);
        g.drawString(gender,10,320);
        g.drawString(address,10,330);
        g.drawString(city,10,340);
        g.drawString(skills,10,350);
        skills="";
        hobbies="";
    }

    public static void main(String[] args) {
        Practice p=new Practice();

    }
}

class a extends MouseAdapter
{
    @Override
    public void mouseClicked(MouseEvent e) {
        ((TextField)e.getSource()).setText("");
    }

}

class b implements ItemListener
{
    public void itemStateChanged(ItemEvent e)
    {
        Checkbox c=(Checkbox)e.getSource();
        if(c.getState()==true)
        {
            ((Checkbox)e.getSource()).setForeground(Color.red);
        }
        else
            ((Checkbox)e.getSource()).setForeground(Color.black);

    }
}
class c implements ItemListener
{
    public void itemStateChanged(ItemEvent e) {
        Choice c = (Choice) e.getSource();
        c.setBackground(Color.cyan);
    }
}
class d extends MouseAdapter
{
    @Override
    public void mouseClicked(MouseEvent e) {
        ((TextArea)e.getSource()).setText("");
    }

}

class e implements AdjustmentListener,ActionListener

{
    Frame f;
    e(Frame f)
    {
        this.f=f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyDialog d=new MyDialog(f,"New");
        d.setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        Random r=new Random();
        int red=r.nextInt(255);
        int green=r.nextInt(255);
        int blue=r.nextInt(255);
        f.setBackground(new Color(red,green,blue));
    }
}

class MyDialog extends Dialog implements ActionListener
{
    Button b;
    MyDialog(Frame p,String name)
    {
        super(p,name,true);
        setSize(100,100);
        //setBackground(Color.gray);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        b=new Button("ok");
        b.addActionListener(this);
        add(b);
    }
    public void actionPerformed(ActionEvent e)
    {
        dispose();
    }
    public void paint(Graphics g)
    {
        g.drawString("Press the button to close",20,80);
    }
}
