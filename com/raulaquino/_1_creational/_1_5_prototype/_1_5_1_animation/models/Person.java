package com.raulaquino._1_creational._1_5_prototype._1_5_1_animation.models;

public class Person implements Cloneable {

    String line1;
    String line2;
    String line3;
    String line4;

    Person(String line1, String line2, String line3, String line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    public void draw() {
        System.out.println("");
        System.out.println(this.line1);
        System.out.println(this.line2);
        System.out.println(this.line3);
        System.out.println(this.line4);
    }

    public void toLeft() {
        this.line1 = line1.substring(1);
        this.line2 = line2.substring(1);
        this.line3 = line3.substring(1);
        this.line4 = line4.substring(1);
    }

    public void toRight() {
        this.line1 = " " +  line1;
        this.line2 = " " + line2;
        this.line3 = " " + line3;
        this.line4 = "_" + line4;
    }

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
