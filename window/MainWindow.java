package window;
import java.awt.*;
import javax.swing.*;
import window.num.*;

public class MainWindow {
    //ゲームを表示するフレーム
    public JFrame frame;
    //メッセージを表示するラベル
    private JLabel messageLabel;
    //画像を表示するラベル
    private JLabel gazouLabel;
    
    //アイコン作成(スペード)
    ImageIcon icon = new ImageIcon("./img/ura.png");
    ImageIcon iconS1 = new ImageIcon("./img/S1.png");
    ImageIcon iconS2 = new ImageIcon("./img/S2.png");
    ImageIcon iconS3 = new ImageIcon("./img/S3.png");
    ImageIcon iconS4 = new ImageIcon("./img/S4.png");
    ImageIcon iconS5 = new ImageIcon("./img/S5.png");
    ImageIcon iconS6 = new ImageIcon("./img/S6.png");
    ImageIcon iconS7 = new ImageIcon("./img/S7.png");
    ImageIcon iconS8 = new ImageIcon("./img/S8.png");
    ImageIcon iconS9 = new ImageIcon("./img/S9.png");
    ImageIcon iconS10 = new ImageIcon("./img/S10.png");
    ImageIcon iconS11 = new ImageIcon("./img/S11.png");
    ImageIcon iconS12 = new ImageIcon("./img/S12.png");
    ImageIcon iconS13 = new ImageIcon("./img/S13.png");
    //アイコン作成(ハート)
    ImageIcon iconH1 = new ImageIcon("./img/H1.png");
    ImageIcon iconH2 = new ImageIcon("./img/H2.png");
    ImageIcon iconH3 = new ImageIcon("./img/H3.png");
    ImageIcon iconH4 = new ImageIcon("./img/H4.png");
    ImageIcon iconH5 = new ImageIcon("./img/H5.png");
    ImageIcon iconH6 = new ImageIcon("./img/H6.png");
    ImageIcon iconH7 = new ImageIcon("./img/H7.png");
    ImageIcon iconH8 = new ImageIcon("./img/H8.png");
    ImageIcon iconH9 = new ImageIcon("./img/H9.png");
    ImageIcon iconH10 = new ImageIcon("./img/H10.png");
    ImageIcon iconH11 = new ImageIcon("./img/H11.png");
    ImageIcon iconH12 = new ImageIcon("./img/H12.png");
    ImageIcon iconH13 = new ImageIcon("./img/H13.png");
    
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
    private final JButton s11Button;
    private final JButton s12Button;
    private final JButton s13Button;

    private final JButton h1Button;
    private final JButton h2Button;
    private final JButton h3Button;
    private final JButton h4Button;
    private final JButton h5Button;
    private final JButton h6Button;
    private final JButton h7Button;
    private final JButton h8Button;
    private final JButton h9Button;
    private final JButton h10Button;
    private final JButton h11Button;
    private final JButton h12Button;
    private final JButton h13Button;
    
    //ボタン用乱数生成
    int[] x=new int[26];
    
    //コンストラクタ
    public MainWindow(){
        //乱数呼び出し
        this.x=ransuu.ransuuseisei(26);
        
        // フレームタイトルを指定したフレームの生成
        this.frame = new JFrame("Suikensuijaku");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // フレームサイズの指定
        this.frame.setBounds(200, 200, 1200, 600);
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

        //ボタン(スペード)
        this.s1Button =new JButton(icon);
        this.s1Button.setBounds(100, 100, 68, 100);
        this.s1Button.addActionListener((e) -> s1Button.setIcon(Bottonsakusei(x[0])));
        canvas.add(this.s1Button);

        this.s2Button =new JButton(icon);
        this.s2Button.setBounds(170, 100, 68, 100);
        this.s2Button.addActionListener((e) -> s2Button.setIcon(Bottonsakusei(x[1])));
        canvas.add(this.s2Button);

        this.s3Button =new JButton(icon);
        this.s3Button.setBounds(240, 100, 68, 100);
        this.s3Button.addActionListener((e) -> s3Button.setIcon(Bottonsakusei(x[2])));
        canvas.add(this.s3Button);

        this.s4Button =new JButton(icon);
        this.s4Button.setBounds(310, 100, 68, 100);
        this.s4Button.addActionListener((e) -> s4Button.setIcon(Bottonsakusei(x[3])));
        canvas.add(this.s4Button);

        this.s5Button =new JButton(icon);
        this.s5Button.setBounds(380, 100, 68, 100);
        this.s5Button.addActionListener((e) -> s5Button.setIcon(Bottonsakusei(x[4])));
        canvas.add(this.s5Button);

        this.s6Button =new JButton(icon);
        this.s6Button.setBounds(450, 100, 68, 100);
        this.s6Button.addActionListener((e) -> s6Button.setIcon(Bottonsakusei(x[5])));
        canvas.add(this.s6Button);

        this.s7Button =new JButton(icon);
        this.s7Button.setBounds(520, 100, 68, 100);
        this.s7Button.addActionListener((e) -> s7Button.setIcon(Bottonsakusei(x[6])));
        canvas.add(this.s7Button);

        this.s8Button =new JButton(icon);
        this.s8Button.setBounds(590, 100, 68, 100);
        this.s8Button.addActionListener((e) -> s8Button.setIcon(Bottonsakusei(x[7])));
        canvas.add(this.s8Button);

        this.s9Button =new JButton(icon);
        this.s9Button.setBounds(660, 100, 68, 100);
        this.s9Button.addActionListener((e) -> s9Button.setIcon(Bottonsakusei(x[8])));
        canvas.add(this.s9Button);

        this.s10Button =new JButton(icon);
        this.s10Button.setBounds(730, 100, 68, 100);
        this.s10Button.addActionListener((e) -> s10Button.setIcon(Bottonsakusei(x[9])));
        canvas.add(this.s10Button);

        this.s11Button =new JButton(icon);
        this.s11Button.setBounds(800, 100, 68, 100);
        this.s11Button.addActionListener((e) -> s11Button.setIcon(Bottonsakusei(x[10])));
        canvas.add(this.s11Button);

        this.s12Button =new JButton(icon);
        this.s12Button.setBounds(870, 100, 68, 100);
        this.s12Button.addActionListener((e) -> s12Button.setIcon(Bottonsakusei(x[11])));
        canvas.add(this.s12Button);

        this.s13Button =new JButton(icon);
        this.s13Button.setBounds(940, 100, 68, 100);
        this.s13Button.addActionListener((e) -> s13Button.setIcon(Bottonsakusei(x[12])));
        canvas.add(this.s13Button);

        //ボタン（ハート）
        this.h1Button =new JButton(icon);
        this.h1Button.setBounds(100, 200, 68, 100);
        this.h1Button.addActionListener((e) -> h1Button.setIcon(Bottonsakusei(x[13])));
        canvas.add(this.h1Button);

        this.h2Button =new JButton(icon);
        this.h2Button.setBounds(170, 200, 68, 100);
        this.h2Button.addActionListener((e) -> h2Button.setIcon(Bottonsakusei(x[14])));
        canvas.add(this.h2Button);

        this.h3Button =new JButton(icon);
        this.h3Button.setBounds(240, 200, 68, 100);
        this.h3Button.addActionListener((e) -> h3Button.setIcon(Bottonsakusei(x[15])));
        canvas.add(this.h3Button);

        this.h4Button =new JButton(icon);
        this.h4Button.setBounds(310, 200, 68, 100);
        this.h4Button.addActionListener((e) -> h4Button.setIcon(Bottonsakusei(x[16])));
        canvas.add(this.h4Button);

        this.h5Button =new JButton(icon);
        this.h5Button.setBounds(380, 200, 68, 100);
        this.h5Button.addActionListener((e) -> h5Button.setIcon(Bottonsakusei(x[17])));
        canvas.add(this.h5Button);

        this.h6Button =new JButton(icon);
        this.h6Button.setBounds(450, 200, 68, 100);
        this.h6Button.addActionListener((e) -> h6Button.setIcon(Bottonsakusei(x[18])));
        canvas.add(this.h6Button);

        this.h7Button =new JButton(icon);
        this.h7Button.setBounds(520, 200, 68, 100);
        this.h7Button.addActionListener((e) -> h7Button.setIcon(Bottonsakusei(x[19])));
        canvas.add(this.h7Button);

        this.h8Button =new JButton(icon);
        this.h8Button.setBounds(590, 200, 68, 100);
        this.h8Button.addActionListener((e) -> h8Button.setIcon(Bottonsakusei(x[20])));
        canvas.add(this.h8Button);

        this.h9Button =new JButton(icon);
        this.h9Button.setBounds(660, 200, 68, 100);
        this.h9Button.addActionListener((e) -> h9Button.setIcon(Bottonsakusei(x[21])));
        canvas.add(this.h9Button);

        this.h10Button =new JButton(icon);
        this.h10Button.setBounds(730, 200, 68, 100);
        this.h10Button.addActionListener((e) -> h10Button.setIcon(Bottonsakusei(x[22])));
        canvas.add(this.h10Button);

        this.h11Button =new JButton(icon);
        this.h11Button.setBounds(800, 200, 68, 100);
        this.h11Button.addActionListener((e) -> h11Button.setIcon(Bottonsakusei(x[23])));
        canvas.add(this.h11Button);

        this.h12Button =new JButton(icon);
        this.h12Button.setBounds(870, 200, 68, 100);
        this.h12Button.addActionListener((e) -> h12Button.setIcon(Bottonsakusei(x[24])));
        canvas.add(this.h12Button);

        this.h13Button =new JButton(icon);
        this.h13Button.setBounds(940, 200, 68, 100);
        this.h13Button.addActionListener((e) -> h13Button.setIcon(Bottonsakusei(x[25])));
        canvas.add(this.h13Button);

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
    //ランダムにカードを作成
    public ImageIcon Bottonsakusei(int m){
        if(m==1)
        return iconS1;
        else if(m==2)
        return iconS2;
        else if(m==3)
        return iconS3;
        else if(m==4)
        return iconS4;
        else if(m==5)
        return iconS5;
        else if(m==6)
        return iconS6;
        else if(m==7)
        return iconS7;
        else if(m==8)
        return iconS8;
        else if(m==9)
        return iconS9;
        else if(m==10)
        return iconS10;
        else if(m==11)
        return iconS11;
        else if(m==12)
        return iconS12;
        else if(m==13)
        return iconS13;
        else if(m==14)
        return iconH1;
        else if(m==15)
        return iconH2;
        else if(m==16)
        return iconH3;
        else if(m==17)
        return iconH4;
        else if(m==18)
        return iconH5;
        else if(m==19)
        return iconH6;
        else if(m==20)
        return iconH7;
        else if(m==21)
        return iconH8;
        else if(m==22)
        return iconH9;
        else if(m==23)
        return iconH10;
        else if(m==24)
        return iconH11;
        else if(m==25)
        return iconH12;
        else
        return iconH13;
    }
}