package competitive.programming.examples;

import java.math.BigInteger;
import java.util.Scanner;

class ch5_05_UVa1230 { /* UVa 1230 - LA 4104 - MODEX, 0.189s in Java */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    while (c-- > 0) {
      BigInteger x = BigInteger.valueOf(sc.nextInt()); // valueOf converts
      BigInteger y = BigInteger.valueOf(sc.nextInt()); // simple integer
      BigInteger n = BigInteger.valueOf(sc.nextInt()); // into BigInteger
      System.out.println(x.modPow(y, n)); // look ma, it's in the library ;)
} } }
