import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1;
		num1 = in.nextDouble();
		in.nextLine();
		System.out.print(Math.abs(num1));
		System.out.println();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num2;
		num2 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num3;
		num3 = in.nextDouble();
		in.nextLine();
		double result = num2/num3;
		System.out.print(Math.floor(result));
		System.out.println();
		System.out.print(Math.ceil(result));
		System.out.println();

	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num4;
		num4 = in.nextDouble();
		in.nextLine();
		System.out.print(Math.round(Math.sqrt(num4)));
		System.out.println();
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double base;
		base = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double exponent;
		exponent = in.nextDouble();
		in.nextLine();
		System.out.print(Math.pow(base,exponent));
		System.out.println();
		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num7;
		num7 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double num8;
		num8 = in.nextDouble();
		in.nextLine();
		System.out.print("Input one more number: ");
		double num9;
		num9 = in.nextDouble();
		in.nextLine();
		double result1 = Math.max(num7,num8);
		System.out.print(Math.max(result1, num9));
		System.out.println();
		double result2 = Math.min(num7,num8);
		System.out.print(Math.min(result2,num9));
		System.out.println();
	
	}
	public static void q6() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence;
		sentence = in.nextLine();
		System.out.print(sentence.contains("on"));
		System.out.println();
		
	}
	public static void q7() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String word;
		word = in.nextLine();
		System.out.print(word.equalsIgnoreCase("mango"));
		System.out.println();
		
	}
	public static void q8() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word2;
		word2 = in.nextLine();
		System.out.print("Input a letter: ");
		String letter;
		letter = in.nextLine();
		System.out.print(word2.indexOf(letter));
		System.out.println();
		System.out.print(word2.lastIndexOf(letter));
		System.out.println();
		
	}

	public static void q9() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence2;
		sentence2 = in.nextLine();
		System.out.print( "Your sentence is " + sentence2.length() + " characters long");
		System.out.println();
		
	}
	public static void q10() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence3;
		sentence3 = in.nextLine();
		System.out.print("Input a word to replace: ");		
		String replace;
		replace = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String word3;
		word3 = in.nextLine();
		System.out.print(sentence3.replaceAll(replace,word3));
		System.out.println();
	
	}

	public static void q11() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence4;
		sentence4 = in.nextLine();
		System.out.print(sentence4.toUpperCase().trim());
		System.out.println();
		System.out.print(sentence4.toLowerCase().trim());
		System.out.println();
		
	}

	public static void q12() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word4;
		word4 = in.nextLine();
		System.out.print(word4.substring(0,4));
		System.out.println();
		System.out.print(word4.substring(word4.length() - 4));
		System.out.println();
	}
	

}
