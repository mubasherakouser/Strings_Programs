import java.util.Scanner;
import java.util.HashMap;
public class String_All_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		HashMap<Character,Integer> hm=new HashMap();
		String s1=s.toLowerCase();
		for(int i=0;i<=s1.length()-1;i++){
			char ch=s1.charAt(i);
			if(hm.containsKey(ch)){
				hm.put(ch,hm.get(ch)+1);
			}
			else{
				hm.put(ch,1);
			}
		}
			System.out.println(hm);	
}
}
