public class Vehicle {
  public String brand = "";
  public double maxSpeed, mileage, enginePower = 0.0;

  Vehicle(String b, double maxS, double miles, double power) {
    brand = b;
    maxSpeed = maxS;
    mileage = miles;
    enginePower = power;
  }
  
  public double calculateFuelConsumption() {
    return mileage / maxSpeed * enginePower * 3 / 45000000 * 1.34;
  }
  
  public boolean equals(Object another) {
    if (this == another) {
      return true;
    }
    else if (!(this instanceof Vehicle)) {
      return false;
    }
    else if (this.brand == ((Vehicle) another).brand & this.maxSpeed == ((Vehicle) another).maxSpeed & this.mileage == ((Vehicle) another).mileage & this.enginePower == ((Vehicle) another).enginePower) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public String toString() {
    return "Транспорт бренда " + brand + ", с максимальной скоростью " + maxSpeed + "км/ч, пробегом в " + mileage + "км и мощностью двигателя в  " + (enginePower / 1000) + "кВт.";
  }
}
