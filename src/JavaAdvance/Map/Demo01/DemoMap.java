package JavaAdvance.Map.Demo01;

import java.util.HashMap;
import java.util.Map;

/*
    java.uitl.MAp<K,V>
    Map 集合的特点：
    1. 是双列集合 一个元素包含一个 键 一个值
    2. Key 和 Value 数据类型可同 可 不同
    3. Key 不允许重复 Value 允许重复
    4. Key Value 一一对应
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询的速度特别的快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
        2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致

    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap的特点:
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
*/
public class DemoMap {
    public static void main(String[] args) {
        //   demo01();
        // demo02();

        //demo03();
        demo04();
    }

    /*
       public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
           返回值:v
               存储键值对的时候,key不重复,返回值V是null
               存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
    */
    public static void demo01() {

        Map<String, String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰");
        System.out.println(v1);//null

        String v2 = map.put("李晨", "范冰冰1");
        System.out.println(v2);//返回被替换的value值 fanbinbin


        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        map.put("郭靖", "黄蓉");
        System.out.println(map);

    }

    /*
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            返回值:V
                key存在,v返回被删除的值
                key不存在,v返回null
     */
    public static void demo02() {
        Map<String, Integer> map = new HashMap<>();

        map.put("杨过", 188);
        map.put("尹志平", 178);
        map.put("郭靖", 180);
        System.out.println(map);

        Integer v1 = map.remove("杨过");
        System.out.println(v1);//188

        Integer v2 = map.remove("黄蓉");
        System.out.println(v2);//null
        //此处不可用int来接收返回值  若为null则会存在空指针异常 安全隐患

        System.out.println(map);
    }

    /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
     */
    public static void demo03() {
        Map<String, Integer> map = new HashMap<>();

        map.put("杨过", 188);
        map.put("尹志平", 178);
        map.put("郭靖", 180);
        System.out.println(map);

        Integer v1 = map.get("杨过");
        System.out.println(v1);
    }

    /*
        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        包含返回true,不包含返回false
     */
    public static void demo04() {
        Map<String, Integer> map = new HashMap<>();

        map.put("杨过", 188);
        map.put("尹志平", 178);
        map.put("郭靖", 180);
        System.out.println(map);

        boolean b = map.containsKey("杨过");
        System.out.println(b);
    }

}
