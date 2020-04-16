package JavaAdvance.OBJ_API.DemoDate;

import java.util.Date;

public class Date2 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    public static void demo01() {
        Date date = new Date();
        System.out.println(date);

    }

    public static void demo02() {
        Date date = new Date(0L);//传入参数0ms
        System.out.println(date);

    }

    //Date类的gettime方法
    public static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//1587048031163
    }

}
