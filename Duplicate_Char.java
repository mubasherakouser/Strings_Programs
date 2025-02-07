import java.util.Scanner;
class Duplicate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		boolean b[]=new boolean[ch.length];
		for(int i=0;i<=ch.length-1;i++){
			if(b[i]==false){
				int count=1;
				for(int j=i+1;j<=ch.length-1;j++){
					if(ch[i]==ch[j]){
						count++;
						b[j]=true;
					}
				}
				if(count>1){
			      System.out.print(ch[i]+"-"+count);
				  System.out.println();
				}
			}
			
		}
	}
}
