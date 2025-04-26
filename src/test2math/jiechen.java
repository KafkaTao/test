package test2math;

public class jiechen {
    public static int math(int n){

        int result=1;

        for(int i=2;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(math(n));
    }


}
