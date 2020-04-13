package JavaBasic.test5.Demo07;

public interface MyInterfaceA {
    public void methodA();
    public void methodCommon();
    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
