package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Coldwarm on 18/7/27.
 */
public class LoginFrame extends JFrame {
    JButton b1=new JButton("红色");
    JButton b2=new JButton("绿色");
    JButton b3=new JButton("黑色");

    //构造无参构造器把主要的方法放在构造器里,然后在main方法里面调
    public LoginFrame(){
        setBounds(25,25,250,250);
        JPanel c = new JPanel();
        c.setLayout(new FlowLayout());
        c.add(b1);
        c.add(b2);
        c.add(b3);
        add(c,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //注意：此处是匿名内部类
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.RED);
            }
        });

        //注意：此处是匿名内部类
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.green);
            }

        });

        //注意：此处是匿名内部类
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.BLACK);
            }

        });

    }
    public static void main(String[] args) {
        new LoginFrame();
    }
}
