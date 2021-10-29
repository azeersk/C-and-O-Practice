import java.util.Scanner;

public class Vehicle {
    public void Car(String a,String b){
        System.out.println("Color: "+a);
        System.out.println("Car Name: "+b);
    }
    public void Bike(String a, String b){
        System.out.println("Color: "+a);
        System.out.println("Car Name: "+b);
    }
    public void Vehicle(){
        System.out.println("Welcome to Vehicle Store!");
    }
    public void Vehicle(String a){
        System.out.println("Thank you for choose "+a+"!");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Vehicle vhc = new Vehicle();
        vhc.Vehicle();
        System.out.println("Please Enter Bike color and name!");
        String Bc = input.nextLine();
        String Bn = input.nextLine();
        System.out.println("Please Enter Car color and name!");
        String Cc = input.nextLine();
        String Cn = input.nextLine();
        System.out.println("**************************** "+Bn+" ****************************");
        vhc.Bike(Bc,Bn);
        System.out.println("**************************** "+Cn+" ****************************");
        vhc.Car(Cc,Cn);
        System.out.println("Which one you likes Please Enter:");
        String B = input.nextLine();
        vhc.Vehicle(B);
    }
}
