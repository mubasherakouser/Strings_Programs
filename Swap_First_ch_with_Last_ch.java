import java.util.Scanner;
class swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int f=0;
		for(int i=0;i<=ch.length-1;i++){
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
				f=i;
			}
			else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				char temp=ch[f];
				ch[f]=ch[i];
				ch[i]=temp;
			}
		}
		System.out.println("After Swapping ");
		System.out.println(ch);
	}
}
