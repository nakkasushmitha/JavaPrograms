package Demoprograms;

public class Main {
        public static void main(String[] args) {
                Dog myDog = new Dog("Buddy", 3);
                Cat myCat = new Cat("Whiskers", 2);

                System.out.println("Dog details: Name - " + myDog.getName() + ", Age - " + myDog.getAge());
                myDog.printInfo();
                myDog.makeSound();

                System.out.println("\nCat details: Name - " + myCat.getName() + ", Age - " + myCat.getAge());
                myCat.printInfo();
                myCat.makeSound();
                myCat.displayAnimalType(myCat);
        }
}
