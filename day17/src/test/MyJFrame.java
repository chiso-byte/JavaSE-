package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    JButton jButton1 = new JButton("我超级帅");
    JButton jButton2 = new JButton("一般般吧");
    JButton jButton3 = new JButton("我长得不好看");
    JButton jButton4 = new JButton("这次原谅你了,下次识相一点");

    boolean flag = false;

    public MyJFrame() {
        initJFrame();


        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);

        initJButton();

        this.setVisible(true);
    }

    private void initJButton() {
        this.getContentPane().removeAll();
        if (flag) {
            Random r = new Random();
            jButton4.setBounds(r.nextInt(this.getWidth()), r.nextInt(this.getHeight()), 200, 50);
            this.getContentPane().add(jButton4);
        }

        JLabel jLabel = new JLabel("颜值调查");
        jLabel.setBounds(150, 100, 100,100);
        this.getContentPane().add(jLabel);

        jButton1.setBounds(130, 200, 100, 50);
        jButton2.setBounds(130, 300, 100, 50);
        jButton3.setBounds(130, 400, 150, 50);



        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);
        this.getContentPane().repaint();
    }

    private void initJFrame() {
        this.setSize(400, 600);
        this.setTitle("恶搞小游戏");
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jButton1) {
            showJDialog("XXX 你太自信了,给你一点惩罚");
            flag = true;
            initJButton();
            try {
                Runtime.getRuntime().exec("shutdown -s -t 120");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (source == jButton2) {
            showJDialog("XXX 你还是有点自信了,给你一点惩罚");
            flag = true;
            initJButton();
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3500");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (source == jButton3) {
            showJDialog("XXX 你想多了,也给你一点惩罚");
            flag = true;
            initJButton();
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (source == jButton4) {
            flag = false;
            initJButton();
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void showJDialog(String str) {
        JDialog jDialog = new JDialog();

        JLabel jLabel = new JLabel(str);

        jLabel.setBounds(0,0,50,50);
        jDialog.getContentPane().add(jLabel);

        jDialog.setSize(300,300);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setVisible(true);
    }
}
