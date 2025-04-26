package test2math;
import java.util.Scanner;
public class jch {
    public static boolean jiechen(int n){
        if(n<=1) {
            return false;

        }
        //Math.sqrt,从2开始到平方
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return  true;
    }
    public static void main(String[] args){
//不要忘了那个System.in
        Scanner shuru=new Scanner(System.in);
        int n=shuru.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(jiechen((i))){
                System.out.print(i+" ");
            }
        }
shuru.close();
    }


}
