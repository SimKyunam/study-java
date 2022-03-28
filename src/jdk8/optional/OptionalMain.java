package jdk8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMain {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        List<User> userList = Arrays.asList(user1, user2);

        Optional<List<User>> optionalUsers = Optional.of(userList);
        List<User> users = null;
        if(optionalUsers.isPresent()) {
            users = optionalUsers.get();
        }
        System.out.println(users);

        List<User> customList = userList.stream()
                .peek(user -> {
                    user.setName("홍길동");
                    user.setAge("10");
                })
                .collect(Collectors.toList());

        System.out.println(customList);
    }
}
