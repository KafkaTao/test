public class Array {
    public static void main(String[] args){
        int[] nums={5,10,15,20,25,30};
        for(int i=0;i<nums.length;i++){
            System.out.println("nums["+i+"]="+nums[i]);

        }
    int a=7;
        int b=8;
        int c=10;
        System.out.println("和是："+add(a,b));
        System.out.println("和是："+multiply(a,b));
        System.out.println("和是："+multiply(a,b,c));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int multiply(int a,int  b){
        return a*b;
    }
    public static int multiply(int a,int b,int c){
        return a*b*c;
    }
}
