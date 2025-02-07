import java.util.Scanner;
class Strings{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String r=" ";
		for(int i=0;i<=s.length()-1;i++){
			if(s.charAt(i)==' '){
				r=r+'A';
			}
			else{
				r=r+s.charAt(i);
			}
		}
		System.out.println(r);
	}
}
