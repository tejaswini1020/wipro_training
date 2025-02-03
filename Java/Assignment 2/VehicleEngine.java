/*
Implement a class hierarchy for Vehicles with a base class Vehicle that contains a method startEngine().
 Derive two classes: Car and Motorcycle,
 both overriding the startEngine() method to print different messages indicating how their engines are started. 
Create a method vehicleTestDrive(Vehicle vehicle) that accepts any object of type Vehicle and calls its startEngine() method. 
Demonstrate " POLYMORPHISM " by passing different vehicle objects to this method.
*/

//BASE CLASS

class Vehicles{
void Startengine(){
System.out.println("Indicates how engines are started");
}
}
//DERIVED CLASS

class Car extends Vehicles{
void Startengine(){
System.out.println("Car engine starts by pushing a start button");
}
}

class MotorCycle extends Vehicles{
void Startengine(){
System.out.println("Motorcycle engine starts with a kick");
}
}

public class VehicleEngine{
static void VehicleTestDrive(Vehicles vehicles){
vehicles.Startengine();
}
public static void main(String []args){
Vehicles cars = new Car();
Vehicles bike = new MotorCycle();
VehicleTestDrive(cars);
VehicleTestDrive(bike);
}
}



