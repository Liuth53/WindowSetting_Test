package com.awt;

import java.awt.*;

public class FlowLayout_Test {
    public static void main(String[] args) {
        //创建window对象
        Frame frame = new Frame("Test FlowLayout on com.awt.Window");
        //setLayout方式设置布局管理器
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        //添加多个对象到frame中
        for(int i = 0; i < 100;i++){
            frame.add(new Button("Button"+i));
        }
        //设置最佳大小，pack方法
        frame.pack();
        //设置窗口对象可见
        frame.setVisible(true);
    }

}
