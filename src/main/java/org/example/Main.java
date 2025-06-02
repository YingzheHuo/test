package org.example;

import org.example.exception.InvalidPassword;
import org.example.exception.SignUpException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println(Day.SATURDAY.isWeekend());

        Counter a = new Counter();
        Counter b = new Counter();
        a.increment();
        b.increment();
        System.out.println(a.instanceCounter);
        System.out.println(Counter.globalCounter);

        // Person
        System.out.println("Person output");
        Person p = new Person.Builder().age(18).name("John").gender("male").build();
        p.showPerson();

        // Calculator
        System.out.println("Calculator output");
        Calculator add = (x, y) -> x + y;
        Calculator mul = (x, y) -> x * y;

        System.out.println(add.calculate(5, 3));
        System.out.println(mul.calculate(5, 3));

        // Stream
        System.out.println("Stream output");
        List<String> words = Arrays.asList(
                "banana", "avocado", "berry", "apricot", "apple");
        List<String> result = words.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase)
                .sorted((x, y) -> Integer.compare(x.length(), y.length()))
                .toList();
        System.out.println(result);

        // File reader
//        FileReader.readFile("1.txt");

        // Sign Up
        SignUp signUp = new SignUp();
        String userName = "1", password = "123456";
        try {
            System.out.println("First input username: " + userName + " password: " + password);
            signUp.signUp(userName, password);
        } catch (SignUpException | InvalidPassword e) {
            throw new RuntimeException(e);
        }

        userName = "1";
        password = "123456";
        try {
            System.out.println("Second input username: " + userName + " password: " + password);
            signUp.signUp(userName, password);
        } catch (SignUpException | InvalidPassword e) {
            throw new RuntimeException(e);
        }


        signUp.signUp(userName, password);
    }
}