public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fB = new FizzBuzz();
        String test = fB.fizzBuzz(3);
        System.out.println(test);
        test = fB.fizzBuzz(5);
        System.out.println(test);
        test = fB.fizzBuzz(15);
        System.out.println(test);
        test = fB.fizzBuzz(2);
        System.out.println(test);
    }
}