import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("3");
        ArrayList<BigInteger> bigIntegers = new ArrayList<>();
        bigIntegers.add(bigInteger);
        PrimeNumbers primeNumbers = new PrimeNumbers(bigIntegers, new BigInteger("5"));
        primeNumbers.loop();
    }
}
