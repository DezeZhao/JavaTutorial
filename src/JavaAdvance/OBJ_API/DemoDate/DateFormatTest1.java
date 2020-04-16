package JavaAdvance.OBJ_API.DemoDate;

import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;

public class DateFormatTest1 {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /*
        使用DateFormat类中的方法format,把日期格式化为文本
        使用步骤:
            1.创建SimpleDateFormat对象,构造方法中传递指定的模式
            2.调用SimpleDateFormat对象中的方法format,按照构造方法中指定的模式,把Date日期格式化为符合模式的字符串(文本)
     */
    public static void demo01() {
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(text);
    }

    /*
        使用DateFormat类中的方法parse,把文本解析为日期
        使用步骤:
           1.创建SimpleDateFormat对象,构造方法中传递指定的模式
           2.调用SimpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串,解析为Date日期
           注意:
               public Date parse(String source) throws ParseException
               parse方法声明了一个异常叫ParseException
               如果字符串和构造方法的模式不一样,那么程序就会抛出此异常
               调用一个抛出了异常的方法,就必须的处理这个异常,要么throws继续抛出这个异常,要么try catch自己处理
    */
    public static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用SimpleDateFormat类中的parse方法将符合模式的字符串解析为日期
        Date date = sdf.parse("2020年04月16日 22时54分37秒");
    }

}
