import java.awt.*;

public class BorderLayout_Test2 {
    public static void main(String[] args) {
        //创建window对象
        Frame frame = new Frame("Test BorderLayout on Window");
        //给frame设置BorderLayout布局管理器
        frame.setLayout(new BorderLayout(30,10));
        //往frame指定区域添加组件
        frame.add(new Button("N"),BorderLayout.NORTH);
        frame.add(new Button("S"),BorderLayout.SOUTH);
        frame.add(new Button("C"),BorderLayout.CENTER);


        Panel p = new Panel();
        p.add(new TextField("Center_Label"));
        p.add(new Button("Center_Button"));
//        frame.add(new TextField("Test lable"));
        frame.add(p);


        frame.pack();
        //设置窗口对象可见
        frame.setVisible(true);
    }
}


