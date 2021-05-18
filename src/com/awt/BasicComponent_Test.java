package com.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class BasicComponent_Test {
    Frame frame = new Frame("com.awt.BasicComponent_Test");
    TextArea ta = new TextArea(5,20);

    Choice colorchoose = new Choice();

    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox male = new Checkbox("man",cbg,true);
    Checkbox female = new Checkbox("Woman",cbg,false);
    Checkbox isMarried = new Checkbox("Married?");
    TextField tf = new TextField(50);
    Button OK = new Button("OK");
    List colorlist = new List(6,true);

    public void init(){
        //组装界面:整体到局部
        Box bBox = Box.createHorizontalBox();
        bBox.add(tf);
        bBox.add(OK);
        frame.add(bBox,BorderLayout.SOUTH);

        colorchoose.add("Red");
        colorchoose.add("Blue");
        colorchoose.add("Green");

        Box cBox = Box.createHorizontalBox();
        cBox.add(colorchoose);
        cBox.add(male);
        cBox.add(female);
        cBox.add(isMarried);

        Box topLeft =Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(cBox);

        colorlist.add("Red");
        colorlist.add("Blue");
        colorlist.add("Green");

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorlist);

        frame.add(top);


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


    public static void main(String[] args) {
        new BasicComponent_Test().init();



    }
}
