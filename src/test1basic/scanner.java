package test1basic;

import java.util.Scanner;
    public class scanner {
        public static void main(String[] args) {
            Scanner shuru = new Scanner(System.in);

            System.out.print("请输入第一个数字: ");
            double num1 = shuru.nextDouble();

            System.out.print("请输入运算符 (+, -, *, /): ");
            char operator = shuru.next().charAt(0);

            System.out.print("请输入第二个数字: ");
            double num2 = shuru.nextDouble();

            double result = 0;

            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0)
                        result = num1 / num2;
                    else
                        System.out.println("错误：除数不能为零");
                    break;
                default:
                    System.out.println("不支持的运算符");
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            shuru.close();
        }
    }


