import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;

public class TestVehicles {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println(hero.getModelName() + ", Speed: " + hero.getSpeed());
        hero.radio();

        Honda honda = new Honda();
        System.out.println(honda.getModelName() + ", Speed: " + honda.getSpeed());  // ✅ fixed
        honda.cdplayer();

        Logan logan = new Logan();
        System.out.println(logan.getModelName() + ", Speed: " + logan.speed());
        System.out.println("GPS: " + (logan.gps() == 1 ? "ON" : "OFF"));

        Ford ford = new Ford();
        System.out.println(ford.getModelName() + ", Speed: " + ford.speed());
        System.out.println("Temperature set to: " + ford.tempControl() + "°C");
    }
}

