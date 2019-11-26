public class StringManipulatorTest {
    public static void main(String[] args) {
        // create instance of StringManipulator object
        StringManipulator manipulator = new StringManipulator();
        // testing problem #1
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);
        // testing problem #2
        Integer a = manipulator.getIndexOrNull("Coding", 'o');
        Integer b = manipulator.getIndexOrNull("Hello World", 'o');
        Integer c = manipulator.getIndexOrNull("Hi", 'o');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // testing problem #3
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        a = manipulator.getIndexOrNull(word, subString);
        b = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(a);
        System.out.println(b);
        // testing problem #4
        word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word);
    }
}