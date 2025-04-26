package test2math;

public class facjiech {
    public static long fac(int n){
        if (n<0) throw new IllegalArgumentException("参数不合法");
        return (n==0||n==1)?1:(fac(n-1)*n);
    }
    public static void main(String[] argss){
        int n=10;
        System.out.println(fac(n));
    }
}
