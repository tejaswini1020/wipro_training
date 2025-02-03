/*
write a program that shows the implementation of 
           null pointer exception 
           array index out of bound exception using try catch finally blocks
*/

public class ExceptionHandling{
public static void handlenullpointer(){
try{
Integer apple = null;
System.out.println(apple.intValue());  //null pointer exception occur
}
catch(NullPointerException a){
System.out.println("Found an exception : " +a.getMessage());
}
// finally block gets executed even though exception is raised
finally{
System.out.println("finally block executed after null pointer exception");
}
}
public static void Indexoutofbound(){
try{
int arr[] = {1,2,3,4,5};
System.out.println(arr[6]);
}
catch(ArrayIndexOutOfBoundsException a){
System.out.println("Found an Exception : "+a.getMessage());
}
}
public static void main(String[] args){
handlenullpointer();
Indexoutofbound();
}
}