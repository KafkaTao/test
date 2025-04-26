package test2math;

public class love{
    public static boolean isp(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){

    }
}
