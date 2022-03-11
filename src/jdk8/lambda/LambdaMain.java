package jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "ab", "abc", "abcd" ,"b", "bc", "bcd", "ab", "ab");

        //반복문
        stringList.forEach(System.out::println);

        //map
        List<String> newStringList = stringList.stream()
                .map(s -> s + "추가")
                .collect(Collectors.toList());

        Set<String> newStringSet = stringList.stream()
                .filter(s -> s.contains("ab"))
                .collect(Collectors.toSet());

    }
}
