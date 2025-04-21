class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int cv=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++){
			if (ch[i] == ' ') { // Print count when word ends
                  System.out.println("Number of vowels in word : " + cv);
                   cv = 0; 
             }
			 else {
                 if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                   cv++; 
                 }
            }
        }
		System.out.println("Number of vowels in word : "+cv);
	}
}
