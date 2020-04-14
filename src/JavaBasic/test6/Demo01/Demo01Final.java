package JavaBasic.test6.Demo01;
/*
final 关键字代表最终，不可改变的  相当于C++里面的const
常见四种用法：
1. 修饰一个类
2. 修饰一个方法
3. 修饰一个局部变量
4. 修饰一个成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);

        num1 = 20;
        System.out.println(num1);

        final int num2 = 20;
        System.out.println(num2);
        //num2 = 25;//错误！不能再次赋值
        //修饰局部变量
        final  int num3;
        num3 = 30;//可以先定义在赋值
        System.out.println(num3);
        //final 修饰符定义的变量只能赋值一次

        Student stu1 = new Student("赵得泽");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        stu1 = new Student("赵刚");//可以new  地址值改变
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("==============================");
        //对于基本类型来说，不可变指的是变量中的数据不能变；
        //对于引用类型来说，不可变指的是变量当中的地址不可变。
        final Student stu2 = new Student("赵得泽");
        //stu2 = new Student();//错误写法，不可new 一new地址值会改变
        //final修饰之后，变量的地址值不变
        System.out.println(stu2.getName());
        stu2.setName("赵刚");
        System.out.println(stu2.getName());
    }
}
