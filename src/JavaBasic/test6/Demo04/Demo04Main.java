package JavaBasic.test6.Demo04;

/*
局部内部类：
如果希望访问所在方法的局部变量，这个局部变量【必须是final】的

java8+ 以后 final关键在可在局部变量事实不变的情况下省略。

原因:
1. new 处来的对象在堆中
2. 局部变量跟着方法走，在栈中
3. 方法运行结束后局部变量就立刻出栈，销毁
4. new出来的对象会【在堆当中持续存在】，直到垃圾回收消失。
 */
public class Demo04Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.methodOuter();
    }

}
