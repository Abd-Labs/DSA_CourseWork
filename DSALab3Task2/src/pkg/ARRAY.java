package pkg;
public class ARRAY {
int []arr;
int N;
int n=0;
public ARRAY() {
int N = 10;
arr = new int[N];

n=0;
}

// WE WILL NEED ONLY FOLLOWING METHODS OF ARRAY CLASS TO IMPLEMENT STACK
void print (){
for (int i =0; i<n;i++){
System.out.print(arr[i]);
}
}

void addAtEnd(int num){
arr[n]= num; //adding the value user passed to the end of array
n++;
}
void removeFromEnd(){
n--;
}
}