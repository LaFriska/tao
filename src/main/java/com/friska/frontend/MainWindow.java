package com.friska.frontend;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;


public class MainWindow {

    private static final Color red = new Color(255, 150, 150);

    private final JFrame window;

    public MainWindow(){
        window = new JFrame();
        window.setTitle("Math Symbols");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 500);
        window.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea();
        textArea.setMargin(new Insets(12,12,12,12));
        addBorder(textArea, new LineBorder(red, 5, false));
        addBorder(textArea, new LineBorder(Color.BLACK, 30,false));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        window.add(scrollPane);
        window.getContentPane().setBackground(Color.black);
    }

    private void addBorder(JTextArea component, Border border){
        if(component.getBorder() == null){
            component.setBorder(border);
        }else{
            component.setBorder(new CompoundBorder(border, component.getBorder()));
        }
    }

    public void show(){
        window.setVisible(true);
    }

}
