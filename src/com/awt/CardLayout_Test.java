package com.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayout_Test {
    public static void main(String[] args) {
        Frame frame = new Frame("Test CardLayout on com.awt.Window");

        //创建一个Panel，存储多张卡片
        Panel p1=new Panel();
        //创建CardLayout对象，把该对象设置给Panel
        CardLayout cardLayout= new CardLayout();
        p1.setLayout(cardLayout);
        //往Panel中存储多个组件
        String[] names={"First","Second","Third","Forth","Fifth"};
        for (String name : names) {
            p1.add(name, new Button(name));
        }
        //把Panel放到Frame中间展示
        frame.add(p1);
        //创建Panel p2，用来存储多个按钮组件
        Panel p2 = new Panel();
        //创建5个按钮组件
        Button b1 = new Button("Last");
        Button b2 = new Button("Next");
        Button b3 = new Button("First");
        Button b4 = new Button("Final");
        Button b5 = new Button("Third");
        //创建一个事件监听器，监听按钮点击动作
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String actionCommand = e.getActionCommand();   //获取按钮上的文字
                switch (actionCommand) {
                    case "Last" -> cardLayout.previous(p1);
                    case "Next" -> cardLayout.next(p1);
                    case "First" -> cardLayout.first(p1);
                    case "Final" -> cardLayout.last(p1);
                    case "Third" -> cardLayout.show(p1, "Third");
                }
            }
        };
        //把事件监听器与按钮绑定
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        //把按钮添加到p2中
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        //把p2放到frame的南部区域
        frame.add(p2,BorderLayout.SOUTH);

        //设置WindowListener，监听用户点击X的动作，如果点击X，则关闭窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //停止当前程序
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}