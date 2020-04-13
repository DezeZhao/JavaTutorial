package JavaBasic.test5.Demo07;

public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public void method();
    //父接口中的默认方法重复 则需要默认方法覆盖重写
    @Override
    default void methodDefault() {
        System.out.println("对父接口中冲突（重复）默认方法进行覆盖重写");
    }
}
