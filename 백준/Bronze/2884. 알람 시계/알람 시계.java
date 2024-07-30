import java.util.*;

public class Main{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		
		if(m>=45){
			System.out.println(h+" "+(m-45));
		}else{
			h= (h==0) ? 23 : h-1;
			m= 60 - (45-m);
			System.out.println(h+" "+m);
		}
		sc.close();
	}
}