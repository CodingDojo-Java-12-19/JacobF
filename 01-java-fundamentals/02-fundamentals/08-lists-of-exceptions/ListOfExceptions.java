import java.util.ArrayList;
import java.util.Random;

public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add("13");
        arr.add("hello world");
        arr.add(48);
        arr.add("Goodbye World");
        arr.add(7);

        for(int i = 0; i < arr.size(); i++) {
            try {
                Integer castedValue = (Integer) arr.get(i);
                System.out.println(castedValue);
            } catch(ClassCastException e) {
                System.out.println(e);
            }
        }
    }
}