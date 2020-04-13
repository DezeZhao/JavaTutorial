package JavaBasic.test5.Demo10;
/*
向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端：
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。

解决方案：用对象的向下转型【还原】。
 */
public class Demo10Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        //animal.catchMouse();//错误写法

        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        // 下面是错误的向下转型
        // 本来new的时候是一只猫，现在非要当做狗
        // 错误写法！编译不会报错，但是运行会出现异常：
        // java.lang.ClassCastException，类转换异常

        //Dog dog = (Dog) animal;

    }
}
