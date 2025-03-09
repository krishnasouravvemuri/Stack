import java.util.*;

public class Stack_01_basics{
    
    public static void main(String [] args){

        Stack <Integer> st = new Stack<>();
        System.out.print("Enter the size of the stack : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        for(int i = 0 ; i < n ; i++) {
            System.out.print("Enter the stack element  " + i + " : ");
            int el = sc.nextInt();
            st.push(el);
        }
        
        System.out.println(st);
        System.out.println("The top element is " + st.peek());
        if (!st.isEmpty()) {
            st.pop();
        }
        

        System.out.println("is the stack empty ? " + st.isEmpty());        
        System.out.println("After popping : " + st);
        sc.close();
    
    }
}