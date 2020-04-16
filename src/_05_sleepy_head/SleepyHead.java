package _05_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
import javax.swing.JOptionPane;
public class SleepyHead {
    public static void main(String[] args) {
        boolean isWeekday, isVacation;
        /* You MUST use the above boolean variables in your code */
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        isWeekday = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        isVacation = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleep in?", JOptionPane.YES_NO_OPTION);
        /*
         * Print sleep iN? if it is a vacation or a weekend. If its a weekday,
         * print get up lazybones! If it is a weekday, and we are on vacation,
         * print sleep in?.
         */
        if (isWeekday == false && isVacation == true){
        	JOptionPane.showMessageDialog(null, "Sleep in?");
        }
        if (isWeekday == false){
        	JOptionPane.showMessageDialog(null, "Sleep in?");
        }
        if (isWeekday == true){
        	JOptionPane.showMessageDialog(null, "Get up lazybones!");
        }
        if (isWeekday == true && isVacation == true){
        	JOptionPane.showMessageDialog(null, "Sleep in?");
        }
        }
    }