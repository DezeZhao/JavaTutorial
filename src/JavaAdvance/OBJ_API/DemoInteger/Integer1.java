package JavaAdvance.OBJ_API.DemoInteger;

/*
    基本类型与字符串类型之间的相互转换
    基本类型->字符串(String)
        1.基本类型的值+""  最简单的方法(工作中常用)
        2.包装类的静态方法toString(参数),不是Object类的toString() 重载
            static String toString(int i) 返回一个表示指定整数的 String 对象。
        3.String类的静态方法valueOf(参数)
            static String valueOf(int i) 返回 int 参数的字符串表示形式。
    字符串(String)->基本类型
        使用包装类的静态方法parseXXX("字符串");
            Integer类: static int parseInt(String s)
            Double类: static double parseDouble(String s)
 */
public class Integer1 {
    public static void main(String[] args) {
        //基本类型 2 字符串
        String s1 = 100 + "";
        System.out.println(s1 + 1000);//1001000

        String s2 = Integer.toString(100);
        System.out.println(s2);

        String s3 = String.valueOf(1000);
        System.out.println(s3);

        //字符串 2 基本类型
        int i1 = Integer.parseInt("100");
        System.out.println(i1);

        //int i2 = Integer.parseInt("a");//错误
    }
}
