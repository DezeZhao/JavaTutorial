package JavaAdvance.OBJ_API.DemoSystem;

import java.util.Arrays;

/*
    java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
        public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
 */
public class System1 {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    public static void demo01() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        long delta = end - start;
        System.out.println("程序耗时：" + delta + "ms");
    }

    public static void demo02() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};

        System.out.println("复制前：" + Arrays.toString(src));

        System.arraycopy(src, 2, dest, 0, 3);

        System.out.println("复制后：" + Arrays.toString(dest));
    }
}
