import java.util.Scanner;
class Strings{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String unique=" ";int len=0;
		for(int i=0;i<=s.length()-1;i++){
			for(int j=i+1;j<=s.length()-1;j++){
				String sub=s.substring(i,j);
				if(isUnique(sub)){
					if(sub.length()>len){
						len=sub.length();
						unique=sub;
					}
				}
			}
		}
		System.out.println("Longest Unique SubString : "+unique);
	}
	static boolean isUnique(String s){
		for(int i=0;i<=s.length()-1;i++){
			for(int j=i+1;j<=s.length()-1;j++){
				if(s.charAt(i)==s.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
}
