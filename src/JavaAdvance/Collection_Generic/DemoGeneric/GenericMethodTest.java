package JavaAdvance.Collection_Generic.DemoGeneric;

public class GenericMethodTest {
    public static void main(String[] args) {
        GenericMethod gm1 = new GenericMethod();

        gm1.Method1(1);
        gm1.Method1("csdcsd");
        gm1.Method1(true);
        gm1.Method1(34.5);

//        GenericMethod gm2 = new GenericMethod();
        //静态方法,通过类名.方法名(参数)可以直接使用
        GenericMethod.method2(1);
        //.....
    }
}
