import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog_Test {
    public static void main(String[] args) {
        Frame frame = new Frame("Dialog_Test");
        //创建两个对话框，模式与非模式
        Dialog d1 = new Dialog(frame,"ModelDialog",true);
        Dialog d2 = new Dialog(frame,"non-ModelDialog",false);
        //通过setBounds当前对话框的位置和大小
        d1.setBounds(20,30,300,200);
        d2.setBounds(20,30,300,200);
        //创建两个按钮
        Button b1 = new Button("Open ModelDialog");
        Button b2 = new Button("Open non-ModelDialog");
        //给两个按钮添加行为（事件）
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2.setVisible(true);
            }
        });
        //把按钮添加到frame中
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
