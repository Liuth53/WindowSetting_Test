package com.awt;

import java.awt.*;

    public class BorderLayout_Test {
        public static void main(String[] args) {
            //创建window对象
            Frame frame = new Frame("Test BorderLayout on com.awt.Window");
            //给frame设置BorderLayout布局管理器
            frame.setLayout(new BorderLayout(30,10));
            //往frame指定区域添加组件
            frame.add(new Button("N"),BorderLayout.NORTH);
            frame.add(new Button("S"),BorderLayout.SOUTH);
            frame.add(new Button("W"),BorderLayout.WEST);
            frame.add(new Button("E"),BorderLayout.EAST);
            frame.add(new Button("C"),BorderLayout.CENTER);
            //设置窗口对象可见
            frame.pack();
            frame.setVisible(true);
        }
}


