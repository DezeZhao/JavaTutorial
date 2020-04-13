package JavaBasic.test5.Demo01;

/*
接口就是多个类的公共规范
接口是一种引用数据类型——最重要的就是抽象方法

public interface 接口名 {
    //接口内容
}

编译生成之后的字节码文件仍然是.class 文件

Java 9可以包含的内容有：
1. 常量
2. 抽象方法
3. 默认方法
4. 静态方法
5. 私有方法

接口使用步骤：
1. 接口不能直接使用必须有“实现类”来实现它
public class 实现类名 implements 接口名{
    //...
    }
2. 接口实现类必须重写接口中的所有抽象方法
3. 创建实现类对象 进行使用

注意：如果实现类没有覆盖重写接口中的所有抽象方法，那么这个实现类必须自己就是抽象类
 */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbsImpl impl = new MyInterfaceAbsImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();

    }
}
