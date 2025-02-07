import java.util.Scanner;
import java.util.HashSet;
public class Panagram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		if(isPanagram(s)){
			System.out.println("Panagram ");
		}
		else{
			System.out.println("NOt Panagram");
		}
	}
	static boolean isPanagram(String s){
		HashSet<Character> hs=new HashSet<>();
		s=s.toLowerCase();
		for(int i=0;i<=s.length()-1;i++){
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z'){
				hs.add(ch);
			}
		}
		return hs.size()==26;
	}
}
