package javaBasics.excercise;

import javax.swing.*;

public class FooClass extends JFrame {

    public static void main(String[] args) {
        FooClass fc = new FooClass();
        int number = 0;
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Podaj liczbę:", "Binary Converter", JOptionPane.QUESTION_MESSAGE);
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                if (input == null) {
                    System.exit(0);
                } else {
                    continue;
                }
            }
            String answer = fc.intToBinaryString(number);
            JOptionPane.showMessageDialog(null, answer, "Converted into binary", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public FooClass(){
    }

    private void closeIt(){
        this.getContentPane().setVisible(false);
        this.dispose();
    }

    protected String intToBinaryString(int number){
        String str = "";
        if (number < 1) return "0";
        while (number > 0) {                            // while (a > 0) do
            str = number % 2 + str;                     // res := Str(a mod 2) + res
            number /= 2;                                // a := a div 2
        }
        return str;
    }
}
