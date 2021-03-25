import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event_Test2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Event_Test2");
        //事件源
        TextField tf = new TextField(30);
        Choice names = new Choice();
        names.add("a");
        names.add("b");
        names.add("c");

        //给文本添加Listener，监听变化内容
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                String text = tf.getText();
                System.out.println(text);
            }
        });

        //给Choice添加ItemListener，监听条目变化
        names.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object item = e.getItem();
                System.out.println(item);
            }
        });

        //给frame注册ContainerListener监听器，监听容器组件增加
        frame.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                Component child = e.getChild();
                System.out.println(child);
            }

            @Override
            public void componentRemoved(ContainerEvent e) {

            }
        });




        //添加到Frame中
        Box hBox = Box.createHorizontalBox();
        hBox.add(names);
        hBox.add(tf);
        frame.add(hBox);

        frame.pack();
        frame.setVisible(true);

    }

}
