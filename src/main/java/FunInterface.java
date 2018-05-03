import java.util.List;

public class FunInterface {

    public void lambdaExpression(List<Mynumber> lists) {
        Calculator cal = (a, b) -> a + b;
        for (Mynumber mynumber : lists) {
            System.out.println("Sum of a and b :" + mynumber.process(cal));
        }
        lists.forEach(list -> {
            System.out.println("Multiple of a and b :" + list.process((a, b) -> a * b));
        });
        Calculator calc = (a, b) -> a - b;
        System.out.println("Subtract of a and b :" + calc.calculate(20, 5));
    }

    public void methodReference(List<Mynumber> lists) {
        Calculator calculator = Utility::add;
        System.out.println("Sum of a and b :" + calculator.calculate(20, 30));
        for (Mynumber mynumber : lists) {
            Calculator c = Utility::multiple;
            System.out.println("Multiple of a and b :" + mynumber.process(c));
        }
        for (Mynumber mynumber : lists) {
            System.out.println("Sum of a and b :" + mynumber.process(Utility::add));
        }
    }

    public void constructorReference(String fname) {
        TaskHandler taskHandler = Utility::new;
        taskHandler.get(fname);

    }

    public void defaultReference(String fname){

        Wordship worship = (name) -> System.out.println(name);
        worship.again(worship).again(worship).chant(fname);
    }
}
