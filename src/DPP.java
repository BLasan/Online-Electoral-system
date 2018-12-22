
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DPP {
    public static void main(String args[]){
        Candidate obj=new Candidate();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(300,300);
        obj.setVisible(true);
        obj.setTitle("Candidates");
    }
}

