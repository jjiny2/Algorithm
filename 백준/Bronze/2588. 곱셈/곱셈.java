import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		int num=B%10;
		int ten=(B/10)%10;
		int hun=(B/100)%10;
		
		System.out.println(A*num);
		System.out.println(A*ten);
		System.out.println(A*hun);
		System.out.println(A*B);
	}
}