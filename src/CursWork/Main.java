package CursWork;

public class Main {

    public static void print(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void minimumSalary(Employee[] employee) {
        if (employee.length > 0) {
            Employee minimum = employee[0];
            for (int i = 0; i < employee.length; i++) {
                if (minimum.getSalary() > employee[i].getSalary()) {
                    minimum = employee[i];
                }
            }
            System.out.println("Сотрудник: " + minimum.getName() + " из департамента " + minimum.getDivision() + " имеет минимальную зарплату:  " + minimum.getSalary());
        }
    }

    public static void maximumSalary(Employee[] employee) {
        if (employee.length > 0) {
            Employee maximum = employee[0];
            for (int i = 0; i < employee.length; i++) {
                if (maximum.getSalary() < employee[i].getSalary()) {
                    maximum = employee[i];
                }
            }
            System.out.println("Сотрудник: " + maximum.getName() + " из департамента " + maximum.getDivision() + " имеет максимальную зарплату:  " + maximum.getSalary());
        }
    }

    public static double allSalaryStaff(Employee[] employee) {
            double salaryAllStaff = 0;
            for (int i = 0; i < employee.length; i++) {
                salaryAllStaff += employee[i].getSalary();
        }
            System.out.println("Зарплата всех сотрудников за текущий месяц составила: " + salaryAllStaff);
            return salaryAllStaff;
    }

    public static void averageSalary(Employee[] employee) {
        double averageSalaryStaff = allSalaryStaff(employee) / employee.length;
        System.out.println("Средняя зарплата сотрудников за текущий месяц составила: " + averageSalaryStaff);
    }


    public static void main(String[] args){

            Employee[] employee = new Employee[10];
            employee[0] = new Employee("Иванов Иван Иванович", 100000, 1);
            employee[1] = new Employee("Наместникова Александра Владимировна", 120000, 2);
            employee[2] = new Employee("Осколков Александр Сергеевич", 100000, 3);
            employee[3] = new Employee("Осколков Лев Александрович", 100100, 4);
            employee[4] = new Employee("Осколков Иван Александрович", 103000, 5);
            employee[5] = new Employee("Попова Нина Аркадьевна", 123000, 1);
            employee[6] = new Employee("Донцов Владлен Павлович", 103400, 2);
            employee[7] = new Employee("Донцова Елена Сергеевна", 110000, 3);
            employee[8] = new Employee("Осколков Сергей Александрович", 111000, 4);
            employee[9] = new Employee("Попова Фаина Яковлевна", 100333, 5);

            print(employee);
            minimumSalary(employee);
            maximumSalary(employee);
            allSalaryStaff(employee);
            averageSalary(employee);
        }
    }