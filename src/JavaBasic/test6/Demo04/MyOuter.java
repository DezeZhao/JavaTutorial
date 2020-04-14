package JavaBasic.test6.Demo04;

public class MyOuter {

    public void methodOuter() {
        int num = 10;

        class MyInner {//局部内部类

            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
