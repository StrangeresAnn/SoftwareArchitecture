package task3.dependencyInversionPrinciple;

public class Text {
    String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void PrintText(IPrinter printer) {
        printer.print(text);
    }

    public void PrintTextByPrinter(Printer printer) {
        printer.print(text);
    }

    @Override
    public String toString() {
        return text;
    }

}




