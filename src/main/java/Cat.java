public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("miaw");
    }
    @Override
    public boolean eat(String foodType){
        return true;
    }
}
