package org.example;

import javax.swing.*;
import java.util.Arrays;

public class Unlock extends Sequr {

    String code;

    public Unlock(String num, String w) {
        String c = "";
        int n = num.length();//з'ясовуємо загальну кількість введених чисел
        String[] telephone = new String[n];//присвоюємо розмір масиву
        for (int j = 0; j < telephone.length; j++) {
            telephone[j] = String.valueOf(num.charAt(j));
        }
        // створюємо числовий масив зі строкового
        int[] values = Arrays.stream(telephone)
                .mapToInt(Integer::parseInt)
                .toArray();
        int l = w.length();//з'ясовуємо загальну кількість введених букв
        String[] words = new String[l];//присвоюємо розмір масиву
        for (int j = 0; j < words.length; j++) {
            words[j] = String.valueOf(w.charAt(j));
        }
        for (int r : values) {//r приймає значення з масиву a в циклі
            for (int j = 0; j < words.length; j++)
                if (r == j) { // в циклі порівнюємо змінну r з індексом значення масиву text
                    // s = text[j];// коли результат порівняння (r з індексом j)
                    // співбадає записуємо в змінну s
                    // в тому порядку в якому йдуть змінні масиву
                    String x = words[r];
                    c = c + x;
                }
        }
        this.code = c;
        //System.out.println("\n" +c);
        String parol = String.format("Code is " + c);
        JOptionPane.showMessageDialog(null, parol, "information", JOptionPane.PLAIN_MESSAGE);
        Open v = new Open(c);
}}


