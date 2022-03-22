package jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        ForEachFunction<String> forEachFunction = System.out::println;
        forEachFunction.process("헬로우");
    }
}
