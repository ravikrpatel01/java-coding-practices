public class DetectCapital {
    public static boolean detectCapital(String str) {
        if (str.length() == 1) {
            return true;
        }

        if (str.equals(str.toUpperCase())) {
            return true;
        }

        if (str.equals(str.toLowerCase())) {
            return true;
        }
        return Character.isUpperCase(str.charAt(0)) && str.substring(1).equals(str.substring(1).toLowerCase());
    }
    public static void main(String[] args) {
        String str = "Uppercase";
        boolean result = detectCapital(str);
        System.out.println("Result: " + result);
    }
}
