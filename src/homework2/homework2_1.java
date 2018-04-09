import java.util.Scanner;

public class homework2_1{
    public static void  main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Input number");
	int a= sc.nextInt();
	byte v=(byte)a;

	System.out.printf("%s는 %d를 2진수로 표현한 것입니다.",toBinaryString(v),a);
}
   static String toBinaryString(byte v){
	String zero = "00000000";
	String tmp = zero + Integer.toBinaryString(v);
	return tmp.substring(tmp.length()-8);
   }
}