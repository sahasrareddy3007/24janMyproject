import java.util.*;
public class RightRotation {
   public static void main(String[] args) {
	    int[] num;
		int size;
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter total no of elements");
		size = sc.nextInt();
		num = new int[size];
		for(int i=0;i<size;i++) {
		System.out.println("enter "+(i+1)+" element");
			num[i] = sc.nextInt();
		}
		System.out.println("before rotation all elements...");
		for(int i=0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
		processRR(num);	
	}
private static void processRR(int[] num) {
		
		int temp = num[num.length-1];
		for(int i=num.length-1;i>=1;i--) {
			num[i]= num[i-1];// 
		}
		num[0] = temp;
		System.out.println("\n After rotation all elements...\n");
		for(int i=0;i<=num.length-1;i++) {
			System.out.print(num[i]+" ");
		}	
	}

}