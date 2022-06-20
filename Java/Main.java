class Main{
    public static void main(String[] args){
        //System.out.println("hello world");
        // Car car = new Car();
        // car.id = 1;
        // car.driver = "Luis Enrique Hernandez";
        // car.license = "DEV2115";
        // car.passenger = 5;
        // car.printDataCar();
        // //System.out.println("Car license: " + car.license);

        // Car car2 = new Car();
        // car2.id = 2;
        // car2.driver = "Jose Miguel Hernandez";
        // car2.license = "CRACK2115";
        // car2.passenger = 10;

       Car car = new Car("Dev2115", new Account("Luis Enrique", "LUIS123"));
       car.printDataCar();

    }
}