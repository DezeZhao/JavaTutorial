package JavaBasic.test6.Demo02;

public class MyAnotherClass {
    public void method(){
        System.out.println(new MyClass().num1);//public
        System.out.println(new MyClass().num2);//protected
        System.out.println(new MyClass().num3);//(default)
        //System.out.println(new MyClass().num4);//private
    }
}
