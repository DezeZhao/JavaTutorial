package JavaBasic.test5.Demo04;

public interface MyInterfacePrivateB {
    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodCommonStatic();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodCommonStatic();
    }

    private static void methodCommonStatic() {
        System.out.println("这是该interface的公共部分不能用于实现类的调用,只能在该interface中调用");
    }

}
