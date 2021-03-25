import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialog_Test {
    public static void main(String[] args) {
        Frame frame = new Frame("FileDialog_Test");
        //创建两个对话框，模式与非模式
        FileDialog f1 = new FileDialog(frame,"Choose LoadFile",FileDialog.LOAD);
        FileDialog f2 = new FileDialog(frame,"Choose SavePath",FileDialog.SAVE);

        //创建两个按钮
        Button b1 = new Button("LoadFile");
        Button b2 = new Button("SavePath");
        //给两个按钮添加行为（事件）,，获取打开或保存的路径文件名
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);        //代码阻塞

                //获取选择的路径和文件
                String directory =f1.getDirectory();
                String file = f1.getFile();
                System.out.println("Load FilePath:"+directory);
                System.out.println("Load FileName:"+file);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true);

                String directory =f2.getDirectory();
                String file = f2.getFile();
                System.out.println("Save FilePath:"+directory);
                System.out.println("Save FileName:"+file);
            }
        });
        //把按钮添加到frame中
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}
