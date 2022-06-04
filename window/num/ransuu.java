package window.num;
import java.util.Random;

public class ransuu{
    public static int[] ransuuseisei(int num){
        Random rand = new Random();
        int[] x=new int[num];
        int i=0;
        String s="";
        while(i<num){
            int a=rand.nextInt(num);
            
            String chak = Integer.toString(a);
            if(s.contains(" "+chak+" ")==false){
                s+=" "+chak+" ";
                x[i]=a+1;
                i++;
            }
        }
        return x;
    }
}