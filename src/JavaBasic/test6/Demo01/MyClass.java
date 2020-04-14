package JavaBasic.test6.Demo01;
/*
final 修饰一个类
public final class 类名{
    //...
}

意思：当前类不能有任何子类。其中的所有方法都不可覆盖重写
 */
public final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
