/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee_with_bugs;

/**
 *
 * @author oborrego
 */

public class TestEmployees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeImpl emp1 = new EmployeeImpl("Juan", "12345678-A", 30000, ProfessionalGroup.GROUP_1);
        EmployeeImpl emp2 = new EmployeeImpl("María", "87654321-B", 35000, ProfessionalGroup.GROUP_4);
        EmployeeImpl emp3 = new EmployeeImpl("Carlos", "98765432-C", 32000, ProfessionalGroup.GROUP_8);
        EmployeeImpl emp4 = new EmployeeImpl("Ana", "23456789-D", 28000, ProfessionalGroup.GROUP_5);
        EmployeeImpl emp5 = new EmployeeImpl("Pedro", "54321678-E", 40000, ProfessionalGroup.GROUP_10);
        ManagerImpl manager1 = new ManagerImpl("Laura", "12345678-A", 60000, ProfessionalGroup.GROUP_6);
        ManagerImpl manager2 = new ManagerImpl("Carlos", "87654321-B", 70000, ProfessionalGroup.GROUP_2);
        Employee[]employees={emp1,emp2,emp3,emp4,emp5};
        EmployeeListImpl empList = new EmployeeListImpl(employees, 20);
      
        
        System.out.println("Número de empleados: " + empList.countEmployees());
        /*
        Employee foundEmployee = empList.findEmployeeById("98765432C");
        if (foundEmployee != null) {
            System.out.println("Empleado encontrado: " + foundEmployee.toString());
        } else {
            System.out.println("Empleado no encontrado.");
        }
        
        empList.removeEmployee(emp1);
        System.out.println("Número de empleados después de la eliminación: " + empList.countEmployees());
        */
}
    
}
