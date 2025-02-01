public class Nullexception1{
public static void main(String[] args){
try{
String game = null;
System.out.println(game.length());
}
catch(NullPointerException e){
System.out.println(" Found an exception : " +e.getMessage());
}
finally{
System.out.println("Finally block excecuted");
}
}
}