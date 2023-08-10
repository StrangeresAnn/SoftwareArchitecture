package task3.dependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        Printer myPrinter = new Printer();
        IPrinter lowerPrinter = new LowerPrinter();
        myText.PrintText(myPrinter);
        myText.PrintText(lowerPrinter);
    }
}
