package hello;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        Arrays.asList("Hello, World!!!!").stream().forEach(System.out::print);
    }
}
