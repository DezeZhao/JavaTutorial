package JavaBasic.test6.Demo05;

/*
如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】
匿名内部类的定义格式：
接口名称 对象名 = new 接口名称() {
    // 覆盖重写所有抽象方法
};

1. 匿名内部类，在创建对象的时候只能使用唯一一次；
如果希望多次创建对象，而且类的内容一样的话，那么就需要使用单独定义的实现类了。

2. 匿名内部类，在调用方法的时候只能调用一次；
如果希望同一个对象，调用多次方法，那么必须给对象起个名字。

3. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
【强调】匿名内部类和匿名对象不是一回事！！
 */
public class Demo05Main {
    public static void main(String[] args) {
        //调用接口实现类
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method1();
        impl.method2();

        System.out.println("==============================");

        //使用匿名内部类，但不是匿名对象，对象名称就叫objA
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类覆盖重写了方法1111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类覆盖重写了方法2222");

            }
        };
        objA.method1();
        objA.method2();

//        objA = new MyInterface() {
//            @Override
//            public void method1() {
//                System.out.println("匿名内部类覆盖重写了方法1111");
//            }
//
//            @Override
//            public void method2() {
//                System.out.println("匿名内部类覆盖重写了方法2222");
//            }
//        };
//        objA.method1();
//        objA.method2();

        System.out.println("==============================");

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类/匿名对象覆盖重写了方法1111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类/匿名对象覆盖重写了方法2222");

            }
        }.method1();
        //要想调用method2()就必须还得定义一次
        // 因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类/匿名对象覆盖重写了方法1111");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类/匿名对象覆盖重写了方法2222");

            }
        }.method2();


    }

}
