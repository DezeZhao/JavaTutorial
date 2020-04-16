package JavaAdvance.OBJ_API.DemoCalendar;

import java.util.Calendar;
import java.util.Date;

/*
    Calendar类的常用成员方法:
        public int get(int field)：返回给定日历字段的值。
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1;	年
            public static final int MONTH = 2;	月
            public static final int DATE = 5;	月中的某一天
            public static final int DAY_OF_MONTH = 5;月中的某一天
            public static final int HOUR = 10; 		时
            public static final int MINUTE = 12; 	分
            public static final int SECOND = 13;	秒
 */
public class Calendar2 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    //public int get (int field) 返回给定日历字段值
    public static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    //public void set(int field)
    public static void demo02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, 5);
        c.set(Calendar.DAY_OF_MONTH, 30);
        //同时设置三个字段
        //c.set(2020, 2, 20);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }

    //public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
    public static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, -1);
        c.add(Calendar.MONTH, 3);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
    //public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    public static void demo04(){
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}
