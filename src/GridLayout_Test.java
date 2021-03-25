import java.awt.*;

public class GridLayout_Test {
    public static void main(String[] args) {
        Frame frame = new Frame("Test GridLayout on Window");
        //创建Panel对象，存放一个TextFiled组件
        Panel p = new Panel();
        p.add(new TextField(30));       //容纳字符数
        //把当前这个Panel添加到frame的北边区域
        frame.add(p,BorderLayout.NORTH);
        //创建一个Panel对象，存放网格，设置布局管理器为GridLayout
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3,5,4,4));
        //往Panel中填充内容
        for(int i = 0;i < 10 ; i++){
            p2.add(new Button(i+""));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("."));
        //把当前Panel添加到Frame中
        frame.add(p2);

        frame.pack();
        //设置窗口对象可见
        frame.setVisible(true);
    }
}
