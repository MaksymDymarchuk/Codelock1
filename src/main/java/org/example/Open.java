package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Open extends Sequr{

    Scanner in = new Scanner(System.in);

    public Open (String code){
         Prerevirka a = new Prerevirka();
        String g = JOptionPane.showInputDialog("Enter security code");
        //System.out.println("Enter security code = ");
            //String g = in.nextLine();
            if(code.equals(g)){
                //System.out.println("Door opened");
                String s = String.format("Door opened");
                JOptionPane.showMessageDialog(null, s, "information", JOptionPane.INFORMATION_MESSAGE);
            }
            else a.Previrka();
        }
    }

