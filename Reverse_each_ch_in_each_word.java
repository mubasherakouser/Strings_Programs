import java.util.Scanner;
class Strings_All_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String a[]=s.split(" ");
		String rev=" ";
		for(int i=0;i<=a.length-1;i++){
			String r=reverse(a[i]);
			rev=rev+r+" ";
		}
		System.out.println(rev);
	}
	static String reverse(String s){
		String rev=new StringBuffer(s).reverse().toString();
		return rev;
	}
}
