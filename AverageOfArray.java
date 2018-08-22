import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
			sum+=a[i];
		}
		System.out.println(sum/n);
}}
