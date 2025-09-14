package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        //1. Immutable list (Java 9+): can't add/remove/change elements, fixed size, good for read-only data
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        //2. Mutable list, can easily add,remove,update freely, backed by dynamic array, most common way
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        //3. Semi-mutable list, fixed-size, can change existing elements
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7);


        //Let's work on list1
        //Q. Without stream API, filter even numbers from list1 and make a new list
        List<Integer> listEven = new ArrayList<>();
        for (Integer i: numbers){
            if (i % 2 == 0) listEven.add(i);
        }
        System.out.println(numbers);
        System.out.println(listEven);

        //Q. With stream API, filter even numbers from list1 and make a new list
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList(); //returns unmodifiable list
        //      .collect(Collectors.toList()) //modifiable
        System.out.println(evens);

        //Q. Print numbers greater than 5
        List<Integer> moreThan5 = numbers.stream().filter(n -> n > 5).toList();
        System.out.println(moreThan5);

        //Q. Print the sum of all even numbers
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);

        //Q. Print the sum of all even numbers using reduce
        int sum2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a,b)-> a+b);

        /*
        reduce(0, ...) → starts from 0 and keeps adding.
        (a, b) -> a + b → lambda for addition.
         */

        System.out.println(sum2);

        //Q. Print max even number from list
        int maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .max()
                .orElseThrow(); //handles empty case
        System.out.println(maxEven);

        //Q. Print min odd number from list
        int minEven = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n)
                .min()
                .orElseThrow(); //handles empty case
        System.out.println(minEven);


        //Q. Find the shortest word using streams
        List<String> names = Arrays.asList("apple", "banana", "kiwi", "mango");

        names.stream().forEach(System.out::println);

        String shortest = names.stream()
                //.min(Comparator.naturalOrder())//lexicographically shortest
                .min(Comparator.comparingInt(String::length)) //compare based on word length)
                .orElseThrow();
        System.out.println(shortest);


        //Q. Keep only words longer than 4 chars, then convert to uppercase
        List<String> result = names.stream()
                .filter(n -> n.length() > 4) //"apple", "banana", "mango"
                .map(String::toUpperCase) //"APPLE", "BANANA", "MANGO"
                .toList();
        System.out.println(result);

        //Q. Keep only words starting with letter 'A'
        List<String> list = names.stream()
                .filter(n -> n.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}

/*
1. filter()

Used to select elements from a stream based on a condition.

Takes a Predicate<T> (a function returning true/false).

Keeps only those elements where the condition is true.

✅ BasicExample: get only even numbers

List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

List<Integer> evens = numbers.stream()
                             .filter(n -> n % 2 == 0)
                             .toList();

System.out.println(evens); // [2, 4, 6]

2. map()

Used to transform elements of a stream into something else.

Takes a Function<T,R> (a function mapping one type to another).

Returns a new stream of transformed elements.

✅ BasicExample: square all numbers

List<Integer> numbers = Arrays.asList(1,2,3,4,5);

List<Integer> squares = numbers.stream()
                               .map(n -> n * n)
                               .toList();

System.out.println(squares); // [1, 4, 9, 16, 25]
 */
