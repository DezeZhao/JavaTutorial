package JavaBasic.test6.Demo01;
/*
final 修饰方法的时候,该方法就是一个最终的方法，不能被覆盖重写
修饰符 final 返回值类型 方法名（）{
    //..
    }
【对类和方法来说，abstract和final不能同时使用】
 */
public abstract class Fu {
    public final void method(){
        System.out.println("父类方法");
    }

    public abstract /*final */ void methodAbs();
}
