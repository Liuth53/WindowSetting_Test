import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BoxLayout_Test3 {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayout_Test");
        //创建水平排列Box容器
        Box hbox = Box.createHorizontalBox();
        //往当前容器中添加按钮，在按钮之间添加分割
        hbox.add(new Button("Xlabel1"));
        hbox.add(Box.createHorizontalGlue());               //左右拉伸
        hbox.add(new Button("Xlabel2"));
        hbox.add(Box.createHorizontalStrut(30));      //指定宽度分割
        hbox.add(new Button("Xlabel3"));

        //添加垂直排列Box容器
        Box vbox = Box.createVerticalBox();
        //往当前容器中添加按钮，在按钮之间添加分割
        vbox.add(new Button("Ylabel1"));
        vbox.add(Box.createVerticalGlue());                 //上下拉伸
        vbox.add(new Button("Ylabel2"));
        vbox.add(Box.createVerticalStrut(30));       //指定宽度分割
        vbox.add(new Button("Ylabel3"));


        //把两个Box添加到Frame容器中展示
        frame.add(hbox,BorderLayout.NORTH);
//        frame.add(vbox,BorderLayout.SOUTH);
        frame.add(vbox);

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
