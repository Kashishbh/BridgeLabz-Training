
public class AnimalHierarchy {
    static class Animal {
        private String name;
        private int age;
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
        p

            return name;
        }


        public int getAge() {
            return age;
        }
    }

    static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }
    static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
     

    
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }
    static class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
     

    
        @Override
        public void makeSound() {
            System.out.println("Bird chirps");
        }
    }
    public static void main(String[] args) {

        Animal dog = new Dog("Jerry", 3);
     

        Animal bird = new Bird("Mighty", 1);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
