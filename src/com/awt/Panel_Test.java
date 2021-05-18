package com.awt;

import java.awt.*;

public class Panel_Test {
    public static void main(String[] args) {
        //创建window对象
        Frame frame = new Frame("Test Panel on com.awt.Window");
        //创建panel对象
        Panel p =new Panel();
        //创建文本框和按钮放入panel
        p.add(new TextField("创建文本框"));
        p.add(new Button("测试按钮"));
        //把panel放入window中
        frame.add(p);
        //设置窗口位置和大小
        frame.setBounds(100,100,500,300);
        //设置窗口对象可见
        frame.setVisible(true);
    }
}