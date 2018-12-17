import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Path path1 = Paths.get("src/earnings.txt");
        try {
            for (String line : Files.readAllLines(path1)) {
                if (!line.contains("Kowalski") && !line.contains("Kowalska") && line.contains("zł")) {
                    employees.add(new Employee(line.substring(0, line.indexOf(",")),
                            line.substring(line.indexOf(" ") + 1, line.indexOf(",", line.indexOf(",") + 1)),
                            Integer.parseInt(line.substring(line.indexOf(" ", line.indexOf(" ") + 1) + 1, line.indexOf(".")))));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(employees);
        for (int i = 0; i < 3; i++) {
            Employee employee = employees.get(i);
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }

    public static class Employee implements Comparable {
        private String lastName;
        private String firstName;
        private int salary;

        Employee(String lastName, String firstName, int salary) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.salary = salary;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "lastName='" + lastName + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Employee) {
                Employee employee = (Employee) o;
                return employee.getSalary() - this.salary;
            }
            return 0;
        }
    }
}
