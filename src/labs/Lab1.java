package labs;

public class Lab1 {

    public static void main(String[] args) {
        Car carNoConstructor = new Car();
        Car carFullConstructor = new Car(100,"Lanos",1000,5,220);
        Car carNotFullConstructor = new Car(1000,"Tavriya",10000,10,2000);

        Car.staticField = 10;

        System.out.println(carNoConstructor.toString());
        System.out.println(carNotFullConstructor.toString());
        System.out.println( carFullConstructor.toString());


        carNoConstructor.printStaticField1();
        carNoConstructor.printField();


        carNotFullConstructor.printStaticField1();
        carNotFullConstructor.printField();



        carFullConstructor.printStaticField1();
        carFullConstructor.printField();


    }
}
