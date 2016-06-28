package com.company;

/**
 * Created by xiaojing on 2016/6/28.
 */
public class Animal implements Talking{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    private String name;
    private int ages;
    public Animal(String name,int age){
        this.name=name;
        this.ages=age;

    }
    public void say(){
        System.out.println("This is an animal");
    }
}
