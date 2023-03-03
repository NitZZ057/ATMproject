package ATMproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1,b2,b3,b4;

    Transactions(){

        setContentPane(new JLabel(new ImageIcon("E:\\E users\\src\\ATMproject\\atm82.jpg")));
        l1=new JLabel("Please Select Your Transaction");
        l1.setFont(new Font("System",Font.BOLD,28));

        b1=new JButton("DEPOSIT");
        b1.setFont(new Font("System",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2=new JButton("WITHDRAW");
        b2.setFont(new Font("System",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3=new JButton("BALANCE ENQUIRY");
        b3.setFont(new Font("System",Font.BOLD,15));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        b4=new JButton("EXIT");
        b4.setFont(new Font("System",Font.BOLD,15));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);

        l1.setBounds(90,100,700,40);
        add(l1);

        b1.setBounds(125,250,180,60);
        add(b1);
        b2.setBounds(327,250,168,60);
        add(b2);
        b3.setBounds(125,380,180,60);
        add(b3);
        b4.setBounds(327,380,168,60);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,650);
        setLocation(400,100);
        setVisible(true);
        setLayout(null);

    }

    public void actionPerformed(ActionEvent a){    //overriding actionPerformed method

        if (a.getSource()==b1){
            new Deposit().setVisible(true);
            setVisible(false);
        }else if (a.getSource()==b2){
            new Withdraw().setVisible(true);
            setVisible(false);
        }else if (a.getSource()==b3){
            new Balance().setVisible(true);
            setVisible(false);
        }else if (a.getSource()==b4){
            JOptionPane.showMessageDialog(null,"Thank You For Visiting Our ATM....!");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Transactions().setVisible(true);

    }
}




















// setFont(new Font("System",Font.BOLD,22));
//        Font f=getFont();
//        FontMetrics fm=getFontMetrics(f);
//        int x=fm.stringWidth("TRANSACTION");
//        int y=fm.stringWidth(" ");
//        int z=getWidth()-(3*x);
//        int w=z/y;
//        String pad="";
//
//        pad =String.format("%"+x+"s",pad);
//        setTitle(pad+"TRANSACTION");