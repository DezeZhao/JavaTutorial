package JavaBasic.test5.Demo07;

public class MyInterfaceImpl implements  MyInterface {
    @Override
    public void method() {
        System.out.println("MyInterface的方法 method");
    }

    @Override
    public void methodA() {
        System.out.println("MyInterfaceA 的方法methodA");

    }

    @Override
    public void methodB() {
        System.out.println("MyInterfaceB 的方法methodB");

    }

    @Override
    public void methodCommon() {
        System.out.println("MyInterfaceA/B 的共有方法 common");

    }
}
