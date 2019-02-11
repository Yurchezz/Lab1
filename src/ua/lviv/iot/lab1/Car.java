package ua.lviv.iot.lab1;

class Car{
    int enginePower;
    String mark;
    int maxSpeed;
    //My fields
    private int engineVolume;
    private int kilometrage;

    static int staticField;

    protected int protectedField1;
    protected int protectedField2;


    public void printStaticField1(){
        System.out.println("Static Field: " + Car.staticField);
    }

    public void printField(){
        System.out.println("Static Field: " + Car.staticField);
    }

    public Car(){

        this(0, "undefined", 0, 0, 0, 0, 0);
    }

    public Car(int enginePower, String mark, int maxSpeed, int engineVolume, int kilometrage){
        this(enginePower, mark, maxSpeed, engineVolume, kilometrage, 0, 0);
    }

    public Car(int enginePower, String mark, int maxSpeed, int engineVolume, int kilometrage, int protectedField1, int protectedField2){
        this.enginePower = enginePower;
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.kilometrage = kilometrage;
        this.protectedField1 = protectedField1;
        this.protectedField2 = protectedField2;
    }

    @Override
    public String toString(){
        return "\nCar{" +
                "enginePower=" + enginePower +
                ", mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineVolume=" + engineVolume +
                ", kilometrage=" + kilometrage +
                ", protectedField1=" + protectedField1 +
                ", protectedField2=" + protectedField2 +
                "}\n";
    }

    public static int getStaticField() {
        return staticField;
    }




    public static void setStaticField(int staticField) {
        Car.staticField = staticField;
    }

    public int getProtectedField1() {
        return protectedField1;
    }

    public void setProtectedField1(int protectedField1) {
        this.protectedField1 = protectedField1;
    }

    public int getProtectedField2() {
        return protectedField2;
    }

    public void setProtectedField2(int protectedField2) {
        this.protectedField2 = protectedField2;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public void resetValues (int enginePower, String mark, int maxSpeed, int engineVolume, int kilometrage, int protectedField1, int protectedField2){
        this.enginePower = enginePower;
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.kilometrage = kilometrage;
        this.protectedField1 = protectedField1;
        this.protectedField2 = protectedField2;
    }




}
