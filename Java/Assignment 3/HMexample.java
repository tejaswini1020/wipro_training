/*
Write a Java program to implement a HashMap that stores student roll numbers (Integer) as keys and their names (String) as values. 
Perform the following operations:
Insert five student records.
Retrieve and display the name of a student using a specific roll number.
Remove a student entry using a roll number.
Display all student records.
*/

import java.util.HashMap;
import java.util.Map;

public class HMexample{
public static void main(String []args){
HashMap<Integer , String> student = new HashMap<>();

//insert five student records
student.put(001 , "Teju");
student.put(002 , "Aswini");
student.put(003 , "Manu");
student.put(004 , "Pavi");
student.put(005 , "Yamu");

//Retrieve and display student using rollno
System.out.println("The name of the student with specified rollno : " +student.get(001));

//Remove a student entry using a roll number
student.remove(005);
System.out.println("The rollno mentioned was removed");

//Display all records
for(Map.Entry<Integer , String> s :student.entrySet()){
System.out.println(s.getKey() + " -> " + s.getValue());
}
}
}