package competitive.programming.examples;

import java.math.BigInteger;

public class Ch1_01_FactorialNumero {

	public static void main(String[] args) {
	    BigInteger fac = BigInteger.ONE;
	    for (int i = 2; i <= 25; i++)
	      fac = fac.multiply(BigInteger.valueOf(i));   // it is in the library!
	    System.out.println(fac);
	  }

}
