package JavaAdvance.Collection_Generic.DemoGeneric;

public class GenericInterfaceTest {
    public static void main(String[] args) {
        //方法1 在实现的时候指定泛型的类型
        GenericInterfaceImpl impl = new GenericInterfaceImpl();
        impl.method("zhangsan");

        //方法2 再定义对象的时候指定泛型的类型
        GenericInterfaceImpl2<String> impl2 = new GenericInterfaceImpl2<String>();
        impl2.method("zhangsan");

        GenericInterfaceImpl2<Integer> impl3 = new GenericInterfaceImpl2<Integer>();
        impl3.method(1000);
    }
}
