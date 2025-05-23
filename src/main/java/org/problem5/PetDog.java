package org.problem5;

public class PetDog {
    private String name;
    private int age;
    private String breed;


    public PetDog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Method to simulate barking
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    // Method to simulate spinning
    public void spin() {
        System.out.println(name + " is spinning around.");
    }

    // Method to simulate running
    public void run() {
        System.out.println(name + " is running.");
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public static void main(String[] args) {
        PetDog myDog = new PetDog("Buddy", 3, "Golden Retriever");

        myDog.bark();  // Buddy says: Woof! Woof!
        myDog.spin();  // Buddy is spinning around.
        myDog.run();   // Buddy is running.
    }
}

