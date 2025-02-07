import java.util.Scanner;
class Strings{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		String rev=" ";
		for(int i=arr.length-1;i>=0;i--){
			rev=rev+arr[i]+" ";
		}
		System.out.println(rev);
	}
}
