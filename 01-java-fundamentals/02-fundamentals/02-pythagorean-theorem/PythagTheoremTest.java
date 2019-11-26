public class PythagTheoremTest {
    public static void main(String[] args) {
        PythagTheorem pT = new PythagTheorem();
        Double test = pT.calculateHypotenuse(10, 5);
        System.out.println(test);
        test = pT.calculateHypotenuse(5, 15);
        System.out.println(test);
    }
}