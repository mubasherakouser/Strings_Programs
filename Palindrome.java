import java.util.Scanner;
class Strings_All_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		if(isPalindrome(s)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palimdrome");
		}
	}
	static boolean isPalindrome(String s){
		int i=0,j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
