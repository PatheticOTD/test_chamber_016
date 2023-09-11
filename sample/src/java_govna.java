import java.math.BigInteger;

public class java_govna {
    
    public static BigInteger factorial(int value) {
        BigInteger ans = BigInteger.valueOf(1);
        for (int i = 1; i < value; i++){
            BigInteger a = BigInteger.valueOf(i);
            ans = ans.multiply(a);   
        }
        return ans; // your implementation here
}
    public static void main(String[] args){


        System.out.println(factorial(1));

    }
}
    


