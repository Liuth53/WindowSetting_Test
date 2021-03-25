import javax.swing.*;
import java.awt.*;

public class BoxLayout_Test2 {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayout_Test");
        //创建水平排列Box容器
        Box hbox = Box.createHorizontalBox();
        //往当前容器中添加按钮
        hbox.add(new Button("Xlabel1"));
        hbox.add(new Button("Xlabel2"));
        //添加垂直排列Box容器
        Box vbox = Box.createVerticalBox();
        //往当前容器中添加按钮
        vbox.add(new Button("Ylabel1"));
        vbox.add(new Button("Ylabel2"));
        //把两个Box添加到Frame容器中展示
        frame.add(hbox,BorderLayout.NORTH);
        frame.add(vbox,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
