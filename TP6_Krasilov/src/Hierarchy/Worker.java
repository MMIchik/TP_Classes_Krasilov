package Hierarchy;

import Task.Request;

public abstract class Worker implements Request {
    private String name; //ФИО
    private int age; //Возраст

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info(){
        return name + " возраст: " + age + " ";
    }

    @Override
    public abstract double calculateMonthlySalary(); //Общий метод - посчитать месячную зп, идет из интерфейса
}
