    package org.example;

    import javax.swing.*;
    import java.util.Scanner;

    public class Zapyt1 extends Sequr{

        String a = "";

        public Zapyt1(){
            Scanner p = new Scanner(System.in);
            boolean i = true;
           do {
        //System.out.print("\n" + "Enter word = ");
               //String a = p.nextLine();
               String a = JOptionPane.showInputDialog("Enter code word");
            int y = a.length();
             if(10<=y){
            this.a = a;
             i = true;}
             else {i = false;
                 //System.out.print("Ведене слово має мати не меньше 10 знаків ");
                 String w = String.format("Your word may be more then 10 sign");
               JOptionPane.showMessageDialog(null, w, "information", JOptionPane.INFORMATION_MESSAGE);
             }
    }
        while(!i);}
        public String toString(){return String.format("%s", a);}
}

