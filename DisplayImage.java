import javax.swing.*;
import java.awt.*;

public class DisplayImage extends JFrame {
    private JLabel imageLabel;

    public DisplayImage(String imagePath) {
        // 设置窗口的标题
        setTitle("显示图片");

        // 创建一个标签来显示图片
        imageLabel = new JLabel();
        // 从指定的路径加载图片
        ImageIcon imageIcon = new ImageIcon(imagePath);
        // 设置标签的图标为加载的图片
        imageLabel.setIcon(imageIcon);

        // 将标签添加到窗口的内容面板中
        getContentPane().add(imageLabel, BorderLayout.CENTER);

        // 设置窗口的大小和关闭操作
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 显示窗口
        setVisible(true);
    }

    public static void main(String[] args) {
        // 指定图片的路径
        String imagePath = "您的图片文件路径";

        // 创建并显示显示图片的窗口
        SwingUtilities.invokeLater(() -> new DisplayImage(imagePath));
    }
}
