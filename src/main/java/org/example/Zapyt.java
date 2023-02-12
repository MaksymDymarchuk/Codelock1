        package org.example;

        import java.util.Scanner;
        import javax.swing.JOptionPane;
        import static java.lang.Integer.parseInt;

        public class Zapyt extends Sequr{

            String f = "";
        public Zapyt(){
            Prerevirka a = new Prerevirka();
            Scanner in = new Scanner(System.in);
        boolean q;
            do {
                //System.out.print("\n" + "Enter num of phone = ");
                //String f = in.nextLine();
                String f = JOptionPane.showInputDialog("Enter num of phone");

            try {
            int s = parseInt(f);
            if (s== Numtel.NUM1){this.f = f; q = true;}
            else if (s==Numtel.NUM2){this.f = f; q = true;}
            else if (s==Numtel.NUM3){this.f = f; q = true;}
            else {a.Previrka();q = false;}
            }
        catch (Exception pomylka){q = false;
            //System.out.print("Введіть номер без пробілів, тощо");
            String d = String.format("Enter num of phone without Space and so");
            JOptionPane.showMessageDialog(null, d, "information", JOptionPane.INFORMATION_MESSAGE);
            }}
        while (!q);
         }
        public String toString(){return String.format("%s", f);}
            }
