package jdk8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        List<User> userList = Arrays.asList(user1, user2);
        Optional<List<User>> optionalUsers = Optional.of(userList);
    }
}
