/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author User
 */
public class Candidate extends JFrame{
    private JFrame f=new JFrame();
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4,erLabel;
    private JButton button1;
    private JButton button2,button3;
    private JTextField t1,t2,t3,t4;
    public Candidate(){
        setLayout(new GridLayout(7,4));
        label1=new JLabel("Name");
        add(label1);
        t1=new JTextField();
        add(t1);
        label2=new JLabel("Party");
        add(label2);
        t2=new JTextField();
        add(t2);
        label3=new JLabel("Position");
        add(label3);
        t3=new JTextField();
        add(t3);
        label4=new JLabel("District");
        add(label4);
        t4=new JTextField();
        add(t4);
        button1=new JButton("Submit");
        add(button1);
        event e=new event();
        button1.addActionListener(e);
        button2=new JButton("Exit");
        add(button2);
        event1 f=new event1();
        button2.addActionListener(f);
        button3=new JButton("Reset");
        add(button3);
        event2 k=new event2();
        button3.addActionListener(k);
        erLabel=new JLabel("");
        add(erLabel);
    }
    public class event implements ActionListener{
        public void actionPerformed(ActionEvent e){
           
            String name = t1.getText();
            String party=t2.getText();
            String position=t3.getText();
            String district=t4.getText();
            if(name!=(String)name&&party!=(String)party&&position!=(String)position&&district!=(String)district)
                erLabel.setText("Please enter String values");  
            else {
            JOptionPane.showMessageDialog(f, "Success");
            
        }
    }
    }
        
         public class event1 implements ActionListener{
         public void actionPerformed(ActionEvent f){
            System.exit(0);
        }
         }
          public class event2 implements ActionListener{
         public void actionPerformed(ActionEvent k){
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");
            erLabel.setText(" ");
        }
    }
    }         
    

