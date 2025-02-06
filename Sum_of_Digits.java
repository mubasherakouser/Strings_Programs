import java.util.Scanner;
class Strings_All_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<=s.length()-1;i++){
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9'){
				sum=sum+(ch-48);
			}
		}
		System.out.println("Sum : "+sum);
	}
}
