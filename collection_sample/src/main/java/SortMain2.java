import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortMain2 {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(1, "Aoki", 35, "部長"),
                new Employee(2, "Tanaka", 24, "平社員"),
                new Employee(5, "Yanagisawa", 55, "課長"),
                new Employee(3, "Simoyanagi", 24, "契約社員"),
                new Employee(4, "Satake", 40, "平社員")
        };

        System.out.println("# 配列-社員番号でソート(昇順)");
        Arrays.sort(employees, Comparator.comparing(Employee::getEmployeeId));
        print_employees(employees);

        System.out.println("# 配列-社員番号でソート(降順)");
        Arrays.sort(employees, Comparator.comparing(Employee::getEmployeeId).reversed());
        print_employees(employees);

        System.out.println("# 配列-年齢でソート(昇順)");
        Arrays.sort(employees, Comparator.comparing(Employee::getAge));
        print_employees(employees);

        System.out.println("# 配列-年齢でソート(降順)");
        Arrays.sort(employees, Comparator.comparing(Employee::getAge).reversed());
        print_employees(employees);

        System.out.println("# 配列-年齢・社員番号でソート");
        Arrays.sort(employees, Comparator.comparing(Employee::getAge)
                .thenComparing(Employee::getEmployeeId));
        print_employees(employees);

        // Todo: Listソートもやる
        List<Employee> employeeList = Arrays.asList(employees);

        System.out.println("# リスト-社員番号でソート(昇順)");
        employeeList.sort(Comparator.comparing(Employee::getEmployeeId));
        print_employees(employeeList);

        System.out.println("# リスト-社員番号でソート(降順)");
        employeeList.sort(Comparator.comparing(Employee::getEmployeeId).reversed());
        print_employees(employeeList);

        System.out.println("# リスト-年齢でソート(昇順)");
        employeeList.sort(Comparator.comparing(Employee::getAge));
        print_employees(employeeList);

        System.out.println("# リスト-年齢でソート(降順)");
        employeeList.sort(Comparator.comparing(Employee::getAge).reversed());
        print_employees(employeeList);

        System.out.println("# リスト-年齢・社員番号でソート");
        employeeList.sort(Comparator.comparing(Employee::getAge)
                .thenComparing(Employee::getEmployeeId));
        print_employees(employeeList);

    }

    private static void print_employees(Employee[] employees){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    private static void print_employees(List<Employee> employees){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }


    static class Employee{
        private int employeeId;
        private String employeeName;
        private int age;
        private String position; // 区分値にして試したい

        public Employee(int employeeId, String employeeName, int age, String position){
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.age = age;
            this.position = position;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "employeeId=" + employeeId +
                    ", employeeName='" + employeeName + '\'' +
                    ", age=" + age +
                    ", position='" + position + '\'' +
                    '}';
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public int getAge() {
            return age;
        }

        public String getPosition() {
            return position;
        }
    }
}
