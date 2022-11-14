public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

            dog.makeSound();
            cat.makeSound();

            dog.eat("bone");
            cat.eat("mouse");

            dog.mood(false);
            cat.mood(true);
    }
}
