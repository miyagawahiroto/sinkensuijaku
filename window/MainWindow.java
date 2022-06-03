package window;
import java.awt.*;
import javax.swing.*;

public class MainWindow {
    //メッセージを表示するラベル
  private JLabel messageLabel;
    //画像を表示するラベル
  private JLabel gazouLabel;
    //アイコン作成
  ImageIcon icon1 = new ImageIcon("img/1S");
    //ゲームを表示するフレーム
    private JFrame frame;
    
  //コンストラクタ
  public MainWindow(){
        // フレームタイトルを指定したフレームの生成
        this.frame = new JFrame("Suikensuijaku");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // フレームサイズの指定
        this.frame.setBounds(200, 200, 600, 400);
        var pane = this.frame.getContentPane();

        // このcanvasに対して、ボタンやラベルを配置していく
        var canvas = new JPanel();
        // 自由レイアウトに変更する
        canvas.setLayout(null);

        //ラベル
        messageLabel = new JLabel("どれにしますか・・？");
        messageLabel.setBounds(20, 20, 400, 30);
        canvas.add(this.messageLabel);
        gazouLabel = new JLabel();
        gazouLabel.setBounds(250, 150, 100, 100);
        gazouLabel.setIcon(icon1);
        canvas.add(gazouLabel);

        // レイアウトマネージャの指定
        this.frame.setLayout(new BorderLayout());
        

        // モニターサイズに合わせた表示位置の指定
        frame.setLocationRelativeTo(null);

        

        

        

        // 画面にCanvasを追加
        pane.add(canvas);
    }
    public void show() {
        // フレームの表示
        this.frame.setVisible(true);
    }
}