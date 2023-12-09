package dev.sabri;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveIfChallenge {
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(22);
        list.add(128);

        Integer age = 14;
        Integer maxAge = 128;

        list.removeIf(e -> e == new Integer(12) || e == age || e == maxAge || e.equals(22));
        System.out.println(list);

    }
}
