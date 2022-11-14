public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("wuf");
    }
    @Override
    public boolean eat(String foodType){
        return true;
    }

    @Override
    public void mood(boolean goodMood){
        if(goodMood){
            System.out.println("waking tail");
        }else{
            System.out.println("growling");
        }
    }
}
