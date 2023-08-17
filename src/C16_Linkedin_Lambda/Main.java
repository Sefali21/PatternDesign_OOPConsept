package C16_Linkedin_Lambda;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greeting greeting=new HelloGreeting();
        greeting.sayHello();

        Greeting greeting2= new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World with Interface Overriding");
            }
        };
        greeting2.sayHello();

        Greeting greeting3=() -> System.out.println("Hello World with Lambda");
        //                 () cagrilan () method'da argumants varsa buraya yaziyoruz.
        //                     -> {} süslü parantez yerine
        greeting3.sayHello();


        Calculator calculator=(int x, int y) -> {           //birden fazla satir oldugu icin {} kullaniyoruz, sonunda };
            Random random=new Random();
            int randomNumber= random.nextInt(50); // [0 - 49]
            return x*y+randomNumber;
        };

        System.out.println(calculator.calculate(1, 2));

        IntBinaryOperator calculatorWithIntBinary= (int x, int y) -> {
            Random random=new Random();
            int randomNumber=random.nextInt(0,10);
            System.out.println("randomNumber:"+randomNumber);
            return x*y+randomNumber;
        };
        System.out.println(calculatorWithIntBinary.applyAsInt(1,2));




    }
}
