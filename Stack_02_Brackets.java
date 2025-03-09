import java.util.*;

class Stack_02_Brackets {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Stack<String> vt = new Stack<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int n = sc.nextInt();
        sc.nextLine(); // the int input always leaves a new line after the input is taken which directly goes into the nexLine()

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the stack: ");
            String inp = sc.nextLine();

            if (inp.equals("{") || inp.equals("(") || inp.equals("[")) {
                st.push(inp);
            } 
            else if (inp.equals("}") || inp.equals(")") || inp.equals("]")) {
                vt.push(inp);

                if (!st.isEmpty() && Matching(st.peek() , vt.peek())) { // Fixed string comparison
                    vt.pop();
                    st.pop();
                }
            } 
            else {
                System.out.println("Not a valid input!");
                break; // Stop further input if invalid
            }
        }

        if (vt.isEmpty()) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }

    public static boolean Matching(String open, String close) {
        if ((open.equals("(") && close.equals(")")) ||(open.equals("{") && close.equals("}")) || (open.equals("[") && close.equals("]")))
            return true;
        else
            return false;
    }
}