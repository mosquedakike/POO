from pyexpat import model
from turtle import st
from car import Car

class UberPool(Car):
    brand = str
    model = str

    def __init__(self,license, driver, brand, model):
        super.__init_(license,driver)
        self.brand = brand
        self.model = model