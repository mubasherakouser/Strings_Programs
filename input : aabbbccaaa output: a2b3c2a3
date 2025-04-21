import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        boolean b[] = new boolean[ch.length]; // To track visited characters

        for (int i = 0; i < ch.length; i++) {
            if (b[i] == false) {  // If the character hasn't been counted
                int count = 1;
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        count++;
                        b[j] = true;  // Mark as counted
                    }
                }
                System.out.print(ch[i] + "" + count); // Print the character and its count
            }
        }
    }
}
