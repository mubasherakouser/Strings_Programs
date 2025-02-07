import java.util.Scanner;
import java.util.Arrays;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1=sc.nextLine();
		System.out.println("Enter String 2 : ");
	    String s2=sc.nextLine();
        if(isAnagram(s1,s2)){
			System.out.println("Anagrams");
		}
        else{
	       System.out.println("Not Anagrams");
       }		
	}
	static boolean isAnagram(String s1,String s2){
		char[] ch1=s1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch2);
		String s3=new String(ch1);
		String s4=new String(ch2);
		return s3.equals(s4);
	}
}
