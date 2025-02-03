/*
Create a class hierarchy for a Library System. 
Implement a base class Item with properties like title, author, and publicationYear. 
Derive two classes, Book and Magazine, from the Item class.
Each derived class should have additional properties such as genre for books and issueNumber for magazines. 
Write methods in each class to display their details. 
Demonstrate the use of inheritance by creating objects of both classes and calling their respective methods
*/

class Item{
String title;
String author;
double publicationyear;

Item(String title , String author , double publicationyear){
this.title = title;
this.author = author;
this.publicationyear = publicationyear;
}

public void Displaydetails(){
System.out.println("Title : " + title);
System.out.println("Author : " + author);
System.out.println("Publication Year : " + publicationyear);
}
}

class Book extends Item{
String genre;
Book(String title , String author , double publicationyear , String genre){
super(title , author , publicationyear); //calling base class constructor
this.genre = genre;
}
public void Displaydetails(){
super.Displaydetails(); // call the base class method
System.out.println("Genre : " + genre);
}
}

class Magazine extends Item{
int Issuenumber;
Magazine(String title , String author , double publicationyear , int Issuenumber){
super(title,author,publicationyear);
this.Issuenumber = Issuenumber;
}
public void Displaydetails(){
super.Displaydetails();
System.out.println("Issue Number : " + Issuenumber);
}
}

public class LibrarySystem{
public static void main(String[] args){
Book b = new Book("400 days " , "Chetan Bhagat" , 2021 , "Suspense");
Magazine m = new Magazine("Swathi" , "Swathi publications" , 1984 , 001);

b.Displaydetails();
System.out.println(" ");
m.Displaydetails();
}
}
