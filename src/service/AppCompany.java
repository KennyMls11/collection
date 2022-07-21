package service;

import domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class AppCompany {
    //las funcionalidades son para todo tipo de listas,//
    //para no limitar el metodo, desacoplandolo de implmentaciones especificas//


    public static void reportEmployeeData(List<Employee> employees) {
        //invocar el to string de la coleccion//
        System.out.println(employees);
    }


    public List<Employee> getFromEmployeesLessThanThirty(List<Employee> employees) {
        List<Employee> employeesLessThanThirty = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).isLessThanThirty()) {
                employeesLessThanThirty.add(employees.get(i));
            }
        }

        return employeesLessThanThirty;
    }

    public int countEmployees(List<Employee> employees) {
        return employees.size();
    }
}

