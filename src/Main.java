import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        task1(nums);
        task2(nums);
        task3(strings);
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        List<Integer> oddNumber = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                oddNumber.add(num);
            }
        }
        System.out.println(oddNumber);
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> evenNumber = new TreeSet<>(nums);
        System.out.println(evenNumber);
    }

    public static void task3(List<String> strings) {
        Set<String> uniqueStrings = new TreeSet<>(strings);
        System.out.println(uniqueStrings);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> repeatStrings = new HashMap<>();
        for (String string : strings) {
            if (repeatStrings.containsKey(string)) {
                repeatStrings.put(string, repeatStrings.get(string) + 1);
            } else {
                repeatStrings.put(string, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : repeatStrings.entrySet()) {
            if (entry.getValue() >= 1) {
                System.out.println(entry);
            }
        }
    }
}