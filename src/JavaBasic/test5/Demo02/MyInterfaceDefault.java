package JavaBasic.test5.Demo02;
/*
从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型 方法名称(参数列表) {
    方法体


解决接口升级的问题
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //新添加抽象方法
    //public abstract  void methodAbs2();

    //新添加的方法 ，改成默认方法
    public default void mehtodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
