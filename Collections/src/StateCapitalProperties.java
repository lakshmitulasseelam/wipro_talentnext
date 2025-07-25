import java.util.*;

public class StateCapitalProperties {
    public static void main(String[] args) {
        Properties stateCapital = new Properties();

        stateCapital.setProperty("Andhra Pradesh", "Amaravati");
        stateCapital.setProperty("Karnataka", "Bengaluru");
        stateCapital.setProperty("Maharashtra", "Mumbai");

        System.out.println("State - Capital List:");
        Set<Map.Entry<Object, Object>> entries = stateCapital.entrySet();
        Iterator<Map.Entry<Object, Object>> it = entries.iterator();

        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
