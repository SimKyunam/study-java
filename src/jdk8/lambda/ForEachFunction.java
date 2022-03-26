package jdk8.lambda;

@FunctionalInterface
public interface ForEachFunction<T> {
    T process(T t);

    default ForEachFunction<T> system(ForEachFunction<T> function) {
        return (T t) -> {
            System.out.println(t);
            return process(function.process(t));
        };
    }
}
