package jdk8.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LambdaMainTest {

    @Test
    void 람다테스트() {
        List<String> stringList = Arrays.asList("a", "ab", "abc", "abcd" ,"b", "bc", "bcd", "ab", "ab");

        //반복문
        stringList.forEach(System.out::println);

        //map
        List<String> newStringList = stringList.stream()
                .map(s -> s + "추가")
                .collect(Collectors.toList());

        //Set
        Set<String> newStringSet = stringList.stream()
                .filter(s -> s.contains("ab"))
                .map(s -> s + "추가")
                .collect(Collectors.toSet());

        //count
        long count = stringList.stream().count();
        System.out.println(count);

        //allMatch
        boolean allMatch = stringList.stream().allMatch(s -> s.equals("ab"));
        System.out.println(allMatch);

        //anyMatch
        boolean anyMatch = stringList.stream().anyMatch(s -> s.equals("ab"));
        System.out.println(anyMatch);

        boolean noneMatch = stringList.stream().noneMatch(s -> s.equals("ab"));
        System.out.println(noneMatch);

        //distinct
        List<String> distinctList = stringList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctList);

        //reduce
        String reduceString = stringList.stream()
                .reduce("", (acc, cur) -> {
                    String aa = "";
                    if(cur.contains("a")){
                        aa = acc + cur;
                    }
                    return aa;
                });

        String reduceString1 = stringList.stream()
                .reduce((acc, cur) -> acc + cur)
                .orElse("empty");

        //findAny
        String findAny = stringList.stream().findAny().get();
        System.out.println(findAny);

        //findFirst
        String findFirst = stringList.stream().findFirst()
                .orElseGet(String::new);

        //limit
        List<String> limitList = stringList.stream()
                .limit(5)
                .collect(Collectors.toList());
    }
}