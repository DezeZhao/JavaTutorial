package JavaBasic.test5.Demo10;

/*
如何才能知道一个父类引用的对象本来是那个子类？
对象名 instanceof 类名称
得到布尔值结果来判断
 */
public class Demo10Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        getAPet(animal);
    }

    //当然这种方法主要在 当Animal对象 animal 作为参数传给函数的时候 需要判断
    public static void getAPet(Animal animal) {
        // 如果希望调用子类特有方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();//调用Dog的特有方法
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();//调用Cat的特有方法
        }
    }

}
