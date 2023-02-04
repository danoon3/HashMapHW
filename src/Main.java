import java.util.*;

public class Main {
    protected static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    private static int count = 1;

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        char[] symbols = TEXT.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            if (Character.isLetter(symbols[i])) {
                if (!map.containsKey(symbols[i])) {
                    map.put(symbols[i], count);
                } else {
                    int value = map.get(symbols[i]) + 1;
                    map.put(symbols[i], value);
                }
            }
        }

        Map.Entry<Character, Integer> maxValue = null;
        Map.Entry<Character, Integer> minimimValue = null;

        for (Map.Entry<Character, Integer> value : map.entrySet()) {
            if (maxValue == null || value.getValue() > maxValue.getValue()) {
                maxValue = value;
            }
            if (minimimValue == null || minimimValue.getValue() > value.getValue()) {
                minimimValue = value;
            }
        }
        System.out.println("Максимальное значение - " + maxValue);
        System.out.println("Минимальное значение - " + minimimValue);
    }
}