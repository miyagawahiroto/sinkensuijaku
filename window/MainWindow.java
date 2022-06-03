package window;
import java.awt.*;
import javax.swing.*;

public class MainWindow {
    public void show(){
        // フレームタイトルを指定したフレームの生成
        JFrame frame = new JFrame("Swing");

        // 「×ボタン」によるアプリケーションの終了
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // レイアウトマネージャの指定
        frame.setLayout(new BorderLayout());

        // フレームサイズの指定
        // -> setBounds()メソッドで表示位置とまとめて指定可能
        frame.setSize(400, 200);

        // 表示位置の指定
        // -> setBounds()メソッドでフレームサイズとまとめて指定可能
        frame.setLocation(100, 100);

        // モニターサイズに合わせた表示位置の指定
        frame.setLocationRelativeTo(null);

        // フレームの表示
        frame.setVisible(true);
    }
}