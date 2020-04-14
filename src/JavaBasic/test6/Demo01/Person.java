package JavaBasic.test6.Demo01;
/*
对于成员变量来说，final修饰之后不可变
1. 由于成员变量具有默认值用final修饰之后必须手动赋值，不会自动赋值
2. 对于final成员变量，要么使用直接赋值，要么使用构造方法赋值，其余方法不可
3. 必须保证类中所有重载的构造方法都会对final成员变量赋值
 */
public class Person {
    private final String name /*= "zhaodeze"*/;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name= "zhaodeze";
    }
    //只能有getter方法
    public String getName() {
        return name;
    }
}
