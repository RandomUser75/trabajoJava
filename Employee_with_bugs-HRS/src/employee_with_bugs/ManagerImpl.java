/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee_with_bugs;

/**
 *
 * @author oborrego
 */
public class ManagerImpl extends EmployeeImpl implements Manager {

    private String department;
    /**
     * En el constructor debe inicializarse la varibale department a nada
     * public ManagerImpl(String name, String id, double salary, ProfessionalGroup group) {
        super(name, id, salary, group);
        this.department = department;
    }
     * @param name
     * @param id
     * @param salary
     * @param group 
     */
    public ManagerImpl(String name, String id, double salary, ProfessionalGroup group) {
        super(name, id, salary, group);
        this.department = "";
    }

    @Override
    public String getDepartment() {
        return department;
    }
    /**
     * Faltaba el metodo set
     * @param department 
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    /**
     * Es mucho mejor hacer un switch
     * Poner ==true o false esta mal
     *  public String getsalaryRange() {
        if (this.group == this.group.GROUP_1 && this.group == this.group.GROUP_2 && this.isWorking == true) {
            return "SUPER_HIGH";
        } else  if (this.group == this.group.GROUP_1 && this.group == this.group.GROUP_2 && this.isWorking == false) {
            return "HIGH";
        }
        if (this.group == this.group.GROUP_3 && this.group == this.group.GROUP_3 && this.isWorking == true) {
            return "HIGH";
        } else if (this.group == this.group.GROUP_3 && this.group == this.group.GROUP_3 && this.isWorking == false) {
            return "LOW";
        }
        if (this.group == this.group.GROUP_11 && this.group == this.group.GROUP_10 && this.isWorking == true) {
            return "LOW";
        } else {
            return "NORMAL";
        }
    }
     * @return 
     */
    @Override
    public String getsalaryRange() {
        switch(this.group){
            case GROUP_1, GROUP_2:
                if (isWorking) {
                    return "SUPER_HIGH";
                }else{
                    return "HIGH";
                }
            case GROUP_3:
                if (isWorking) {
                    return "HIGH";
                }else{
                    return "LOW";
                }
            case GROUP_10, GROUP_11:
                if (isWorking) {
                    return "LOW";
                }
            default:
                return "NORMAL";
        }
    }


}
