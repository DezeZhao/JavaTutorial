package JavaBasic.test5.Demo11;

public class Demo11Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        USB usb1 = new Mouse(); //多态写法
        computer.useDevice(usb1);

        USB usb2 = new Keyboard();//多态写法
        computer.useDevice(usb2);//将接口作为参数

        //Keyboard usb3 = new Keyboard();//非多态写法 直接创建一个键盘实例（实现类对象）
        //computer.useDevice(usb3);//传进去的是实现类对象，发生向上转型  Keyboard->USB  (因为Keyboard实现了USB)
        //使用子类对象，匿名对象，也可以
        //computer.useDevice(new Keyboard());

        computer.powerOff();//笔记本关机


        System.out.println("======================================");

        method(10.0); // 正确写法，double --> double
        method(20); // 正确写法，int --> double
        int a = 30;
        method(a); // 正确写法，int --> double
    }

    public static void method(double m) {
        System.out.println(m);
    }
}
