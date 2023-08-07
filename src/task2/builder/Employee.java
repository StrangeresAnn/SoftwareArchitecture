package task2.builder;

public class Employee {

    private String name;
    private String company;
    private boolean hasCar;
    private boolean hasBike;

    private Employee(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        hasCar = employeeBuilder.hasCar;
        hasBike = employeeBuilder.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
        private boolean hasCar;
        private boolean hasBike;

        //конструктор обязательных полей
        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        //методы установки для необязательных полей
        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }


        public Employee build() {
            return new Employee(this);
        }
    }
}

class TestBuilder {
    public static void main(String[] args) {
        //Создание объекта Employee с помощью метода build(), предоставленного в классе EmployeeBuilder.
        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();
    }
}
