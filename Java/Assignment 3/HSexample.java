/*
Write a Java program to create a HashSet of strings. Perform the following operations:
Add five city names to the set, ensuring at least one duplicate entry.
Display the elements to show that duplicates are not allowed.
Check if a particular city exists in the set.
Remove a city and display the updated set.
*/

import java.util.HashSet;

public class HSexample{
public static void main(String []args){
HashSet<String> city = new HashSet<>();

//add five city to set
city.add("Nellore");
city.add("Tirupati");
city.add("Ongole");
city.add("Bhimavaram");
city.add("Bhimavaram");

//display elements
for(String cities : city){
System.out.println(cities);
}

//checking a particular city exists in the set
if(city.contains("Nellore")){
System.out.println("The city you mentioned is present");
}else{
System.out.println("The city you mentioned is not present");
}

//Remove and display the city
city.remove("Ongole");
System.out.println("Updated cities after Removal");
for(String cities : city){
System.out.println(cities);
}
}
}