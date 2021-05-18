package com.awt;

import javax.swing.*;
import java.awt.*;

public class BoxLayout_Test {
    public static void main(String[] args) {
        Frame frame = new Frame("com.awt.BoxLayout_Test");
        //基于Frame容器创建一个BoxLayout对象，该对象组件垂直存放
        BoxLayout boxLayout = new BoxLayout(frame,BoxLayout.Y_AXIS);
        //把BoxLayout对象设置给Frame
        frame.setLayout(boxLayout);
        //往frame中添加按钮
        frame.add(new Button("Button1"));
        frame.add(new Button("Button2"));

        frame.pack();
        frame.setVisible(true);
    }
}
