import domain.Employee;
import service.AppCompany;

import java.util.ArrayList;
import java.util.List;

public class App {

        public static void main(String[] args) {
            Employee juan = new Employee("Juan", 123456, 31);
            Employee ximena = new Employee("Ximena", 478596, 28);
            Employee kenny = new Employee("Kenny", 78956, 25);
            Employee ana = new Employee("Ana Milena", 789654, 38);
            Employee lucia = new Employee("LucÃ­a", 519684, 24);
            Employee aylen = new Employee("Aylen", 78912, 24);

            //creo el arraylist//
            List<Employee> employees = new ArrayList<>();
            employees.add(juan);
            employees.add(ximena);
            employees.add(kenny);
            employees.add(ana);
            employees.add(lucia);
            employees.add(aylen);

            //el metodo reportEmployeeData es static asi q puedo usarlo sin instanciar un objeto, al ser metodo de la clase//
            AppCompany.reportEmployeeData(employees); //no necesito instancia//
            AppCompany appCompany = new AppCompany();//necesito instanciar//
            List<Employee> employeeLessThanThirty = appCompany.getFromEmployeesLessThanThirty(employees);
            System.out.println("Empleados menores de 30: ");
            AppCompany.reportEmployeeData(employeeLessThanThirty); //el metodo imprime, y como es de la clase no debo instanciar//
            System.out.println("El nÃºmero de empleados en la empresa es: " + appCompany.countEmployees(employees) );
        }
    }



