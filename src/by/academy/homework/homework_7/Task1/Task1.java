package by.academy.homework.homework_7.Task1;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String... args) {
        List<Long> ls = new Random()
                .longs(100, 1, 100).
                        map(x -> x * (long) Math.PI - 20).filter(x -> x < 100).sorted().skip(3).distinct().boxed().
                        collect(Collectors.toList());
        System.out.println(ls);
        Map<Long, String> map = ls.stream().collect(Collectors.toMap(x -> x, y -> "Number" + y.longValue()));
        System.out.println(map);
    }
}
