package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Swing_Test {
    public static void main(String[] args) {
        //创建窗口
        JFrame frame1 = new JFrame("BorderLayout");
        JFrame frame2 = new JFrame("FlowLayout");

        frame1.setBounds(100,200,300,300);
        frame2.setBounds(400,200,300,300);
        //创建容器 设置颜色
        Container container = frame1.getContentPane();
        container.setBackground(Color.orange);
        //菜单设置
        JMenuBar menuBar = new JMenuBar();
        JMenu jMenu = new JMenu("menu");
        JMenu subMenu1 = new JMenu("SubMenu1");
        JMenu subMenu2 = new JMenu("SubMenu2");
        JMenu subMenu3 = new JMenu("SubMenu3");
        JMenuItem item1 = new JMenuItem("Item1", new ImageIcon("2.jpg"));
        JMenuItem item2 = new JMenuItem("Item2",new ImageIcon("1.jpg"));
        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        jMenu.addSeparator();
        jMenu.add(subMenu1);
        subMenu1.add(item1);
        subMenu2.add(item2);
        subMenu1.add(subMenu2);
        jMenu.add(subMenu1);
        jMenu.add(subMenu3);
        menuBar.add(jMenu);
        frame1.setJMenuBar(menuBar);
        //创建PopubMenu菜单
        PopupMenu popupMenu = new PopupMenu();
        //创建菜单条
        MenuItem commentItem = new MenuItem("Ctrl+/");
        MenuItem cancelItem = new MenuItem("Ctrl+//");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Sava");


        //窗口组件创建
        JTextArea TextArea = new JTextArea("TextArea1");
        JButton button1 = new JButton("Button1");
        JLabel label = new JLabel("Label");
        JCheckBox CheckBox = new JCheckBox("CheckBox");
        JRadioButton radioButton = new JRadioButton("Single Choose");
        JComboBox ComboBox = new JComboBox();
        JPasswordField passwordField = new JPasswordField("Please Input Your PassWord");

        //创建窗口容器
        JPanel panel = new JPanel();
        JTabbedPane tabbedPane = new JTabbedPane();
        JScrollPane scrollPane = new JScrollPane();
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,CheckBox,ComboBox);


        //向容器中添加组件
        panel.add(TextArea);
        panel.add(label);
        panel.add(popupMenu);
        tabbedPane.add("button1",button1);
        tabbedPane.add("radioButton",radioButton);
        tabbedPane.add("passwordField",passwordField);
        //把菜单项添加到PopupMenu中
        popupMenu.add(commentItem);
        popupMenu.add(cancelItem);
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);

        //为panel注册鼠标事件
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean flag = e.isPopupTrigger();
                //判断当前鼠标操作是不是触发PopupMenu的操作
                if (flag){
                    //让PopupMenu显示在panel上，并且跟随鼠标事件发生的地方显示
                    popupMenu.show(panel,e.getX(),e.getY());
                }
            }
        });

        //窗口布局
        frame1.setLayout(new BorderLayout(10,10));
        frame1.add(panel,BorderLayout.NORTH);
        frame1.add(tabbedPane,BorderLayout.SOUTH);

        frame2.add(splitPane);
        frame2.add(scrollPane);
        frame2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        //窗口设置
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

}
