/*
测试变量的基本使用
1、变量的理解：内存中的一个存储区域、该区域的数据可以在同一类型范围内不断变化
2、变量的构成包括三个要素：数据类型、变量名、存储的值
3、Java中变量声明格式：数据类型 变量名 = 变量值
4、Java中的变量按照数据类型来分类
    a、基本数据类型（8种）
        整型：byte、short、int、long
        浮点类型：float、double
        字符类型：char
        布尔：boolean
    b、引用数据类型
        类（class）
        数组（array）
        接口（interface）
        枚举（enum）
        注解（annotation）
        记录（record）

5、变量都有作用域 只在作用域内有效
*/

class VariableTest{
    public static void main(String[] args){
        int age = 10; //方式1

        // 方式2
        char gender; // 变量的声明

        gender = '男'; // 变量的赋值

        gender = '女'; 

        System.out.println(gender);
    }
}


class VariableTest {
    public static void main(String[] args) {
        // 1. 基本数据类型
        // 整型
        byte b1 = 127;
        short s1 = 32767;
        int i1 = 2147483647;
        long l1 = 9223372036854775807L;  // 注意要加L
        
        // 浮点型
        float f1 = 3.14F;  // 注意要加F
        double d1 = 3.14;
        
        // 字符型
        char c1 = 'A';
        char c2 = '\u0041';  // Unicode码
        
        // 布尔型
        boolean bool1 = true;
        boolean bool2 = false;
        
        // 2. 引用数据类型
        // 类
        String str = "Hello World";  // 字符串
        Integer integer = 100;       // 包装类
        
        // 数组
        int[] arr1 = new int[3];     // 一维数组
        int[][] arr2 = new int[2][3]; // 二维数组
        String[] strArr = {"Java", "Python", "C++"};
        
        // 输出所有变量
        System.out.println("====基本数据类型====");
        System.out.println("byte值：" + b1);
        System.out.println("short值：" + s1);
        System.out.println("int值：" + i1);
        System.out.println("long值：" + l1);
        System.out.println("float值：" + f1);
        System.out.println("double值：" + d1);
        System.out.println("char值：" + c1);
        System.out.println("char的Unicode值：" + c2);
        System.out.println("boolean值：" + bool1);
        
        System.out.println("\n====引用数据类型====");
        System.out.println("String值：" + str);
        System.out.println("Integer值：" + integer);
        System.out.println("一维数组第一个元素：" + arr1[0]);  // 默认值0
        System.out.println("字符串数组第一个元素：" + strArr[0]);
        
        // 枚举示例
        Season season = Season.SPRING;
        System.out.println("枚举值：" + season);
    }
}

// 枚举类型示例
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}





/*
1. 基本数据类型（Primitive Data Types）- 8种
   * 整型
     - byte: 8位，范围-128~127
     - short: 16位，范围-32768~32767
     - int: 32位，范围-2^31~2^31-1
     - long: 64位，范围-2^63~2^63-1
   * 浮点类型
     - float: 32位单精度
     - double: 64位双精度
   * 字符类型
     - char: 16位Unicode字符
   * 布尔类型
     - boolean: true或false

2. 引用数据类型（Reference Data Types）
   * 类（class）
     - 自定义类
     - Java API提供的类（如String, Integer等）
   * 数组（array）
     - 一维数组
     - 多维数组
   * 接口（interface）
     - 功能契约的定义
     - 可以包含抽象方法和默认方法
   * 枚举（enum）
     - 固定常量值的集合
     - 是一种特殊的类
   * 注解（annotation）
     - 提供程序相关的元数据
     - 以@开头的特殊标记
   * 记录（record）- Java 16引入
     - 不可变数据的封装
     - 自动实现getter、equals、hashCode等方法

主要区别：
1. 存储位置
   - 基本类型：存储在栈内存中
   - 引用类型：对象存储在堆内存中，引用存储在栈内存中

2. 默认值
   - 基本类型：各有其默认值（如int为0，boolean为false）
   - 引用类型：默认值为null
*/