package test2math;
public class prime1{
    public static boolean isp(int n){

        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        for(int i=0;i<100;i++){
            if(isp(i))
                System.out.println(i);
        }
    }
}

