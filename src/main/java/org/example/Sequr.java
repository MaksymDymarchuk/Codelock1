package org.example;

import javax.swing.JOptionPane;

public class Sequr {

    public static void main(String[] args) {
        Zapyt r = new Zapyt();
        String t = String.format("%s",r);
        JOptionPane.showMessageDialog(null, t, "information", JOptionPane.INFORMATION_MESSAGE);
        //System.out.printf("%s", r);
        String ab = String.valueOf(t);
        Zapyt1 w = new Zapyt1();
        String tt = String.format("%s",w);
        JOptionPane.showMessageDialog(null, tt, "information", JOptionPane.INFORMATION_MESSAGE);
        //System.out.printf("%s", w);
        String bt = String.valueOf(tt);
        Unlock o = new Unlock(ab, bt);
    }}






