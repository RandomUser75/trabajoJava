/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee_with_bugs;

import java.util.*;

/**
 *
 * @author oborrego
 */
public class EmployeeListImpl implements EmployeeList {
   private Employee[] employees;
  private int size; // Tamaño actual de la lista
  /**
   * No tiene sentido crear una variable para definir el tamaño del array si despues no la utilizas para eso
   * public EmployeeListImpl(int capacity) {
        employees = new Employee[20];
        size = 0; // Inicialmente la lista está vacía
    }
     * @param employees
   * @param size 
   */
    public EmployeeListImpl(Employee[] employees, int size) {   
        this.employees = new Employee[size];
        
    }

    // Método para agregar un empleado a la lista
    /**
     * Lo ideal es que el metodo devuelva la posicion
     * El metodo esta mal entero
     * public void addEmployee(Employee employee) {
    employees[size] = employee;
    size++; // Incrementar el tamaño
    if(size >= employees.length) {
    System.out.println("No hay suficiente espacio en la lista para agregar más empleados.");
    }
    } 
     * @param employee
     */
    @Override
    public int addEmployee(Employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i]==null) {
                employees[i]=employee;
                return i;
            }
        }return -1;
    }

    // Método para contar el número de empleados en la lista
    /**
     * El metodo esta mal porque no mira si hay alguna posicion nula
     * public int countEmployees() {
        return employees.length; // El tamaño actual de la lista es el número de empleados
    }
     * @return 
     */
    @Override
    public int countEmployees() {
        int count=0;
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i]!=null) {
                count++;
            }
        }return count;
    }

    // Método para encontrar un empleado por su ID
    /**
     * El for no recorre el array de employees
     * No comparar strings con ==
     * No hace falta crear una variable, aunque no es tan grave
     * @param id
     * @return 
     */
    public Employee findEmployeeById(String id) {
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i].getId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    // Método para eliminar un empleado de la lista
    /**
     * La mitad del metodo sobra, ademas que debe devolver la posicion de la que se ha eliminado al empleado
     *     public void removeEmployee(Employee employee) {
        int index = 0;
        // Encontrar el índice del empleado en el array
        for (int i = 0; i < size; i++) {
            if (employees.equals(employee)) {
                index = i;
            }
        }
        if (index != -1) {
            // Desplazar los elementos a la izquierda para llenar el espacio
            for (int i = index; i < size; i++) {
                employees[i] = employees[i + 1];
            }
            employees[size - 1] = null; // Eliminar la referencia al último elemento
            size--; // Decrementar el tamaño
        }
    }
     * @param employee 
     */
    @Override
    public int removeEmployee(Employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i]!=null) {
                if(employees[i].equals(employee)){
                    employees[i]=null;
                    return i;
                }
            }
        }return -1;
    }
    
    
    /**
     * No tiene sentido crear la primera variable
     * El for no recorre el array de employees
     * El if esta mal, se esta comparando esa posicion consigo misma
     * public Employee findEmployeeWithHighestSalary() {
        Employee employeeWithHighestSalary = employees[0]; // Empezamos con el primer empleado
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > employees[i].getSalary()) {
                employeeWithHighestSalary = employees[i];
                break;
            }
        }
        return employeeWithHighestSalary;
    }
     * @return 
     */
    @Override
     public Employee findEmployeeWithHighestSalary() {
         double maxSalary=Double.MIN_VALUE;
         int pos=-1;
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary=employees[i].getSalary();
                pos=i;
            }
        }
        return this.employees[pos];
    }
     /**
      * Deben ser dos parametros de entrada int
      * El for no recorre el array de employees
      * El objeto debe ser tipo manager, no managerimpl
      *         public int countManagersBySalaryRange(String salaryRange) {
        int managerCount = 0; // Inicializamos el contador de managers

        // Iteramos sobre la lista de empleados y contamos los managers
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof ManagerImpl || salaryRange == employees[i].getSalaryRange()) {
                managerCount++;
            }
        }
        return managerCount;
        }
        
      * @param salaryRange
      * @return 
      */
    @Override
        public int countManagersBySalaryRange(int min, int max) {
        int managerCount = 0; // Inicializamos el contador de managers

        // Iteramos sobre la lista de empleados y contamos los managers
        for (int i = 0; i < this.employees.length; i++) {
            if (employees[i] instanceof Manager ) {
                if (employees[i].getSalary()>min&&employees[i].getSalary()<max) {
                    managerCount++;
                }
            }
        }
        return managerCount;
    }
}
