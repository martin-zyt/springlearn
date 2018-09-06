package com.wangzhen.ch1;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 7:50 2018/9/6
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Person {
    private String name;
    private Integer age;

    public Person(){
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
