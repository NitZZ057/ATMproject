package ATMproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Withdraw extends JFrame implements ActionListener {

    JTextField t1;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;

    Withdraw(){

        setContentPane(new JLabel(new ImageIcon("E:\\E users\\src\\ATMproject\\atm82.jpg")));
        l1=new JLabel("Maximum Daily withdrawal");
        l1.setFont(new Font("System",Font.BOLD,35));
        l2=new JLabel("Is RS. 10,000");
        l2.setFont(new Font("System",Font.BOLD,35));
        l3=new JLabel("Enter Your Amount");
        l3.setFont(new Font("System",Font.BOLD,30));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,22));

        b1=new JButton("WITHDRAW");
        b1.setFont(new Font("System",Font.BOLD,16));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,16));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b3=new JButton("EXIT");
        b3.setFont(new Font("System",Font.BOLD,18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        l1.setBounds(90,60,800,60);
        add(l1);
        l2.setBounds(180,100,800,60);
        add(l2);
        l3.setBounds(155,130,375,200);
        add(l3);
        t1.setBounds(150,255,300,50);
        add(t1);

        b1.setBounds(165,320,125,50);
        add(b1);
        b2.setBounds(300,320,125,50);
        add(b2);
        b3.setBounds(190,450,190,50);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750,650);
        setLocation(400,100);
        setVisible(true);
        setLayout(null);

    }

    public void actionPerformed(ActionEvent a){
        String a1 = t1.getText();

        if (a.getSource()==b1){
            if (t1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter The Amount You Want To Withdraw");
            }else if (LogIn.balance < Double.parseDouble(t1.getText())){
                JOptionPane.showMessageDialog(null,"Oops..!\n"+"\nInsufficient balance");
            }else if (10000 < Double.parseDouble(t1.getText())){
                JOptionPane.showMessageDialog(null,"Oops..!\n"+"\nWithdrawal limit exceeded");
            }
            else{
                LogIn.balance = LogIn.balance-Integer.parseInt(a1);
                JOptionPane.showMessageDialog(null,"RS."+a1+" Debited Successfully"+"\n\n"+"Please Collect Your Cash..");
                t1.setText("");
            }
        }else if (a.getSource()==b2){
            new Transactions().setVisible(true);
            setVisible(false);
        }else if (a.getSource()==b3){
            JOptionPane.showMessageDialog(null,"Thank You For Visiting Our ATM....!");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Withdraw().setVisible(true);

    }
}





















// setFont(new Font("System",Font.BOLD,22));
//        Font f=getFont();
//        FontMetrics fm=getFontMetrics(f);
//        int x=fm.stringWidth("WITHDRAW");
//        int y=fm.stringWidth(" ");
//        int z=getWidth()-(5*x);
//        int w=z/y;
//        String pad="";

// pad =String.format("%"+x+"s",pad);
//        setTitle(pad+"WITHDRAW");
