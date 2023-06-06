# Java-DisplayImage
Java显示路径图片的程序

import javax.swing.*;
import java.awt.*;

这两行代码导入了需要使用的Java Swing和AWT库中的类。

public class DisplayImage extends JFrame {

这行代码定义了一个名为DisplayImage的类，并继承自JFrame类。这意味着DisplayImage类将表示一个窗口。

private JLabel imageLabel;

这行代码声明了一个私有的`JLabel`类型的实例变量imageLabel，用于显示图片。

public DisplayImage(String imagePath) {

这行代码定义了`DisplayImage`类的构造函数，它接受一个`String`类型的参数`imagePath`，表示要显示的图片的路径。

setTitle("显示图片");

这行代码设置窗口的标题为"显示图片"。

imageLabel = new JLabel();

这行代码创建一个空的`JLabel`对象，用于显示图片。

ImageIcon imageIcon = new ImageIcon(imagePath);

这行代码使用指定路径`imagePath`创建一个`ImageIcon`对象，该对象表示加载的图片。

imageLabel.setIcon(imageIcon);

这行代码将加载的图片设置为`imageLabel`的图标。

getContentPane().add(imageLabel, BorderLayout.CENTER);

这行代码将`imageLabel`添加到窗口的内容面板中，并使用`BorderLayout`布局将其置于中央位置。

setSize(500, 500);

这行代码设置窗口的大小为宽度500像素，高度500像素。

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

这行代码设置窗口的默认关闭操作为终止程序运行。

setVisible(true);

这行代码将窗口设置为可见，使其显示在屏幕上。

String imagePath = "您的图片文件路径";

这行代码定义一个字符串变量`imagePath`，表示您的图片文件的路径。您需要将其替换为实际的图片文件路径。

SwingUtilities.invokeLater(() -> new DisplayImage(imagePath));

这行代码使用`SwingUtilities.invokeLater()`方法来确保在Swing事件调度线程上创建和显示窗口。它创建了一个`DisplayImage`对象，并将`imagePath`作为参数传递给构造函数，从而显示指定路径上的图片。
