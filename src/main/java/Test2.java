public class Test2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.eat();
        Animal animal1 = new Dog();
        dog.bark();
        animal1.eat();
        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal){
        animal.eat();
    }
}
