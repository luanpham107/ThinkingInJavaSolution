package chap11HoldingYourObject.ex15;

import java.util.ArrayList;
import java.util.Stack;

public class Ex15Class
{
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();
        myStack.push("U");
        myStack.push("n");
        myStack.push("c");
        myStack.pop();
        myStack.pop();
        myStack.push("e");
        myStack.push("r");
        myStack.push("t");
        myStack.pop();
        myStack.pop();
        myStack.push("a");
        myStack.pop();
        myStack.push("i");
        myStack.pop();
        myStack.push("n");
        myStack.push("t");
        myStack.push("y");
        myStack.pop();
        myStack.pop();
        myStack.push(" ");
        myStack.pop();
        myStack.push("r");
        myStack.push("u");
        myStack.pop();
        myStack.pop();
        myStack.push("l");
        myStack.push("e");
        myStack.push("s");

        System.out.print(myStack);

        // MEthod 2:
        myStack.clear();
        String strReq = "+U+n+c--+e+r+t--+a-+i-+n+t+y--+ -+r+u--+l+e+s—";
        char[] arrChar = strReq.toCharArray();
        for(int i = 0; i < arrChar.length; i++){
            if(arrChar[i] == '+')
                myStack.push(String.valueOf(arrChar[i+1]));
            else if(arrChar[i] == '-')
                myStack.pop();
            else{
                // Dont handle anything
            }
        }
        System.out.println("Method 2: ");
        System.out.print(myStack);

    }
}
