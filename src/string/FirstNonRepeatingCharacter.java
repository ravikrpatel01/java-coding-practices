package string;

public class FirstNonRepeatingCharacter {
    public static void checkNonRepeatingChar(String string) {
        char ans = '\u0000';
        char[] chars = new char[256];
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            chars[c]++;
        }

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (chars[c] == 1) {
                ans = c;
                break;
            }
        }

        if (ans != '\u0000') {
            System.out.println("First non-repeating character: "+ ans);
        }else {
            System.out.println("There is no character present.");
        }
    }
    public static void main(String[] args) {
        String str = "aatbbccs";
        checkNonRepeatingChar(str);
    }
}
