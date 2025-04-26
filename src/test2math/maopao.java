package test2math;
//用递归写一个冒泡函数的程序
public class maopao {
    public static void digui(int[]arr ,int n){
        if(n==1){
            return ;
        }
        for(int i=0 ;i<n-1;i++){


            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
            
        }
digui(arr,n-1);

    }
    public static void main(String[] argss){
        int arrr[]={19,87,44,32,5,1,41,4,24,2,4,24,25425,2,43,4,};
        digui(arrr,arrr.length);
        for(int i=0;i<arrr.length;i++){

            System.out.print(arrr[i]+" ");
        }
        
    }
    
}
