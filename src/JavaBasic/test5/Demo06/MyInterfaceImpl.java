package JavaBasic.test5.Demo06;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写了方法A");

    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了方法B");

    }
    @Override
    public void methosAbs() {
        System.out.println("覆盖重写了AB都有的抽象方法");
    }
}
