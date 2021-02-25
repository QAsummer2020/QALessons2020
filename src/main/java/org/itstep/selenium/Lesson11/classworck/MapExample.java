package org.itstep.selenium.Lesson11.classworck;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        //============List==============
        String[]str = {"zzzz","ffff","aaaa"};
        List<String>strings = new ArrayList<>(List.of(str));
        List<String> strings1 = Arrays.asList(str);
        strings.sort(String::compareTo);
        for (String s : strings) {
            System.out.println(s);
        }

        //==========Map===========
        Set<String>set = new HashSet<>();
        //   key     value
        Map<String, Integer>phoneBook = new HashMap<>();
        phoneBook.put("Elon", 99654212);
        phoneBook.put("Mike", 6643343);
        phoneBook.put("Tommy", 3332123);

//        for (String contact : phoneBook.keySet()) {
//            System.out.println(contact);
//        }
//        for (Integer value : phoneBook.values()) {
//            System.out.println(value);
//        }
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " "
                    + "Value = " +  entry.getValue());
        }
        //=========================
        Map<Person, Integer>personMap = new HashMap<>();
        personMap.put(new Person(3, "Evgen"), 999);
        personMap.put(new Person(2, "Alex"), 666);
        personMap.put(new Person(1, "Kirill"), 777);

        for (Person person : personMap.keySet()) {
            System.out.println(person);
        }
    }
}
