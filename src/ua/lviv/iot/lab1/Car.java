package ua.lviv.iot.lab1;

class Car{
    private int enginePower;
    private String mark;
    private int maxSpeed;
    private int engineVolume;
    private int kilometrage;

    static int countOfCars = 0;

    protected int leasingIndex;
    protected int price;

    public Car(){
        this(0, "undefined", 0, 0, 0, 0, 0);
    }

    public Car(int enginePower, String mark, int maxSpeed, int engineVolume, int kilometrage){
        this(enginePower, mark, maxSpeed, engineVolume, kilometrage, 0, 0);
    }

    public Car(int enginePower, String mark, int maxSpeed, int engineVolume, int kilometrage, int leasingIndex, int price){
        this.enginePower = enginePower;
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.kilometrage = kilometrage;
        this.leasingIndex = leasingIndex;
        this.price = price;
    }

    public void printStaticField1(){
        System.out.println("Count of Cars (PrintStaticField): " + countOfCars);
    }

    public void printField(){

        System.out.println("Count of Cars (PrintField): " + countOfCars);
    }

    public int getEnginePower(){
        return enginePower;
    }

    public void setEnginePower(int enginePower){
        this.enginePower = enginePower;
    }

    public String getMark(){
        return mark;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getEngineVolume(){
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume){
        this.engineVolume = engineVolume;
    }

    public int getKilometrage(){
        return kilometrage;
    }

    public void setKilometrage(int kilometrage){
        this.kilometrage = kilometrage;
    }

    public int getLeasingIndex(){
        return leasingIndex;
    }

    public void setLeasingIndex(int leasingIndex){
        this.leasingIndex = leasingIndex;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void ReserValues(int enginePower, String mark, int maxSpeed, int engineVolume, int kilometrage, int leasingIndex, int price){
        this.enginePower = enginePower;
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.kilometrage = kilometrage;
        this.leasingIndex = leasingIndex;
        this.price = price;
    }


}






