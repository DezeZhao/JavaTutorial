package JavaAdvance.Collection_Generic.DemoGeneric;

public class GenericInterfaceImpl extends GenericInterface<String> {
    @Override
    public void method(String i) {
        System.out.println(i);
    }
}
