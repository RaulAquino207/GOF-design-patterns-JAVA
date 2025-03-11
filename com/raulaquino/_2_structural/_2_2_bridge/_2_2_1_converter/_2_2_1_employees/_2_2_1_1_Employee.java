package com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_employees;

public abstract class _2_2_1_1_Employee {
    protected String name;
    protected Integer age;
    protected Double salary;

    public _2_2_1_1_Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
