package puzzlegame;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    int[][] arr = new int[4][4];
    int x;
    int y;
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    int count = 0;

    String path = "day16/image/animal/animal5/";

    JMenuItem replay = new JMenuItem("重新游戏");
    JMenuItem reLogin = new JMenuItem("重新登录");
    JMenuItem exit = new JMenuItem("关闭游戏");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    JMenuItem account = new JMenuItem("公众号");

    public GameJFrame() {
        initJFrame();

        initJMenuBar();

        randomImage();

        initImage();


        // 设置窗口可见
        this.setVisible(true);
    }

    private void initImage() {
        // 清空所有图片
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("day16/image/win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        // 添加计数器
        JLabel countJLabel = new JLabel("步数: " + count);
        countJLabel.setBounds(20, 30, 100, 20);
        this.getContentPane().add(countJLabel);

        // 添加图片
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ImageIcon img = new ImageIcon(path + arr[i][j] + ".jpg");
                JLabel jLabel = new JLabel(img);
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel);
            }
        }

        // 添加背景
        JLabel background = new JLabel(new ImageIcon("day16/image/background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        // 刷新
        this.getContentPane().repaint();

    }

    private void initJMenuBar() {
        // 设置菜单栏
        JMenuBar jmb = new JMenuBar();
        JMenu function = new JMenu("功能");
        JMenu about = new JMenu("关于我们");
        JMenu modifyImage = new JMenu("更换图片");

        replay.addActionListener(this);
        reLogin.addActionListener(this);
        exit.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        account.addActionListener(this);

        modifyImage.add(girl);
        modifyImage.add(animal);
        modifyImage.add(sport);


        function.add(modifyImage);
        function.add(replay);
        function.add(reLogin);
        function.add(exit);

        about.add(account);

        jmb.add(function);
        jmb.add(about);

        this.setJMenuBar(jmb);
    }

    private void initJFrame() {
        // 设置窗口大小
        this.setSize(603, 680);
        // 设置标题
        this.setTitle("拼图单机版 v1.0");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置居中
        this.setLocationRelativeTo(null);
        // 设置默认关闭方式,按x虚拟机退出
        this.setDefaultCloseOperation(3);

        this.addKeyListener(this);

        // 取消容器默认的居中模式
        this.setLayout(null);

    }

    private void randomImage() {
        // 打乱图片
        int[] tempArr = new int[16];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = i;
        }
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            arr[i / 4][i % 4] = tempArr[i];
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 按住键盘不送
        if (victory()) {
            return;
        }
        // 按住a键不送,可以查看完整图片
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel jLabel = new JLabel(new ImageIcon(path + "all.jpg"));
            jLabel.setBounds(83, 134, 420, 420);

            JLabel background = new JLabel(new ImageIcon("day16/image/background.png"));
            background.setBounds(40, 40, 508, 560);

            this.getContentPane().add(jLabel);
            this.getContentPane().add(background);

            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 松开键盘
        if (victory()) {
            return;
        }
        int code = e.getKeyCode();
        System.out.println(code);
        if (code == 37) {
            // 左
            if (y == 3) {
                return;
            }
            arr[x][y] = arr[x][y + 1];
            arr[x][y + 1] = 0;
            y++;
            count++;
            // 重新加载图片
            initImage();
        } else if (code == 38) {
            // 上
            if (x == 3) {
                return;
            }
            arr[x][y] = arr[x + 1][y];
            arr[x + 1][y] = 0;
            x++;
            count++;
            initImage();
        } else if (code == 39) {
            // 右
            if (y == 0) {
                return;
            }
            arr[x][y] = arr[x][y - 1];
            arr[x][y - 1] = 0;
            y--;
            count++;
            initImage();
        } else if (code == 40) {
            // 下
            if (x == 0) {
                return;
            }
            arr[x][y] = arr[x - 1][y];
            arr[x - 1][y] = 0;
            x--;
            count++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            arr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    private boolean victory() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replay) {
            // 重新游戏
            // 计步器清零
            count = 0;
            // 打乱图片
            randomImage();
            // 加载图片
            initImage();
        } else if (source == reLogin) {
            // 重新登录
            // 关闭游戏界面
            this.setVisible(false);
            // 打开登录界面
            new LoginJFrame();
        } else if (source == exit) {
            // 退出游戏
            System.exit(0);
        } else if (source == account) {
            // 公众号
            JDialog jDialog = new JDialog();
            JLabel accountJLabel = new JLabel(new ImageIcon("day16/image/about.png"));
            accountJLabel.setBounds(0, 0, 258, 258);
            jDialog.setSize(344, 344);
            jDialog.getContentPane().add(accountJLabel);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            // 不关闭不能操作下面的界面
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (source == girl) {
            // 从美女照片中进行选择 修改path
            Random r = new Random();
            int index = r.nextInt(13) + 1;
            path = "day16/image/girl/girl" + index + "/";
            System.out.println(path);
            // 计步器清零
            count = 0;
            // 打乱图片
            randomImage();
            // 加载图片
            initImage();
        } else if (source == animal) {
            Random r = new Random();
            int index = r.nextInt(8) + 1;
            path = "day16/image/animal/animal" + index + "/";
            System.out.println(path);
            // 计步器清零
            count = 0;
            // 打乱图片
            randomImage();
            // 加载图片
            initImage();
        } else if (source == sport) {
            Random r = new Random();
            int index = r.nextInt(10) + 1;
            path = "day16/image/sport/sport" + index + "/";
            System.out.println(path);
            // 计步器清零
            count = 0;
            // 打乱图片
            randomImage();
            // 加载图片
            initImage();
        }
    }
}
