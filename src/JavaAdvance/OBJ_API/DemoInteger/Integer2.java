package JavaAdvance.OBJ_API.DemoInteger;

import java.util.ArrayList;

/*
    自动装箱与自动拆箱:基本类型的数据和包装类之间可以自动的相互转换
    JDK1.5之后出现的新特性
 */
public class Integer2 {
    public static void main(String[] args) {
        Integer in1 = 1;

        /*
            自动拆箱:in是包装类,无法直接参与运算,可以自动转换为基本数据类型,在进行计算
            in+2;就相当于 in.intVale() + 2 = 3
            in = in.intVale() + 2 = 3 又是一个自动装箱
         */
        in1 = in1 + 2;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        int i = list.get(0);
        System.out.println(i);
    }
}
