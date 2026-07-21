package Lexture20;

//First Interface
interface Printer{
    void print(String document);
    void switchOn();
}

//Second Interface
interface Scanner{
    void scan(String document);
    void switchOn();
}

//A class implementing both interfaces
class MultiFunctionMachine implements Printer, Scanner{
    @Override
    public void print(String document) {
        System.out.println("Printing: "+document);
    }
    @Override
    public void scan(String document) {
        System.out.println("Scanning: "+document);
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on");
    }
}

//Main class
public class MultipleInheritanceInterfaceDemo {
    public static void main(String[] args) {
        MultiFunctionMachine machine = new MultiFunctionMachine();
        machine.switchOn();
        machine.print("Report.pdf");
        machine.scan("ID Card");
    }
}
