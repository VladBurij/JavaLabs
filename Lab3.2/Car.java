public class Car extends Vehicle {
  public int numberOfDoors = 1;
  public double trunkVolume = 0.0;
  
  Car(String b, double maxS, double miles, double power, int door, double vol) {
    super(b, maxS, miles, power);
    this.numberOfDoors = door;
    this.trunkVolume = vol;
  }
  
  public double calculateFuelConsumption() {
    return (mileage / maxSpeed * enginePower + (numberOfDoors * 80.0 + trunkVolume) * mileage) * 3 / 45000000 * 1.34;
  }
  
  public boolean equals(Object another) {
    if (this == another) {
      return true;
    }
    else if (!(this instanceof Car)) {
      return false;
    }
    else if (this.brand == ((Car) another).brand & this.maxSpeed == ((Car) another).maxSpeed & this.mileage == ((Car) another).mileage & this.enginePower == ((Car) another).enginePower & this.numberOfDoors == ((Car) another).numberOfDoors & this.trunkVolume == ((Car) another).trunkVolume) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public String toString() {
    return "Легковой автомобиль бренда " + brand + ", максимальной скоростью " + maxSpeed + "км/ч, пробегом в " + mileage + "км и мощностью двигателя в  " + (enginePower / 1000) + "кВт. В нём могут ездить " + numberOfDoors + "человека, а также он имеет багажник на " + trunkVolume + "л.";
  }
}
