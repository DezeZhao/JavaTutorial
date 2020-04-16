package JavaAdvance.OBJ_API.DemoCalendar;

import java.util.Calendar;

/*
    java.util.Calendar :日历类 抽象类
    Calendar是一个抽象类 里面提供了很多操作日历的字段方法YEAR 、 Month DAY_OF_MONTH HOUR
    Calendar 类无法直接创建对象 里面有静态方法getInstance 返回Calendar类的子类对象
    static Calendar getInstance 使用默认时区获得一个日历
 */
public class Calendar1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
