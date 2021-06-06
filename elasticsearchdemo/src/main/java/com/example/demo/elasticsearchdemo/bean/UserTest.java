package com.example.demo.elasticsearchdemo.bean;

import java.util.*;
import java.util.stream.Collectors;

public class UserTest {

    public static void main(String[] args) {
        User user1 = new User("1", "杨平1");
        User user2 = new User("1", "杨平2");
        User user3 = new User("1", "杨平3");
        User user4 = new User("2", "王富贵");
        User user5 = new User("3", "曹展");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

         List<User> newList = list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getStudentNo))), ArrayList::new));



        for (int i=0; i < newList.size(); i++) {
            List<String> tags = new ArrayList<>();
            for (int j=0 ; j < list.size(); j++) {
                if (newList.get(i).getStudentNo().equals(list.get(j).getStudentNo())) {
                    tags.add(list.get(j).getName());
                }
            }
            newList.get(i).setTags(tags);
        }

        for(User user: newList) {
            System.out.println(user);
        }
    }
}
