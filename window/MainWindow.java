package window;
import java.awt.*;
import javax.swing.*;

public class MainWindow {
    //ゲームを表示するフレーム
    private JFrame frame;
    //メッセージを表示するラベル
    private JLabel messageLabel;
    //画像を表示するラベル
    private JLabel gazouLabel;
    //アイコン作成
    ImageIcon icon = new ImageIcon("./img/ura.png");
    ImageIcon icon1 = new ImageIcon("./img/1S.png");
    //ボタン作成
    private final JButton s1Button;
    
    
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

        //ボタン
        this.s1Button =new JButton(icon);
        this.s1Button.setBounds(100, 100, 68, 100);
        this.s1Button.addActionListener((e) -> s1Button.setIcon(icon1));
        canvas.add(this.s1Button);

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