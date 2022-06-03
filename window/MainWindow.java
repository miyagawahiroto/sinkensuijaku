package window;
import java.awt.*;
import javax.swing.*;
import window.num.ransuu;

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
    ImageIcon icon2 = new ImageIcon("./img/2S.png");
    ImageIcon icon3 = new ImageIcon("./img/3S.png");
    ImageIcon icon4 = new ImageIcon("./img/4S.png");
    ImageIcon icon5 = new ImageIcon("./img/5S.png");
    ImageIcon icon6 = new ImageIcon("./img/6S.png");
    ImageIcon icon7 = new ImageIcon("./img/7S.png");
    ImageIcon icon8 = new ImageIcon("./img/8S.png");
    ImageIcon icon9 = new ImageIcon("./img/9S.png");
    ImageIcon icon10 = new ImageIcon("./img/10S.png");

    //ボタン作成
    private final JButton s1Button;
    private final JButton s2Button;
    private final JButton s3Button;
    private final JButton s4Button;
    private final JButton s5Button;
    private final JButton s6Button;
    private final JButton s7Button;
    private final JButton s8Button;
    private final JButton s9Button;
    private final JButton s10Button;
    
    //ボタン用乱数生成
    int[] x=new int[10];
    String[] ico={"icon1","icon2","icon3","icon4","icon5","icon6","icon7","icon8","icon9","icon10"};
    
    //コンストラクタ
    public MainWindow(){
        this.x=ransuu.ransuuseisei();
        //乱数呼び出し
        // フレームタイトルを指定したフレームの生成
        this.frame = new JFrame("Suikensuijaku");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // フレームサイズの指定
        this.frame.setBounds(200, 200, 800, 600);
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
        gazouLabel.setBounds(20, 250, 100, 100);
        gazouLabel.setIcon(icon);
        canvas.add(gazouLabel);

        //ボタン
        this.s1Button =new JButton(icon);
        this.s1Button.setBounds(100, 100, 68, 100);
        this.s1Button.addActionListener((e) -> s1Button.setIcon(icon1));
        canvas.add(this.s1Button);

        this.s2Button =new JButton(icon);
        this.s2Button.setBounds(170, 100, 68, 100);
        this.s2Button.addActionListener((e) -> s2Button.setIcon(icon2));
        canvas.add(this.s2Button);

        this.s3Button =new JButton(icon);
        this.s3Button.setBounds(240, 100, 68, 100);
        this.s3Button.addActionListener((e) -> s3Button.setIcon(icon3));
        canvas.add(this.s3Button);

        this.s4Button =new JButton(icon);
        this.s4Button.setBounds(310, 100, 68, 100);
        this.s4Button.addActionListener((e) -> s4Button.setIcon(icon4));
        canvas.add(this.s4Button);

        this.s5Button =new JButton(icon);
        this.s5Button.setBounds(380, 100, 68, 100);
        this.s5Button.addActionListener((e) -> s5Button.setIcon(icon5));
        canvas.add(this.s5Button);

        this.s6Button =new JButton(icon);
        this.s6Button.setBounds(100, 250, 68, 100);
        this.s6Button.addActionListener((e) -> s6Button.setIcon(icon6));
        canvas.add(this.s6Button);

        this.s7Button =new JButton(icon);
        this.s7Button.setBounds(170, 250, 68, 100);
        this.s7Button.addActionListener((e) -> s7Button.setIcon(icon7));
        canvas.add(this.s7Button);

        this.s8Button =new JButton(icon);
        this.s8Button.setBounds(240, 250, 68, 100);
        this.s8Button.addActionListener((e) -> s8Button.setIcon(icon8));
        canvas.add(this.s8Button);

        this.s9Button =new JButton(icon);
        this.s9Button.setBounds(310, 250, 68, 100);
        this.s9Button.addActionListener((e) -> s9Button.setIcon(icon9));
        canvas.add(this.s9Button);

        this.s10Button =new JButton(icon);
        this.s10Button.setBounds(380, 250, 68, 100);
        this.s10Button.addActionListener((e) -> s10Button.setIcon(icon10));
        canvas.add(this.s10Button);

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