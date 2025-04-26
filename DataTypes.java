public class DataTypes {
    public static void main(String[] args) {
        // 整数类型
        byte b = 127;         // 1字节，范围：-128 ~ 127
        short s = 32767;      // 2字节，范围：-32768 ~ 32767
        int i = 2147483647;   // 4字节，范围：-2^31 ~ 2^31-1
        long l = 9223372036854775807L;  // 8字节，注意L后缀
        
        // 浮点类型
        float f = 3.14f;      // 4字节，注意f后缀
        double d = 3.14159;   // 8字节
        
        // 字符类型
        char c = 'A';         // 2字节，Unicode字符
        
        // 布尔类型
        boolean bool = true;  // true或false
        
        System.out.println("byte值：" + b);
        System.out.println("int值：" + i);
        System.out.println("float值：" + f);
        System.out.println("char值：" + c);
        System.out.println("boolean值：" + bool);
    }
}