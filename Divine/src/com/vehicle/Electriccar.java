package com.vehicle;
import com.vehicle.car;
public class Electriccar extends car {
    private double batteryLevel;

    public void setBatteryLevel(double battery){
        this.batteryLevel= battery;
    }
   public double getBatteryLevel(){
       return this.batteryLevel;
   }
   public void drive(int distance){
      super.drive (distance);
      double distanceInKm= distance / 1000.0;
      this.batteryLevel= (distanceInKm /10);
      this.batteryLevel= Math.max(0, this.batteryLevel);
    }
}
