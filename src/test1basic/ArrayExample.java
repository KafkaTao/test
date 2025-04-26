package test1basic;

public class ArrayExample {
    public static void main(String[] args) {
        // 声明并初始化数组
        int[] numbers = {10, 20, 30, 40, 50};
        
        // 打印数组元素
        System.out.println("数组元素:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // for-each循环遍历数组
        System.out.println("\n使用for-each循环:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // 二维数组
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("\n二维数组:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int max=matrix[0][0];
        for(int row[]:matrix){
            for(int ele:row){
                if (ele>max){
                    max=ele;
                }

            } 
            System.out.println(max);
//想一想放在外层循环内和外的区别
        }
       


        }
    }
