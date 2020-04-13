package JavaBasic.test5.Demo07;

public interface MyInterfaceB {
    public void methodB();
    public void methodCommon();
    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }

}
