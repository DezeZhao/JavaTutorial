package JavaBasic.test5.Demo07;
/*
接口之间的多继承关系
1. 类与类之间是单继承的，直接父类只有一个
2. 类与接口之间是多实现的，一个类可以实现多个接口
3. 接口与接口之间是多继承的

注意：
1. 多个父接口中的抽象方法如果重复，没有关系 它只继承一个
2. 多个父接口中的默认方法如果重复，那么子接口中必须进行默认方法的覆盖重写
 */
public class Demo07Relations {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();// MyInterface的方法
        impl.methodA();//MyInterfaceA 的方法
        impl.methodB();//MyInterfaceB 的方法
        impl.methodCommon();//MyInterfaceA  MyInterfaceB的公共方法
        impl.methodDefault();//MyInterface 覆盖重写AB的默认方法
    }

}
