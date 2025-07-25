import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        
        numbers.add(10);          
        numbers.add(15.75f);      
        numbers.add(99.99);       

        System.out.println("Number elements:");
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}
