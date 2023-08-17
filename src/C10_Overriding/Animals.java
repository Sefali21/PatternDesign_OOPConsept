package C10_Overriding;

public class Animals {
    protected boolean hasEyesToSee;
    protected void reproduktion(){
        System.out.println("All animals can reproduce");
    }
    protected void nutrition(){
        System.out.println("All animals must to be fed");
    }
    protected void movement(){
        System.out.println("All animals can move");
    }
    protected void respriration(){
        System.out.println("All animals must aspirate");
    }

}
