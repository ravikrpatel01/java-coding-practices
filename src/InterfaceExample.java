interface Greeting {
    public void greet(int age);
}

public class InterfaceExample {
    public static void main(String[] args) {
        /*
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hii Ravi Patel.");
            }
        };
        */
        Greeting greeting = (int age) -> System.out.println("Hii, Ravi. you are " + age + " years old!");
        greeting.greet(24);
    }
}


