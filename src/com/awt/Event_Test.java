package com.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Event_Test {
        Frame frame = new Frame("EventTest");
        TextField tf= new TextField(30);
        //事件源
        Button b1 = new Button("Confirm");

        public void init(){
            //组装视图

            //监听器
    //        MyListener myListener = new MyListener();
            //注册监听
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    tf.setText("Hello Word");
                }
            });


            //把tf和b1放入frame中
            frame.add(tf,BorderLayout.NORTH);
            frame.add(b1,BorderLayout.SOUTH);
            frame.pack();
            frame.setVisible(true);

        }
    //    private class MyListener implements ActionListener{
    //
    //        @Override
    //        public void actionPerformed(ActionEvent e) {
    //            tf.setText("Hello Word");
    //        }
    //    }


    public static void main(String[] args) {
        new Event_Test().init();
    }
}
