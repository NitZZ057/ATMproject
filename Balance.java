package ATMproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Balance extends JFrame implements ActionListener {

    JLabel l1,l2;
    JButton b1,b2;

    Balance(){

        setContentPane(new JLabel(new ImageIcon("E:\\E users\\src\\ATMproject\\atm82.jpg")));
        l1=new JLabel("Your Current Balance Is...");
        l1.setFont(new Font("System",Font.BOLD,30));
        l2=new JLabel("RS. "+String.format("%.2f",LogIn.balance));
        l2.setFont(new Font("System",Font.BOLD,35));

        b1=new JButton("EXIT");
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        l1.setBounds(100,150,400,200);
        add(l1);
        l2.setBounds(150,280,800,60);
        add(l2);

        b2.setBounds(119,400,160,50);
        add(b2);
        b1.setBounds(299,400,160,50);
        add(b1);

        b2.addActionListener(this);
        b1.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750,650);
        setLocation(400,100);
        setVisible(true);
        setLayout(null);

    }

    public void actionPerformed(ActionEvent a){

        if (a.getSource()==b2){
            new Transactions().setVisible(true);
            setVisible(false);
        }else if (a.getSource()==b1){
            JOptionPane.showMessageDialog(null,"Thank You For Visiting Our ATM....!");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Balance().setVisible(true);
    }
}






















//setFont(new Font("System",Font.BOLD,22));
//        Font f=getFont();
//        FontMetrics fm=getFontMetrics(f);
//        int x=fm.stringWidth("BALANCE");
//        int y=fm.stringWidth(" ");
//        int z=getWidth()-(5*x);
//        int w=z/y;
//        String pad="";
//
//        pad =String.format("%"+x+"s",pad);
//        setTitle(pad+"BALANCE");