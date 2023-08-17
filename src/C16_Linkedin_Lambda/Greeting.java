package C16_Linkedin_Lambda;

@FunctionalInterface
public interface Greeting {

    void sayHello();
    //void sayGoodbye();
}


/*
    Functional interfaces are used in Java primarily because they serve as the foundation for lambda expressions and the functional programming paradigm.
    Java introduced lambda expressions in Java 8 to make functional programming more expressive and less verbose.
    Lambda expressions allow you to write compact and more readable code when you need to pass behavior as a method argument,
    especially when working with collections, streams, and concurrency.

    The restriction of having only one abstract method in a functional interface is essential for lambda expressions to work effectively.
    This single abstract method defines the "single unit of behavior" that the lambda expression represents.
    When you use a lambda expression to implement the functional interface,
    it's clear which method you want to associate with the lambda expression, as there's only one abstract method available.

    If a functional interface had more than one abstract method, there would be ambiguity regarding which method should be associated with the lambda expression.
    This would defeat the purpose of lambda expressions, as they would become less concise and more error-prone.

    It's worth noting that even though a functional interface can have default methods with implementations or static methods,
    these additional methods don't interfere with the single abstract method contract, and they are not considered when using lambda expressions.

    In summary, functional interfaces are designed to work with lambda expressions and provide a clean and straightforward way to represent single units of behavior.
    This design choice enhances the readability and conciseness of code when dealing with functional programming constructs in Java.
*/
