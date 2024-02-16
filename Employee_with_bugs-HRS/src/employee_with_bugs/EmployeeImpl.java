/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee_with_bugs;

/**
 *
 * @author oborrego
 */
public class EmployeeImpl implements Employee {
    
    /**
     * En herencia los atributos solo pueden ser usados por las clases hijas
     */
    public String name;
    public String id; //must be dddddddd-X
    public double salary;
    public ProfessionalGroup group;
    public boolean isWorking;

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeImpl(String name, String id, double salary, ProfessionalGroup group) {
        this.name = name;
        try {
            checkId();
        } catch (Exception e) {
            System.out.println("The id format is not valid");
        }
        this.id = id;
        this.group = null;
        this.salary = salary;
        this.isWorking = isWorking;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setGroup(ProfessionalGroup group) {
        this.group = group;
    }

    @Override
    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }


    @Override
    public String getId() {
        return id;
    }
    
    /**
     * Faltaban los siguientes 2 get
     * @return 
     */

    public ProfessionalGroup getGroup() {
        return group;
    }

    public boolean isIsWorking() {
        return isWorking;
    }
    
   
    /**
     * El objeto o debe ser tipo employee, no employeeimpl
     * No tiene sentido poner super.equals, ya que esta es la clase padre
     * No comparar dos string son ==
     * public boolean equals(Object o) {
        boolean b = false;
        if (o instanceof Employee) {
            Employee employee = (Employee) o;
            b = super.equals(employee)
                    && this.id == employee.id ;
        }
        return b;
     * @param o
     * @return 
     */
    @Override
     public boolean equals(Object o) {
        boolean b = false;
        if (o instanceof Employee) {
            Employee employee = (Employee) o;
            b = this.getId().equals(employee.getId());
        }
        return b;
    }
    @Override
    public int checkId() throws IllegalArgumentException {
        String idPattern = "\\d{8}-[A-Z]";
        if (!this.id.matches(idPattern)) {
            throw new IllegalArgumentException("El formato del ID no es válido");
        }
        return 0;
    }
    /**
     * Es mucho mejor hacer un switch, ademas que en el segundo if se esta comparando lo mismo
     *     public String getSalaryRange() {
        if (this.group ==this.group.GROUP_1 || this.group == this.group.GROUP_2) {
            return "SUPER_HIGH";
        }
        if (this.group == this.group.GROUP_3 || this.group == this.group.GROUP_3) {
            return "HIGH";
        }
        if (this.group == this.group.GROUP_11 || this.group == this.group.GROUP_10) {
            return "LOW";
        } else {
            return "NORMAL";
        }
    }
     * @return 
     */
    @Override
    public String getSalaryRange() {
        switch(this.group){
            case GROUP_1, GROUP_2:
             return "SUPER_HIGH";
             
            case GROUP_3:
                return "HIGH";
            case GROUP_10, GROUP_11:
                return "LOW";
            default:
                return "NORMAL";
        }

}
    
}