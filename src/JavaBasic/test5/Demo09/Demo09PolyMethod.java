package JavaBasic.test5.Demo09;

/*
多态中成员方法的访问规则是：
看new的是谁，就优先用谁，没有则向上找

口诀：编译看左边，运行看右边。

对比一下：
成员变量：编译看左边，运行还看左边。
成员方法：编译看左边，运行看右边。
*/
public class Demo09PolyMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();//子类的
        obj.methodFu();//父类特有方法
        obj.showNum();//子类的
        // 编译看左边，左边是Fu，Fu当中没有methodZi方法，所以编译报错。
//        obj.methodZi(); // 错误写法！
    }
}
