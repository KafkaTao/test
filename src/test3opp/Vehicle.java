package test3opp;
public class Vehicle { // 父类
    protected String brand = "通用品牌"; // 使用 protected，允许子类访问
    protected int speed;

    public void move() {
        System.out.println("交通工具在移动...");
    }
}

public class Car extends Vehicle { // 子类 Car 继承自 Vehicle
    private int wheels = 4; // Car 特有的属性

    public void honk() { // Car 特有的方法
        System.out.println("汽车鸣笛：滴滴！");
    }

    // 子类可以使用父类的非私有成员
    public void displayBrand() {
        System.out.println("这辆车的品牌是：" + super.brand); // 使用 super 访问父类 brand
        System.out.println("它有 " + this.wheels + " 个轮子。");
    }
}

public class Bicycle extends Vehicle { // 子类 Bicycle 继承自 Vehicle
    public void ringBell() { // Bicycle 特有的方法
        System.out.println("自行车响铃：叮铃铃！");
    }
}

// 测试类
public class TestInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "宝马"; // 可以访问继承来的 protected 属性
        myCar.move();      // 调用继承来的 move 方法
        myCar.honk();      // 调用自己的 honk 方法
        myCar.displayBrand();

        System.out.println("-----------");

        Bicycle myBike = new Bicycle();
        myBike.move();     // 调用继承来的 move 方法
        myBike.ringBell(); // 调用自己的 ringBell 方法
    }
}
