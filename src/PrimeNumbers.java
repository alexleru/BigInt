import java.math.BigInteger;
import java.util.ArrayList;

class PrimeNumbers {

    private ArrayList<BigInteger> bigIntegerArrayList;
    private BigInteger checkNumber;
    PrimeNumbers(ArrayList<BigInteger> bigIntegerArrayList, BigInteger checkNumber) {
        this.bigIntegerArrayList = bigIntegerArrayList;
    }

    void loop(){
        checkNumber = max(bigIntegerArrayList);
        for(int i = 0; i < 500; i++){
            checkNumber = checkNumber.add(BigInteger.TWO);
            checkNumber(bigIntegerArrayList, checkNumber);
        }
    }

    private void checkNumber(ArrayList<BigInteger> bigIntegerArrayList, BigInteger checkNumber){
        BigInteger maxPotentialDivider = (checkNumber.subtract(BigInteger.ONE)).divide(BigInteger.TWO);
        for (BigInteger bigInteger : bigIntegerArrayList){
            int compare = bigInteger.compareTo(maxPotentialDivider);
            if(compare > 0 ){
                this.bigIntegerArrayList.add(checkNumber);
                System.out.println("Prime:   " + checkNumber);
                break;
            }
            if((checkNumber.mod(bigInteger)).equals(BigInteger.ZERO)){
                System.out.println("Complex: " + checkNumber + " " + bigInteger );
                break;
            }
        }

    }

    private BigInteger max(ArrayList<BigInteger> bigIntegerArrayList){
        BigInteger max = new BigInteger("0");
        for (BigInteger bigInteger : bigIntegerArrayList){
            max = max.max(bigInteger);
        }
        return max;
    }
}
