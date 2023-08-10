package task3.interfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
        Worker worker = new RobotWorker();
        Eater eater = new HumanWorker();
        worker.work();
        eater.eat();
    }
}

