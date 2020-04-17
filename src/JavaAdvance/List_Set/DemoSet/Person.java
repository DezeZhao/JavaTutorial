package JavaAdvance.List_Set.DemoSet;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    //重写排序的规则
    @Override
    public int compareTo(Person o) {
        //return 0;认为元素都是相同的
        //自定义比较的规则,比较两个人的年龄(this,参数Person)
        //return this.getAge() - o.getAge();//年龄升序排序
        return this.getAge() - o.getAge();
    }
}
