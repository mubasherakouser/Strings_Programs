import java.util.Scanner;
class Strings_All_P{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length-1;i++){
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
				count++;
			}
		}
		System.out.println("Number of Words :"+count);
	}
}
