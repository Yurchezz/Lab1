package ua.lviv.iot.lab1;

public class Lab1{

    public static void main(String[] args){
        Car carEmptyConstructor = new Car();
        Car carNotAllParametersConstructor = new Car(1000, "Tavriya", 10000, 10, 2000);
        Car carAllParametersConstructor = new Car(100, "Lanos", 1000, 5, 220,1000,1);

        System.out.println("Without parameters:"+carEmptyConstructor.toString());
        System.out.println("Not all parameters:"+carNotAllParametersConstructor.toString());
        System.out.println("All parameters:"+carAllParametersConstructor.toString());

        System.out.println("Static Field of carEmptyConstructor");
        carEmptyConstructor.printStaticField1();
        carEmptyConstructor.printField();

        System.out.println("Static Field of carNotAllParametersConstructor");
        carNotAllParametersConstructor.printStaticField1();
        carNotAllParametersConstructor.printField();

        System.out.println("Static Field of carAllParametersConstructor");
        carAllParametersConstructor.printStaticField1();
        carAllParametersConstructor.printField();

    }
}
