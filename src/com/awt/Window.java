package com.awt;

import java.awt.*;

public class Window{
    public static void main(String[] args) {
        //创建窗口对象
        Frame frame = new Frame("Test com.awt.Window");
        //设置窗口位置和大小
        frame.setLocation(100,100);
        frame.setSize(500,300);
        //设置窗口对象可见
        frame.setVisible(true);
    }
}
