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
        FunInterface functionalInterface = new FunInterface();
        functionalInterface.lambdaExpression(lists);
        functionalInterface.methodReference(lists);
        functionalInterface.constructorReference("Ram kumar");
        functionalInterface.defaultReference("Ram");
    }
}
