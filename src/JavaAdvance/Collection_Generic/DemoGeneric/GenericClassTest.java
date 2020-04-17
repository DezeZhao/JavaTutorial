package JavaAdvance.Collection_Generic.DemoGeneric;

public class GenericClassTest {
    public static void main(String[] args) {
        //不写类型 默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");

        Object obj = gc.getName();

        //Integer
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        System.out.println(gc2.getName());

        //String
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("acd");
        System.out.println(gc3.getName());
    }
}
