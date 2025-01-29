
public class Program1 {
    static void arRR(int[] x) {
		 int len=x.length;
		 int arrlen=len-1;
		 int t=x[arrlen];
		 for(int i=arrlen;i>=1;i--) {
			 x[i]=x[i-1];
		 }
		 x[0]=t;
		 System.out.println("\n after 1 right rotation\n ");
		 for(int i=0; i<=arrlen;i++) {
			 System.out.println(x[i]+"  ");
		 }
	 }
	 public static void main(String args[]) {
		int[]num= {10,20,30,40,50} ;
		System.out.println("Before right Rotation");
		 for (int i=0; i< num.length;i++) {
			 System.out.print(num[i] + "  ");
			  }
		arRR(num);
		arRR(num);
		arRR(num);
	 }
	 
}
