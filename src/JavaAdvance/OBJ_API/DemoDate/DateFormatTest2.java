package JavaAdvance.OBJ_API.DemoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
计算某人出生了多少天
 */
public class DateFormatTest2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期：yyyy-MM-dd:");
        //获取出生日期
        String birthDateString = sc.next();
        //sdf 的parse 方法解析模式字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse(birthDateString);
        //获取出生日期转换为毫秒值
        long birthDateTime = birthDate.getTime();
        //获取当前时间 并转换为毫秒值
        long currentTime = new Date().getTime();
        //获取时间毫秒差
        long deltaTime = currentTime - birthDateTime;
        //转换为天数
        System.out.println(deltaTime / 1000 / 60 / 60 / 24);

    }

}
