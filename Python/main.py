from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo desde python")
    # car = Car()
    # car.id = 123
    # car.license = "Dev2114"
    # car.driver = "Luis Enrique Hernandez"
    # print(vars(car))

    # car2 = Car()
    # car2.id = 12345
    # car2.license = "Other2114"
    # car2.driver = "Jose Miguel"
    # car2.passenger = 7
    # print(vars(car2))

    car = Car("Dev2115", Account("Luis Hernandez", "HEML940715"))
    print(vars(car))
    print(vars(car.driver))