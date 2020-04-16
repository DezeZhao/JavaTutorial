package JavaBasic.test2;

public class Student extends Person {
    int num = 10;

    Student() {
        //默认赠送super();
        //构造方法的作用是初始化成员变量的。所以子类的初始化过程中，必须先执行父类的初始化动作。子类的构
        //造方法中默认有一个 super() ，表示调用父类的构造方法，父类成员变量初始化后，才可以给子类使用。
        this(100000);//无参构造调用有参构造,此时super()不再赠送,因为两者都必须是第一句。

        System.out.println("子类的无参构造");
    }

    Student(int num) {
        //super();默认赠送的，不写super调用时就会默认调用super函数调用无参构造
        super(num);//人为调用父类有参构造
        System.out.println(num+"子类的有参构造");
    }

    @Override
    public void method() {
        super.method();//调用父类方法
        System.out.println("子类方法");
        int num = 30;
        System.out.println(num);//30
        System.out.println(this.num);//10
        System.out.println(super.num);//20

    }

}
