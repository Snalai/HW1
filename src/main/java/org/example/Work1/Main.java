package org.example.Work1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pushok", 2);
        Owner owner = new Owner("Alan");
        cat.greet(cat.getName(), cat.getAge(), owner.name);

    }
}
