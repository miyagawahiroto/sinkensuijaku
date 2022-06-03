package window.num;
import java.util.Random;

public class ransuu{
    public static int[] ransuuseisei(){
        Random rand = new Random();
        int[] x=new int[10];
        int i=0;
        String s="";
        while(i<10){
            int a=rand.nextInt(10);
            String chak = Integer.toString(a);
            if(s.contains(chak)==false){
                s+=chak;
                x[i]=a+1;
                i++;
            }
        }
        return x;
    }
}