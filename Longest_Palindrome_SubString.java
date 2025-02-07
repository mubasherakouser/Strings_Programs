import java.util.Scanner;
class Strings_All_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String l=" ";
		int len=0;
		for(int i=0;i<=s.length()-1;i++){
			for(int j=i+1;j<=s.length()-1;j++){
				String sub=s.substring(i,j);
				if(isPalindrome(sub)){
					if(sub.length()>len){
						len=sub.length();
						l=sub;
					}
				}
			}
		}
		System.out.println("Longest Palindrome SubString : "+l);

	}
	static boolean isPalindrome(String s){
		String rev=new StringBuffer(s).reverse().toString();
		return s.equals(rev);
	}
}
