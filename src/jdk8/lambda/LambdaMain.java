package jdk8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "ab", "abc", "abcd" ,"b", "bc", "bcd");
        stringList.forEach(System.out::println);

        stringList.stream().map(s -> System.out.printf("출력테스트: %s", s));
    }
}
