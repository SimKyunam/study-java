package jdk8.lambda;

public class LambdaMain {
    public static void main(String[] args) {
        ForEachFunction<String> function = (x) -> x;
        function.process("헬로우");

        function.system(x -> x);
    }
}
