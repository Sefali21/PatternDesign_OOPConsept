package C16_Linkedin_Lambda;
import C10_Overriding.Animals;
public class HelloGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
