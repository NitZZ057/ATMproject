package ATMproject;         //user defined package(group of classes,interfaces,subpackages)

import java.awt.*;          //built-in packages
import java.awt.event.*;    //event is subpackage of package awt
import javax.swing.*;       //* loads all classes and interfaces but not subpackages

public class LogIn extends JFrame implements ActionListener {      //ActionListener is interface used to add actions
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2;
    public static double balance;

    LogIn(){

        setContentPane(new JLabel(new ImageIcon("E:\\E users\\src\\ATMproject\\atm82.jpg")));
        l1=new JLabel("Welcome To ATM");
        l1.setFont(new Font("Osward",Font.BOLD,38));
        l2=new JLabel("Card No: ");
        l2.setFont(new Font("Raleway",Font.BOLD,28));
        l3=new JLabel("PIN: ");
        l3.setFont(new Font("Raleway",Font.BOLD,28));

        tf1=new JTextField(15);
        tf1.setFont(new Font("Arial",Font.BOLD,14));
        pf2=new JPasswordField(15);
        pf2.setFont(new Font("Arial",Font.BOLD,14));

        b1 = new JButton("ENTER");
        b1.setFont(new Font("Arial",Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("CLEAR");
        b2.setFont(new Font("Arial",Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        l1.setBounds(165,40,450,200);
        add(l1);
        l2.setBounds(125,150,375,200);
        add(l2);
        l3.setBounds(125,225,375,200);
        add(l3);

        tf1.setBounds(255,235,230,30);
        add(tf1);
        pf2.setBounds(255,310,230,30);
        add(pf2);

        b1.setBounds(210,400,100,30);
        add(b1);
        b2.setBounds(340,400,100,30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(790,670);
        setLocation(400,100);
        setVisible(true);
        setLayout(null);

    }


    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            if (tf1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Valid Card No.");
            }else if (pf2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Valid Pin No.");
            }else if(tf1.getText().equals("123456789") && pf2.getText().equals(String.valueOf(1234))){
                new Transactions().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect pin");
            }
        }else if (ae.getSource()==b2){
            tf1.setText("");
            pf2.setText("");
        }
    }

    public static void main(String[] args) {
           new LogIn().setVisible(true);
    }
}













//setFont(new Font("System",Font.BOLD,22));
//        Font f=getFont();
//        FontMetrics fm=getFontMetrics(f);
//        int x=fm.stringWidth("AUTOMATED TELLER MACHINE");
//        int y=fm.stringWidth(" ");
//        int z=getWidth()-x;
//        int w=z/y;
//        String pad="";

//        pad =String.format("%"+x+"s",pad);
//        setTitle(pad+"AUTOMATED TELLER MACHINE");

// String a = tf1.getText();
// String b = pf2.getText();