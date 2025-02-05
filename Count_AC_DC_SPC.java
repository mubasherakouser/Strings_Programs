import java.util.Scanner;
class Strings_All_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		int ac=0,dc=0,spc=0;
		for(int i=0;i<=s.length()-1;i++){
		   char ch=s.charAt(i);
		   if(ch>='A'&& ch<='Z' || ch>='a'&&ch<='z'){
			   ac++;
		   }
		   else if(ch>='0' && ch<='9'){
			   dc++;
		   }
		   else{
			   spc++;
		   }
		}
		System.out.println("Alphabet Count : "+ac);
		System.out.println("Digit Count :"+dc);
		System.out.println("Special Character Count : "+spc);
	}
}
