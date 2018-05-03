import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String arg[]){
        List<Mynumber> lists = new ArrayList<>();
        lists.add(new Mynumber(1,2));
        lists.add(new Mynumber(3,4));
        lists.add(new Mynumber(5,6));
        lists.add(new Mynumber(7,8));
        lists.add(new Mynumber(9,10));
        lists.add(new Mynumber(11,12));
        Calculator cal = (a, b) -> a + b;
        for (Mynumber mynumber: lists){
            System.out.println("Sum of a and b :" + mynumber.process(cal));
        }
        lists.forEach(list->{
            System.out.println("Multiple of a and b :" + list.process((a, b)->a*b));
        });

        Calculator calc = (a, b) -> a - b;
        System.out.println("Subtract of a and b :" + calc.calculate(20,5));
    }
}
