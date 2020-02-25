import java.math.BigInteger;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

	BigInteger b = new  BigInteger(in.next());

	BigInteger b1 = new  BigInteger(in.next());


	System.out.println(b.add(b1));

	System.out.println(b.multiply(b1));

	}

}