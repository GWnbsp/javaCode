/*
这是多行注释

1、Java中的注释种类
单行注释、多行注释、文档注释
2、单行注释、多行注释的作用
    a、对程序中的代码进行解释说明
    b、对程序进行调试
3、注意
    a、单行注释、多行注释中声明的信息 不参与编译 换句话说 编译以后声明的字节码文件中不包含单行注释和多行注释中的信息

4、文档注释
    a、文档注释内容可以被JDK提供的工具javadoc所解析 生成一套以网页文件形式体现的该程序的说明文档

*/


/**
这是我的第一个Java程序 

@author GW
@version 1.0
javadoc -d mydoc -author -version CommentTest.java 使用该命令生成文档html
 */

public class CommentTest{
    /**
     注释main方法 格式是固定的
     */

    /*
     注释main方法 格式是固定的
    */
    public static void main(String[] args){
        // 这是输出语句！！！
        System.out.println("测试");
    }
}