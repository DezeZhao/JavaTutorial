package JavaBasic.test5.Demo03;
/*
不能通过接口类的实例对象来调用接口中的静态方法
通过接口名称直接调用其中的静态方法
 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        //错误调用
        // impl.methodStatic();
        //接口名调用
        MyInterfaceStatic.methodStatic();
    }
}
