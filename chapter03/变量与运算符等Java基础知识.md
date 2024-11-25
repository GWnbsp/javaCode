Java基础知识：

1. 标识符规则
```java
// 合法的标识符 
int age;
String userName;
float _price;
long $amount;

// 非法的标识符
int 1number;     // 不能以数字开头
float user-name; // 不能包含'-'
String class;    // 不能使用关键字
```

2. 关键字（核心记忆）
```java
// 访问修饰符
public, private, protected

// 类相关
class, interface, extends, implements, abstract, final

// 流程控制
if, else, switch, case, default, for, while, do, break, continue, return

// 异常处理
try, catch, finally, throw, throws

// 基本数据类型
byte, short, int, long, float, double, char, boolean, void

// 其他常用
static, final, super, this, new, package, import
```

3. 变量类型
```java
// 1. 基本数据类型
byte b = 127;           // 1字节  -128~127
short s = 32767;        // 2字节  -32768~32767
int i = 2147483647;     // 4字节  -2^31~2^31-1
long l = 9223372036854775807L; // 8字节  -2^63~2^63-1
float f = 3.14f;        // 4字节  
double d = 3.14;        // 8字节
char c = 'A';           // 2字节  0~65535
boolean bool = true;    // 1字节  true/false

// 2. 引用数据类型
String str = "Hello";   // 字符串
Object obj = new Object(); // 对象
int[] arr = new int[10];  // 数组

// 3. 变量作用域
public class ScopeDemo {
    private int classVar;     // 成员变量（类变量）
    private static int staticVar; // 静态变量
    
    public void method() {
        int localVar = 0;     // 局部变量
        {
            int blockVar = 0; // 块级变量
        }
    }
}
```

4. 常量定义
```java
// 常量命名惯例：全大写，下划线分隔
public static final int MAX_VALUE = 100;
public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/db";
```

5. 运算符
```java
// 1. 算术运算符
int a = 10, b = 3;
int sum = a + b;      // 加法
int diff = a - b;     // 减法
int product = a * b;  // 乘法
int quotient = a / b; // 除法
int remainder = a % b;// 取余

// 2. 自增自减
int x = 5;
x++;  // 后自增
++x;  // 前自增
x--;  // 后自减
--x;  // 前自减

// 3. 比较运算符
boolean isEqual = (a == b);    // 相等
boolean notEqual = (a != b);   // 不等
boolean greater = (a > b);     // 大于
boolean less = (a < b);        // 小于
boolean greaterEqual = (a >= b);// 大于等于
boolean lessEqual = (a <= b);   // 小于等于

// 4. 逻辑运算符
boolean and = true && false;   // 与
boolean or = true || false;    // 或
boolean not = !true;           // 非

// 5. 位运算符
int bitwiseAnd = 5 & 3;        // 位与
int bitwiseOr = 5 | 3;         // 位或
int bitwiseXor = 5 ^ 3;        // 位异或
int leftShift = 5 << 2;        // 左移
int rightShift = 5 >> 2;       // 右移
int unsignedRightShift = 5 >>> 2; // 无符号右移

// 6. 赋值运算符
int n = 10;
n += 5;  // 等同于 n = n + 5
n -= 5;  // 等同于 n = n - 5
n *= 5;  // 等同于 n = n * 5
n /= 5;  // 等同于 n = n / 5
n %= 5;  // 等同于 n = n % 5
```

6. 类型转换
```java
// 1. 自动类型转换（隐式转换）
byte -> short -> int -> long -> float -> double
char -> int

// 2. 强制类型转换（显式转换）
int i = 128;
byte b = (byte)i;

// 3. 包装类转换
Integer intObj = Integer.valueOf(100);
int intValue = intObj.intValue();

// 4. 字符串转换
String str = String.valueOf(100);
int num = Integer.parseInt("100");
```

7. 编码规范
```java
// 1. 类名：首字母大写，驼峰命名
public class UserService {}

// 2. 方法名：首字母小写，驼峰命名
public void getUserInfo() {}

// 3. 变量名：首字母小写，驼峰命名
private String userName;

// 4. 常量名：全大写，下划线分隔
public static final int MAX_COUNT = 100;

// 5. 包名：全小写
package com.example.project;
```

8. 注意事项和常见面试题
```java
// 1. 浮点数精度问题
float f = 0.1f + 0.2f;  // 0.30000001
System.out.println(f);   // 不要直接比较浮点数是否相等

// 2. 除数为零
int result = 10 / 0;     // ArithmeticException

// 3. 相等性比较
String s1 = "hello";
String s2 = new String("hello");
System.out.println(s1 == s2);        // false
System.out.println(s1.equals(s2));   // true

// 4. 变量初始化
int localVar;  // 局部变量必须初始化后才能使用
int memberVar; // 成员变量有默认值

// 5. final关键字
final int x = 1;  // x不能被修改
x = 2;  // 编译错误
```



## 小白
作为小白，让我用更简单的语言重新讲解Java基础：

1. 变量：就是用来存储数据的容器
```java
// 类比生活中的例子：
// 变量就像是一个盒子，可以存放不同的东西

// 存储年龄
int age = 18;

// 存储姓名
String name = "小明";

// 存储分数
double score = 92.5;
```

2. 基本数据类型：Java中最简单的数据类型
```java
// 整数类型 - 存储整数
int number = 100;        // 最常用
byte small = 127;        // 小范围整数
short medium = 32767;    // 中范围整数
long big = 1000000L;     // 大整数

// 小数类型 - 存储小数
double price = 99.99;    // 更精确(常用)
float temp = 36.5f;      // 不太精确

// 文字类型 - 存储单个字符
char grade = 'A';        // 单引号表示单个字符

// 真假类型 - 存储是或否
boolean isStudent = true;  // 只能是true或false
```

3. 运算符：用来进行运算的符号
```java
// 算术运算符 - 和数学一样
int a = 10 + 5;    // 加法 = 15
int b = 10 - 5;    // 减法 = 5
int c = 10 * 5;    // 乘法 = 50
int d = 10 / 5;    // 除法 = 2
int e = 10 % 3;    // 取余 = 1（10除以3的余数）

// 比较运算符 - 比较两个值
int x = 5;
int y = 3;
x > y    // 大于
x < y    // 小于
x == y   // 等于
x != y   // 不等于
```

4. 字符串：存储文本
```java
// 字符串用双引号
String message = "Hello World";

// 字符串连接用 +
String firstName = "张";
String lastName = "三";
String fullName = firstName + lastName;  // 结果："张三"
```

5. 简单程序示例
```java
// 计算学生成绩
public class Student {
    public static void main(String[] args) {
        // 定义三门课的分数
        double chinese = 89.5;
        double math = 92.0;
        double english = 90.0;
        
        // 计算平均分
        double average = (chinese + math + english) / 3;
        
        // 输出结果
        System.out.println("平均分是：" + average);
        
        // 判断是否及格
        boolean isPass = average >= 60;
        System.out.println("是否及格：" + isPass);
    }
}
```

6. 常见代码案例：
```java
// 1. 判断是否成年
int age = 16;
if(age >= 18) {
    System.out.println("已成年");
} else {
    System.out.println("未成年");
}

// 2. 计算商品总价
double price = 99.9;
int number = 3;
double total = price * number;
System.out.println("总价：" + total);

// 3. 判断考试成绩等级
int score = 85;
if(score >= 90) {
    System.out.println("优秀");
} else if(score >= 60) {
    System.out.println("及格");
} else {
    System.out.println("不及格");
}
```

7. 小贴士：
- 变量名要有意义，比如用age表示年龄，不要用a
- 每行代码结束要加分号;
- 注释可以帮助理解代码，用//添加注释
- System.out.println() 用来输出内容
- 数字计算直接用+-*/就可以
- if用来判断条件，做不同的处理


如果运算的值不确定是小数还是整数，通常建议使用double类型来接收结果，因为它可以同时处理整数和小数。以下是示例代码：

```java
class VariableTest {
    public static void main(String[] args) {
        // 1. 除法运算可能产生小数
        int a = 10;
        int b = 3;
        
        // 整数除法 - 结果为整数
        int result1 = a / b;  // 结果为3
        
        // 使用double接收 - 但结果仍为整数，因为是整数相除
        double result2 = a / b;  // 结果为3.0
        
        // 正确的小数除法 - 至少有一个操作数为double
        double result3 = a / (double)b;  // 结果为3.3333...
        
        // 2. 数学运算可能产生小数
        double result4 = Math.sqrt(a);  // 平方根
        double result5 = Math.pow(a, 0.5);  // 开方
        
        // 3. 混合运算
        double result6 = a * 1.5;  // 整数和小数混合运算
        
        // 输出结果
        System.out.println("整数除法：" + result1);
        System.out.println("整数除法用double接收：" + result2);
        System.out.println("小数除法：" + result3);
        System.out.println("平方根：" + result4);
        System.out.println("开方：" + result5);
        System.out.println("混合运算：" + result6);
        
        // 4. 四舍五入等处理
        double d = 3.14159;
        long rounded = Math.round(d);  // 四舍五入为整数
        double formatted = Math.round(d * 100) / 100.0;  // 保留两位小数
        
        System.out.println("四舍五入：" + rounded);
        System.out.println("保留两位小数：" + formatted);
    }
}
```

一些注意事项：
1. 整数除法：两个整数相除，结果始终是整数（舍弃小数部分）
2. 要获得小数结果：
   - 至少有一个操作数是double/float类型
   - 或者对其中一个操作数进行强制类型转换
3. 对于不确定的数学运算，建议使用double类型
4. double提供了更高的精度和更大的范围，但要注意浮点数计算可能存在精度误差