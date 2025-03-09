import java.util.*;

class Stack_03_Palindrome{
    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        int n = word.length();

        if(n%2 == 0){
            for(int i = 0 ; i < n/2 ; i++){
                char ch1 = word.charAt(i);
                st.push(ch1);
            }
            for(int i = n/2 ; i < n ; i++){
                char ch2 = word.charAt(i);
                if(!st.isEmpty() && ch2 == st.peek()){
                    st.pop();
                }
            }

            if(st.isEmpty()){
                System.out.println("Palindrome !");
            }
            else{
                System.out.println("Not a palindrome !");
            }

        }
        if(n%2 != 0){
            for(int i = 0 ; i < n/2 ; i++){
                char ch1 = word.charAt(i);
                st.push(ch1);
            }
            for(int i = (n/2)+1 ; i < n ; i++){
                char ch2 = word.charAt(i);
                if(!st.isEmpty() && ch2 == st.peek()){
                    st.pop();
                }
            }

            if(st.isEmpty()){
                System.out.println("Palindrome !");
            }
            else{
                System.out.println("Not a palindrome !");
            }

        }

        sc.close();

    }
}