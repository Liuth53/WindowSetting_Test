package com.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog_Test2 {
    public static void main(String[] args) {
        Frame frame = new Frame("com.awt.Dialog_Test");
        //创建两个对话框，模式与非模式
        Dialog d1 = new Dialog(frame,"ModelDialog",true);

        //创建一个垂直的Box容器，把文本框和按钮添加到Box中
        Box vbox = Box.createVerticalBox();
        vbox.add(new TextField(20));
        vbox.add(new Button("Confirm"));
        //把Box容器添加到Dialog中
        d1.add(vbox);
        //通过setBounds当前对话框的位置和大小
        d1.setBounds(20,30,300,200);

        //创建两个按钮
        Button b1 = new Button("Open ModelDialog");

        //给两个按钮添加行为（事件）
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });

        //把按钮添加到frame中
        frame.add(b1,BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
    }
}
