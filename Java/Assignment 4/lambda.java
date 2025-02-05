/*
Write a Java program that demonstrates the use of lambda expressions to sort a list of strings in reverse alphabetical order. 
Then, implement a functional interface StringProcessor with a method process(String str) 
    that takes a string and returns its uppercase version. 
Use this functional interface in conjunction with a lambda expression to process a list of strings and print their uppercase forms.
Hint: Use List.sort(), lambda expressions, and String::toUpperCase
*/

import java.util.*;

interface StringProcessor{
String process(String str);
}

public class lambda{
public static void main (String[] args){
List<String> List = Arrays.asList("Teju" , "Manu" , "Pavi" ,"Yamu");

//reverse order
List.sort((s1,s2) ->s2.compareTo(s1));
System.out.println("Reversed order : " + List);

//uppercase version
StringProcessor touppercase = String::toUpperCase;
for(String name : List){
System.out.println(touppercase.process(name));
}

//for(String name : List){
//System.out.println(name.toUpperCase());
//}
}
}
