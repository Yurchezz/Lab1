package ua.lviv.iot.lab1;

public class Lab1{

    public static void main(String[] args){
        Car carEmptyConstructor = new Car();
        Car carAllParametersConstructor = new Car(100, "Lanos", 1000, 5, 220);
        Car carNotAllParametersConstructor = new Car(1000, "Tavriya", 10000, 10, 2000);


        Car.staticField = 10;

        System.out.println(carEmptyConstructor.toString());
        System.out.println(carNotAllParametersConstructor.toString());
        System.out.println(carAllParametersConstructor.toString());


        carEmptyConstructor.printStaticField1();
        carEmptyConstructor.printField();


        carNotAllParametersConstructor.printStaticField1();
        carNotAllParametersConstructor.printField();


        carAllParametersConstructor.printStaticField1();
        carAllParametersConstructor.printField();


    }
}
