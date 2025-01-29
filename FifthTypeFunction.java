import java.util.Scanner;
public class FifthTypeFunction {
	static float m1(String Country,int amt) {
           float res=0.0f;
			if(Country.equalsIgnoreCase("USA")) {
				 res=amt *78.67f;
			 }
			 else if(Country.equalsIgnoreCase("UK")) {
				 res=amt*120.56f;
			 }
			 else if(Country.equalsIgnoreCase("UAE")) {
				 res=amt*20.56f;
			 }
			 return res;
				  }
	static int getamt() {
		return 100;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Country......");
		String Country=sc.next();
		String cC=getamtdetails(Country);
		System.out.println("please enter"+cC);
		if(cC.equalsIgnoreCase("Country not found")) {
			System.out.println("not able to process");
		}
		else {
			int amt =sc.nextInt();
			System.out.println("For this"+Country+
					"for this amt="+amt+" indian amt="
					+m1(Country,amt));
		}
	}
	static String getamtdetails(String Country) {
		String res="";
		if(Country.equalsIgnoreCase("USA")) {
			res="Dollar";
		}
		if(Country.equalsIgnoreCase("UK")) {
			res="Pound";
	}
		if(Country.equalsIgnoreCase("UAE")) {
			res="Diram";
		}
		else {
			res ="Country not found";
		}
		return res;
		}
}
