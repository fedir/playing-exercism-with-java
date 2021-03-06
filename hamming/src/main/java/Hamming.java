import java.util.stream.IntStream;

public class Hamming {
    private int distance;
   
    public Hamming(String leftStrand, String rightStrand) {
        validation(leftStrand, rightStrand);
        distance = IntStream
        .range(0, leftStrand.length())
        .map(i -> leftStrand.charAt(i) != rightStrand.charAt(i) ? 1 : 0)
        .sum();
    }

    public int getHammingDistance() {
        return distance;        
    }

    private void validation (String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()) {
            if (leftStrand.isEmpty()) {
                throw new IllegalArgumentException("left strand must not be empty.");
            }
            if (rightStrand.isEmpty()) {
                throw new IllegalArgumentException("right strand must not be empty.");
            }
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }
}
