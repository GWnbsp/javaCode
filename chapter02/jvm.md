# JVM

1. JVM是什么？
- Java Virtual Machine(Java虚拟机)
- 它是一个虚拟的计算机，提供执行Java字节码的运行环境
- 实现了"一次编写，到处运行"的特性

2. JVM工作流程
```
源代码(.java文件)
    ↓ 编译(javac)
字节码(.class文件)
    ↓ JVM加载
JVM解释/运行
```

3. 内存分配(最常见部分)
```
JVM内存
│
├── 堆区(Heap) - 存放对象实例
│   ├── 新生代(Young Generation)
│   └── 老年代(Old Generation)
│
├── 栈区(Stack) - 存放方法调用和局部变量
│   ├── 局部变量
│   └── 方法调用信息
```

4. 实际应用要点：

常见JVM参数设置：
```bash
# 设置最大堆内存
-Xmx2g

# 设置初始堆内存
-Xms2g

# 设置新生代大小
-Xmn512m
```

5. 常见问题及解决：

内存溢出(OOM)：
- 症状：程序报OutOfMemoryError
- 常见原因：内存泄漏、内存设置过小
- 解决方案：
  1. 增加内存设置
  2. 检查代码中的内存泄漏
  3. 使用工具如JProfiler分析

6. 性能调优基础：
- 合理设置堆内存大小
- 选择合适的垃圾收集器
- 及时释放不用的对象
- 避免频繁创建大对象

7. 编程建议：
```java
// 好的实践
try {
    // 使用资源
} finally {
    // 确保资源释放
}

// 使用StringBuilder而不是String+String
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append("World");
```
