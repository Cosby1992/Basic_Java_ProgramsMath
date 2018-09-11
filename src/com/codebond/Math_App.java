package com.codebond;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Math_App {
    private JButton buttonmsg;
    private JPanel panelmain;

    public Math_App() {
        buttonmsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Welcome to THE MATH PROGRAM! Here you will find" +
                                                                            "\n everything you need to find anything you wanna " +
                                                                            "\nknow about math!" +
                                                                            "\nTHE MATH PROGRAM(c) is not responsible, and cannot" +
                                                                            "\nbe held acountable for any lies there might occur in " +
                                                                            "\nthis welcome text.");
            }
        });


    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Math_App");
        frame.setContentPane(new Math_App().panelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
