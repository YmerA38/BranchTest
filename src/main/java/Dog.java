public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("wuf");
    }
    @Override
    public boolean eat(String foodType){
        return true;
    }
}
