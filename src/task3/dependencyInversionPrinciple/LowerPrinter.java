package task3.dependencyInversionPrinciple;

public class LowerPrinter implements IPrinter{
    @Override
    public void print(String text) {
        System.out.println(text.toLowerCase());
    }


}
