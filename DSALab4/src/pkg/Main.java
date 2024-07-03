package pkg;
import java.util.*;
public class Main {

    static stack operators = new stack();   //stack for holding operators

    public static void main(String[] args) {
        String infix ="(23/(5+1+7))*(12/4)*9";

        String postfix = infixToPostFix(infix);

        System.out.println(postfix);
        
        EvaluatePostFix(postfix);
    }

    public static String infixToPostFix(String infix){

        char symbol; // variable for storing next character of infix notation in loop
        String postfix = ""; // variable for final postfix string notation

        for (int i = 0; i <infix.length(); i++) {

            symbol = infix.charAt(i);

            if (Character.isDigit(symbol)) {
                postfix += symbol;
            }
            //if it is an opening bracket then push it on the stack
            else if (symbol=='(') {
                operators.push(symbol);
            }
            //if character is Closing bracket
            else if (symbol==')' && !operators.isEmpty()) {
                //then pop the operators stack and append to postfix till we reach a opening braces
                while (operators.peek()!='(') {
                    postfix += operators.pop();
                }
                operators.pop(); //remove the opening brace too
            }
            // if it is a operator
            else {

                while (!operators.isEmpty() //stack is not empty AND
                        && !(operators.peek()=='(') // top of operator stack is not '('
                        && precedence(symbol) <= precedence(operators.peek())) //precedence of operator is less than one on top of stack
                {
                    postfix += operators.pop();   // pop the top operator to Postfix notation
                }
                operators.push(symbol);  //then push the operator with lower precedence on stack
            }
            // if its the Last character of input string 
            if(i==infix.length()-1){
                while (!operators.isEmpty()) { //pop the stack until the List is empty
              postfix+= operators.pop();
            }
            }
        }
        return postfix;
    }
    
    public static void EvaluatePostFix(String expression) {
        //using stack class of Util package
        Stack<Integer> postFix = new Stack<>();  //stack to store operands
        
      for(int i=0;i<expression.length();i++)
      {
          //if the character is an operator
        if(isOperator(expression.charAt(i)))
        {
        // pop top 2 operands from the top of stack 
        int op2 = postFix.pop();
        int op1 = postFix.pop();
              
        // evaluate in reverse order i.e. op2 operator op1.
        switch(expression.charAt(i))
        {
            case '+': postFix.push(op1 + op2);
                      break;
                      
            case '-': postFix.push(op1 - op2);
                      break;
                      
            case '*': postFix.push(op1 * op2);
                      break;
                
            case '/': postFix.push(op1 / op2);
                      break;
                    
        }
        
        }
        // if character is operand
        else
        {
        // convert it to integer and push to postFix Stack
        int operand = expression.charAt(i) - '0';
        postFix.push(operand);
        }
      }
      
      // Stack at End will contain result.
      System.out.println(postFix.pop());
    }
    static boolean isOperator(char ch)
  {
      if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
      return true;
      
      return false;
  }

    //method to return precedence of operators
    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}