package test3opp;

import java.util.Scanner;



public class shape1 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

         String rec=sc.next();
         double width=sc.nextInt();
         double height=sc.nextInt();
         //创建矩形对象

        String rc= sc.next();
        double r= sc.nextInt();
        //创建圆形调用方法









    }


}

abstract class Shape{
    private  String color;
    public Shape(String color){
        this.color=color;
    }
    //public 优先abstract
    public abstract double getArea();
    public abstract double getMeter();
    public void showcolor(){
        System.out.println("图形颜色"+color);

    }

}
class Rectangle extends Shape{
    //不能忘记私有属性
    //加入没有私有属性.就不能用this指明属性
    private double width;
    private double height;
public Rectangle(String color,int width,int height){
    super(color);
    this.width=width;
    this.height=height;
}
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getMeter() {
        return (width+height)*2;
    }
}
/*
* **`Circle` (圆形类):**
    
    - 继承自 `Shape`。
    - 特有属性：`radius` (double，半径) (设为 private)。
    - 构造函数：初始化颜色和半径（记得调用 `super` 初始化颜色）。
    - 重写 `calculateArea()` 方法：返回 `Math.PI * radius * radius` (可以使用 `Math.PI` 获取圆周率)。
    - 重写 `calculatePerimeter()` 方法：返回 `2 * Math.PI * radius`。
*
* */






