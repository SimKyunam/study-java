package jdk8.lambda;

@FunctionalInterface
public interface ForEachFunction<T> {
    void process(T t);
}
