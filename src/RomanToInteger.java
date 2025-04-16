import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String roman) {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i > 0 && hm.get(roman.charAt(i)) > hm.get(roman.charAt(i-1))) {
                result += hm.get(roman.charAt(i)) - hm.get(roman.charAt(i-1));
            }else {
                result += hm.get(roman.charAt(i));
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String roman = "MXXVII";
        System.out.println("Integer value: " + romanToInteger(roman));
    }
}
