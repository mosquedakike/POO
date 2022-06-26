var car = new Car("DEV2115", new Account("Luis Enrique", "mydocument"))
car.passenger = 4
car.printDataCar()
console.log(car.passenger)

var uberX = new UberX("DEV2116", new Account("Jose Miguel", "MyCard"), "Ford", "Focus RS")
uberX.printDataCar()

var user = new User("Miguelito", "JMHM29042010", "miguelito", "123445")
user.printDataAccount()