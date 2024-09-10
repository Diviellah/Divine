package ccom.vehicle.test;
 import com.vehicle.car;
 import com.vehicle.Electriccar;
public class VehicleTest {
    public static void main(String[] args) {
        car carone = new car();
 carone.setSpeed(120);/* i used the implicit method to convert the String speed to a double speed */
 double speed= carone.getSpeedMph();
 String speed_String =Double.toString(speed);
 carone.setFuelLevel(78.0f);
 carone.drive(33270);
   System.out.println("speed in mph is "+" "+ carone.getSpeedMph());
   System.out.println("distance traveled is "+" "+ carone.getDistanceKm());
   System.out.println("remaining fuel percentage is"+" "+ carone.calculateRemainingFuel(109));

   Electriccar econe=new Electriccar();
   econe.setSpeed(200);
   econe.setBatteryLevel(70);
   System.out.println("remaining battery level is "+" "+econe.getBatteryLevel());
    }
}