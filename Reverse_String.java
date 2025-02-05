import java.util.Scanner;
class Strings_All_P{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String :");
	String s=sc.nextLine();
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--){
		char ch=s.charAt(i);
		rev=rev+ch;
	}
	System.out.println(rev);
}
}
//another way to reverse a string
//String rev=new StringBuffer(s).reverse().toString();
//System.out.println(rev);
	

