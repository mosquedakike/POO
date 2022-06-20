from car import Car

if __name__ == "__main__":
    print("Hola mundo desde python")
    car = Car()
    car.id = 123
    car.license = "Dev2114"
    car.driver = "Luis Enrique Hernandez"
    print(vars(car))

    car2 = Car()
    car2.id = 12345
    car2.license = "Other2114"
    car2.driver = "Jose Miguel"
    car2.passenger = 7
    print(vars(car2))