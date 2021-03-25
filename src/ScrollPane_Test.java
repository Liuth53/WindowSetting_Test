import java.awt.*;

public class ScrollPane_Test {
    public static void main(String[] args) {
        Frame frame = new Frame("ScrollPane_Test");
        //创建ScrollPane
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        //在ScrollPane中添加内容
        sp.add(new TextField("ScrollPane_TXT"));
        sp.add(new Button("ScrollPane_Button"));
        //把ScrollPane添加到Frame中
        frame.add(sp);
        //设置窗口位置和大小
        frame.setBounds(100,100,500,300);
        //设置窗口对象可见
        frame.setVisible(true);
    }
}
