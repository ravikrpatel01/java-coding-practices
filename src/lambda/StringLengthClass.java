package lambda;

public class StringLengthClass {
    public static void main(String[] args) {
        StringLengthInterface s1 = (str -> str.length());
        System.out.println("Length: " + s1.findLength("Hello Java!"));
    }
}
