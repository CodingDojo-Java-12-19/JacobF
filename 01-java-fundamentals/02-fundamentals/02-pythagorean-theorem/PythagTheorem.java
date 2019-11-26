import java.lang.Math;

public class PythagTheorem {
    public double calculateHypotenuse(int lenA, int lenB) {
        double result = lenA * lenA + lenB * lenB;
        return Math.sqrt(result);
    }
}