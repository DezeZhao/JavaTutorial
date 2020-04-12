package JavaBasic.test3;

public class myTest3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();

        DogGolden gd = new DogGolden();
        gd.sleep();//自己实现的方法
        gd.eat();//继承父类Dog

        DogLabuladuo lg = new DogLabuladuo();
        lg.sleep();//自己实现的方法
        lg.eat();//继承父类Dog



    }
}
