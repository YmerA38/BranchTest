public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("miaw");
    }
    @Override
    public boolean eat(String foodType){
        return true;
    }
    @Override
    public void mood(boolean goodMood){
        if(goodMood){
            System.out.println("purring");
        }else{
            System.out.println("hissing");
        }
    }
}
