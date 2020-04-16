package JavaBasic.test2;

public class Person {

    int num=20;
    Person(){
        System.out.println("父类的无参构造");
    }
    Person(int num){
        System.out.println(num+"父类的有参构造");
    }

    public void method(){
        System.out.println("父类方法");

    }
}
