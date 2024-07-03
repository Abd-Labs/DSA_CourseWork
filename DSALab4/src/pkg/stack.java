package pkg;

import java.io.*;

class stack  //stack class for characters
{  
    
char a[];  //character array 
int top=-1;  

//constructor
public stack(){
    a=new char[100]; //maximum size of stack will be 100  
    top=-1;  
}

// Push method
void push(char c)  
{  
    if (top<99) {
        a[++top]= c; 
    }
    else{
        System.out.println("Stack overflow");
    }
} 

char pop()  
{  
return a[top--]; //return and remove the top element of the stack 
}  
boolean isEmpty()  
{  
return (top==-1)?true:false;  
} 
//this method return the value of element on top of stack without removing it
char peek()  
{  
 return a[top];  
}  
}     