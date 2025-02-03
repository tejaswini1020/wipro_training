/*
Design an Employee Management System where you create an abstract class Employee with abstract methods
  like calculateSalary() and displayDetails(). 
Create two derived classes, FullTimeEmployee and PartTimeEmployee, and implement the abstract methods.
    For FullTimeEmployee, calculate salary as a fixed monthly rate, and 
    for PartTimeEmployee, calculate salary based on hourly rates. 
Demonstrate polymorphism by creating an array of Employee objects and calculating/displaying salaries using overridden methods.
*/


abstract class Employee{
String Name;
int empid;

//constructor
Employee(String Name , int empid){
this.Name = Name;
this.empid = empid;
}
public abstract double calculateSalary();
public abstract void displayDetails();
}

//DERIVED CLASS : fulltime
class FullTimeEmployee extends Employee{
double monthlysalary;
FullTimeEmployee(String Name , int empid , double monthlysalary){
super(Name , empid);
this.monthlysalary = monthlysalary;
}

public double calculateSalary(){
return monthlysalary; //fixed monthly salary
}

public void displayDetails(){
System.out.println("Fulltime");
System.out.println("Name : " + Name);
System.out.println("Empid : " + empid);
System.out.println("Monthly Salary : " + calculateSalary());
}
}

//DERIVED CLASS : part time
class PartTimeEmployee extends Employee{
double hourlyrate;
double workhours;
PartTimeEmployee(String Name , int empid , double hourlyrate ,double workhours){
super(Name , empid);
this.hourlyrate = hourlyrate;
this.workhours = workhours;
}

public double calculateSalary(){
return hourlyrate*workhours;
}

public void displayDetails(){
System.out.println("Parttime");
System.out.println("Name : " + Name);
System.out.println("Empid : " + empid);
System.out.println("Hourly rate : " + hourlyrate);
System.out.println("Work hour : " + workhours);
System.out.println("Salary : " + calculateSalary());
}
}

public class EmployeeManagement{
public static void main(String[] args){
Employee[] employees = new Employee[2];
employees[0] = new FullTimeEmployee("Teju", 001, 40000.00);
employees[1] = new PartTimeEmployee("Sahith", 002, 20.00, 200);

for(Employee e :employees){
e.displayDetails();
}
}
}