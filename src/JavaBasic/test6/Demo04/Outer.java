package JavaBasic.test6.Demo04;

/*
如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
“局部”：只有当前所属的方法才能使用它，出了这个方法外面就不能用了。

权限修饰符：
public > protected > (default) > private

1. 定义外部类：public /(default)
2. 成员内部类: public /protected / (default) /private
3. 局部内部类：无修饰符
 */

/*public*/ class Outer {
    public void methodOuter() {
        class Inner {

            final int num = 10;

            public void methodInner() {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
