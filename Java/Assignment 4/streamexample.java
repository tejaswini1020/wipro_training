/*
Given a list of employees, each with a name, age, and salary, write a Java program using the Streams API to:
Filter employees who are older than 30.
Find the average salary of employees who meet the age condition.
Collect the names of these employees into a List.
Print the list of employee names and the average salary.
Hint: Use filter(), map(), collect(), and average() methods from Streams
*/

import java.util.*;
import java.util.stream.Collectors;

class employee{
String name;
int age;
double salary;
public employee(String name , int age , double salary){
this.name = name;
this.age = age;
this.salary = salary;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
public double getSalary() {
return salary;
}
}

public class streamexample{
public static void main(String []args){
List<employee> employees = Arrays.asList(new employee("TEJU" , 22 , 40000),
					new employee("PAVI" , 32 , 50000),
					new employee("MANU" , 34 , 55000),
					new employee("YAMU" , 23 , 45000));
List<String> employeename = employees.stream().filter(emp -> emp.getAge() > 30) //CHECK CONDITION OF AGE
						.map(employee::getName)  //extract THE NAMES
						.collect(Collectors.toList()); //COLLECT THE NAMES IN A LIST

double avgsalary = employees.stream().filter(emp -> emp.getAge()>30)
					.mapToDouble(employee::getSalary) //EXTRACT SALARIES
					.average() //COMPUTE AVERAGE
					.orElse(0.0); // DEFAULT 0 IF IT DOESN'T SATISFY CONDITION


System.out.println("The employee names who are older than 30 are : " + employeename);
System.out.println("The average salary of an employee : " + avgsalary);
}
}
