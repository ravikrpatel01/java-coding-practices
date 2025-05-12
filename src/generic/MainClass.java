package generic;

public class MainClass {
    public static void main(String[] args) {
        GenericClass<Integer> g1 = new GenericClass<>(12);
        System.out.println("Value: " + g1.getValue());
        System.out.println("Class: " + g1.val.getClass().getName());

        GenericClass<String> g2 = new GenericClass<>("Ravi Patel");
        System.out.println("Value: " + g2.getValue());
        System.out.println("Class: " + g2.val.getClass().getName());
    }
}
