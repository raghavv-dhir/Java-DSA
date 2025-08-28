package Java8;

public class LambdaExpressions {
    public static void main(String[] args) {
        sayHello();
    }
    private static void sayHello(){
        System.out.println("Hello!");
    }
}
/*
#Lambda expression is an anonymous function
-> Not having any name
-> Not having any return-type
-> Not having modifier


#Steps to make any function lambda expression
-> Remove modifier
-> Remove return-type
-> Remove method name
-> Place arrow


#Examples:
1. () -> System.out.print("Hello");  //No need of {} in case of single statement
2. (a, b) -> System.out.print(a+b); No need to write return type
3. s -> s.length();  No need of return and () in case of 1 parameter


#Benefits of Lambda expressions:
1. To enable functional programming
2. To make code more readable, maintainable and concise
3. To enable parallel processing
4. JAR file size reduction
5. Elimination of shadow variables
 */
