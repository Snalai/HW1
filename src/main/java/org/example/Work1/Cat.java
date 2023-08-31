package org.example.Work1;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void greet(String name, int age, String nameow){
        System.out.println("Мяу! Меня зовут " + name + ". Мне "+ age + " года(лет). Мой владелец - " + nameow + ".");
    }
}
