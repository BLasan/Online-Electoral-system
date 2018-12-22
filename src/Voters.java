/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author User
 */
    public class Voters extends JFrame {
    private JFrame f=new JFrame();
    private JLabel label1,label2,label3,label4,label5;
    private JButton button1;
    private JButton button2,button3;
    private JTextField t1,t2,t3,t4,t5;
    public Voters(){
        setLayout(new GridLayout(8,2));
        label1=new JLabel("Name");
        add(label1);
        t1=new JTextField();
        add(t1);
        label2=new JLabel("Address");
        add(label2);
        t2=new JTextField();
        add(t2);
        label3=new JLabel("Division");
        add(label3);
        t3=new JTextField();
        add(t3);
        label4=new JLabel("NIC number");
        add(label4);
        t4=new JTextField();
        add(t4);
        label5=new JLabel("Enter the vote");
        add(label5);
        t5=new JTextField();
        add(t5);
        button2=new JButton("Exit");
        add(button2);
        event1 f=new event1();
        button2.addActionListener(f);
        button3=new JButton("Reset");
        add(button3);
        event2 g=new event2();
        button3.addActionListener(g);
        button1=new JButton("Submit");
        add(button1);
        event e=new event();
        button1.addActionListener(e);
    }
    public class event implements ActionListener{
        public void actionPerformed(ActionEvent e){
              Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\User\\Documents\\Test.accdb");
            String sql="select * from PlayList where Name_full='"+t1.getText()+"'and Address='"+t2.getText()+"'and Division='"+t3.getText()+"'and NIC='"+t4.getText()+"'";
            String g="select * from Candidates where Name_f='"+t5.getText()+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
               JOptionPane.showMessageDialog(null,"Success");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Success");
            }
        }
        catch(ClassNotFoundException | SQLException | HeadlessException m){
        JOptionPane.showMessageDialog(null,m);
        }
    }
     
    }

      public class event1 implements ActionListener{
        public void actionPerformed(ActionEvent f){
            System.exit(0);
        }   
    }
    public class event2 implements ActionListener{
        public void actionPerformed(ActionEvent g){  
                 t1.setText("");
                 t2.setText("");
                 t3.setText("");
                 t4.setText("");
                 t5.setText("");
        }
}
    }
    

