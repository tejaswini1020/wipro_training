/*
Write a Java program to create an ArrayList of integers. Perform the following operations:
       Add five integer elements to the list.
       Remove the third element.
       Update the second element with a new value.
       Display all the elements using a loop
*/

import java.util.ArrayList;
public class ALexample{
public static void main(String[] args){
ArrayList<Integer> arr = new ArrayList<>();

//Add five integers to list
arr.add(1);
arr.add(2);
arr.add(3);
arr.add(4);
arr.add(5);

//Remove third element
arr.remove(2);

//Update second element
arr.set(1,20);

//Display all elements
for(int num : arr){
System.out.println(num);
}
}
}