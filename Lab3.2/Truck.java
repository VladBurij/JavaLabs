public class Truck extends Vehicle {
  public double cargoCapacity = 0.0;
  public char drivingCategory = 'C';
  
  Truck(String b, double maxS, double miles, double power, double weight, char category) {
    super(b, maxS, miles, power);
    this.cargoCapacity = weight;
    this.drivingCategory = category;
  }
  
  public double calculateFuelConsumption() {
    double categoryIndex = 1.05;
    if (drivingCategory == 'C') {
      categoryIndex = 0.95;
    }
    else if (drivingCategory == 'D') {
      categoryIndex = 1.0;
    }
    return (mileage / maxSpeed * enginePower + cargoCapacity * mileage) * 3 / 45000000 * 1.34 * categoryIndex;
  }
  
  public boolean equals(Object another) {
    if (this == another) {
      return true;
    }
    else if (!(this instanceof Truck)) {
      return false;
    }
    else if (this.brand == ((Truck) another).brand & this.maxSpeed == ((Truck) another).maxSpeed & this.mileage == ((Truck) another).mileage & this.enginePower == ((Truck) another).enginePower & this.cargoCapacity == ((Truck) another).cargoCapacity & this.drivingCategory == ((Truck) another).drivingCategory) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public String toString() {
    return "Грузовой автомобиль бренда " + brand + ", максимальной скоростью " + maxSpeed + "км/ч, пробегом в " + mileage + "км и мощностью двигателя в  " + (enginePower / 1000) + "кВт. Он имеет грузоподъёмность в " + cargoCapacity + "кг";
  }
}
