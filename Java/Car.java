public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        passenger = 10;
        // System.out.println("Passenger " + passenger );
    }

    // void printDataCar(){
    //     System.out.println("Id: " + id);
    //     System.out.println("Driver: " + driver);
    //     System.out.println("License: " + license);
    //     System.out.println("Passenger: " + passenger);
    // }

    void printDataCar(){
        if(passenger == 4){
        System.out.println("License: " + license);
        System.out.println("Driver: " + driver.name);
        System.out.println("Document: " + driver.document);
        System.out.println("Passenger: " + passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}
