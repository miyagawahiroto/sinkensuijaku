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
    //使用したカードを入れる
    int con1=0;
    int[] card=new int[2];
    
    
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
    //icon配列
    ImageIcon[] ico={icon,iconS1,iconS2,iconS3,iconS4,iconS5,iconS6,iconS7,iconS8,iconS9,iconS10,iconS11,iconS12,iconS13,iconH1,iconH2,iconH3,iconH4,iconH5,iconH6,iconH7,iconH8,iconH9,iconH10,iconH11,iconH12,iconH13,};
    //ボタン配列
    JButton[] jbtn=new JButton[26];

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
        this.s1Button.addActionListener((e) -> s1Button.setIcon(Bottonsakusei(x[0],1)));
        jbtn[0]=(this.s1Button);
        canvas.add(this.s1Button);

        this.s2Button =new JButton(icon);
        this.s2Button.setBounds(170, 100, 68, 100);
        this.s2Button.addActionListener((e) -> s2Button.setIcon(Bottonsakusei(x[1],2)));
        jbtn[1]=(this.s2Button);
        canvas.add(this.s2Button);

        this.s3Button =new JButton(icon);
        this.s3Button.setBounds(240, 100, 68, 100);
        this.s3Button.addActionListener((e) -> s3Button.setIcon(Bottonsakusei(x[2],3)));
        jbtn[2]=(this.s3Button);
        canvas.add(this.s3Button);

        this.s4Button =new JButton(icon);
        this.s4Button.setBounds(310, 100, 68, 100);
        this.s4Button.addActionListener((e) -> s4Button.setIcon(Bottonsakusei(x[3],4)));
        jbtn[3]=(this.s4Button);
        canvas.add(this.s4Button);

        this.s5Button =new JButton(icon);
        this.s5Button.setBounds(380, 100, 68, 100);
        this.s5Button.addActionListener((e) -> s5Button.setIcon(Bottonsakusei(x[4],5)));
        jbtn[4]=(this.s5Button);
        canvas.add(this.s5Button);

        this.s6Button =new JButton(icon);
        this.s6Button.setBounds(450, 100, 68, 100);
        this.s6Button.addActionListener((e) -> s6Button.setIcon(Bottonsakusei(x[5],6)));
        jbtn[5]=(this.s6Button);
        canvas.add(this.s6Button);

        this.s7Button =new JButton(icon);
        this.s7Button.setBounds(520, 100, 68, 100);
        this.s7Button.addActionListener((e) -> s7Button.setIcon(Bottonsakusei(x[6],7)));
        jbtn[6]=(this.s7Button);
        canvas.add(this.s7Button);

        this.s8Button =new JButton(icon);
        this.s8Button.setBounds(590, 100, 68, 100);
        this.s8Button.addActionListener((e) -> s8Button.setIcon(Bottonsakusei(x[7],8)));
        jbtn[7]=(this.s8Button);
        canvas.add(this.s8Button);

        this.s9Button =new JButton(icon);
        this.s9Button.setBounds(660, 100, 68, 100);
        this.s9Button.addActionListener((e) -> s9Button.setIcon(Bottonsakusei(x[8],9)));
        jbtn[8]=(this.s9Button);
        canvas.add(this.s9Button);

        this.s10Button =new JButton(icon);
        this.s10Button.setBounds(730, 100, 68, 100);
        this.s10Button.addActionListener((e) -> s10Button.setIcon(Bottonsakusei(x[9],10)));
        jbtn[9]=(this.s10Button);
        canvas.add(this.s10Button);

        this.s11Button =new JButton(icon);
        this.s11Button.setBounds(800, 100, 68, 100);
        this.s11Button.addActionListener((e) -> s11Button.setIcon(Bottonsakusei(x[10],11)));
        jbtn[10]=(this.s11Button);
        canvas.add(this.s11Button);

        this.s12Button =new JButton(icon);
        this.s12Button.setBounds(870, 100, 68, 100);
        this.s12Button.addActionListener((e) -> s12Button.setIcon(Bottonsakusei(x[11],12)));
        jbtn[11]=(this.s12Button);
        canvas.add(this.s12Button);

        this.s13Button =new JButton(icon);
        this.s13Button.setBounds(940, 100, 68, 100);
        this.s13Button.addActionListener((e) -> s13Button.setIcon(Bottonsakusei(x[12],13)));
        jbtn[12]=(this.s13Button);
        canvas.add(this.s13Button);

        //ボタン（ハート）
        this.h1Button =new JButton(icon);
        this.h1Button.setBounds(100, 200, 68, 100);
        this.h1Button.addActionListener((e) -> h1Button.setIcon(Bottonsakusei(x[13],14)));
        jbtn[13]=(this.h1Button);
        canvas.add(this.h1Button);

        this.h2Button =new JButton(icon);
        this.h2Button.setBounds(170, 200, 68, 100);
        this.h2Button.addActionListener((e) -> h2Button.setIcon(Bottonsakusei(x[14],15)));
        jbtn[14]=(this.h2Button);
        canvas.add(this.h2Button);

        this.h3Button =new JButton(icon);
        this.h3Button.setBounds(240, 200, 68, 100);
        this.h3Button.addActionListener((e) -> h3Button.setIcon(Bottonsakusei(x[15],16)));
        jbtn[15]=(this.h3Button);
        canvas.add(this.h3Button);

        this.h4Button =new JButton(icon);
        this.h4Button.setBounds(310, 200, 68, 100);
        this.h4Button.addActionListener((e) -> h4Button.setIcon(Bottonsakusei(x[16],17)));
        jbtn[16]=(this.h4Button);
        canvas.add(this.h4Button);

        this.h5Button =new JButton(icon);
        this.h5Button.setBounds(380, 200, 68, 100);
        this.h5Button.addActionListener((e) -> h5Button.setIcon(Bottonsakusei(x[17],18)));
        jbtn[17]=(this.h5Button);
        canvas.add(this.h5Button);

        this.h6Button =new JButton(icon);
        this.h6Button.setBounds(450, 200, 68, 100);
        this.h6Button.addActionListener((e) -> h6Button.setIcon(Bottonsakusei(x[18],19)));
        jbtn[18]=(this.h6Button);
        canvas.add(this.h6Button);

        this.h7Button =new JButton(icon);
        this.h7Button.setBounds(520, 200, 68, 100);
        this.h7Button.addActionListener((e) -> h7Button.setIcon(Bottonsakusei(x[19],20)));
        jbtn[19]=(this.h7Button);
        canvas.add(this.h7Button);

        this.h8Button =new JButton(icon);
        this.h8Button.setBounds(590, 200, 68, 100);
        this.h8Button.addActionListener((e) -> h8Button.setIcon(Bottonsakusei(x[20],21)));
        jbtn[20]=(this.h8Button);
        canvas.add(this.h8Button);

        this.h9Button =new JButton(icon);
        this.h9Button.setBounds(660, 200, 68, 100);
        this.h9Button.addActionListener((e) -> h9Button.setIcon(Bottonsakusei(x[21],22)));
        jbtn[21]=(this.h9Button);
        canvas.add(this.h9Button);

        this.h10Button =new JButton(icon);
        this.h10Button.setBounds(730, 200, 68, 100);
        this.h10Button.addActionListener((e) -> h10Button.setIcon(Bottonsakusei(x[22],23)));
        jbtn[22]=(this.h10Button);
        canvas.add(this.h10Button);

        this.h11Button =new JButton(icon);
        this.h11Button.setBounds(800, 200, 68, 100);
        this.h11Button.addActionListener((e) -> h11Button.setIcon(Bottonsakusei(x[23],24)));
        jbtn[23]=(this.h11Button);
        canvas.add(this.h11Button);

        this.h12Button =new JButton(icon);
        this.h12Button.setBounds(870, 200, 68, 100);
        this.h12Button.addActionListener((e) -> h12Button.setIcon(Bottonsakusei(x[24],25)));
        jbtn[24]=(this.h12Button);
        canvas.add(this.h12Button);

        this.h13Button =new JButton(icon);
        this.h13Button.setBounds(940, 200, 68, 100);
        this.h13Button.addActionListener((e) -> h13Button.setIcon(Bottonsakusei(x[25],26)));
        jbtn[25]=(this.h13Button);
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
    //ランダムにカードを作成してsentakuメソッドを起動
    public ImageIcon Bottonsakusei(int m,int z){
        if(z!=100)
        sentaku(z);
        return ico[m];
    }

    //三回目を引いたら裏面にする
    public void sentaku(int kado) {
        if(con1==2){
            jbtn[card[0]-1].setIcon(Bottonsakusei(0,100));
            jbtn[card[1]-1].setIcon(Bottonsakusei(0,100));
            card[0]=kado;
            con1=1;
        }else{
            card[con1]=kado;
            con1++; 
        }
    }
}