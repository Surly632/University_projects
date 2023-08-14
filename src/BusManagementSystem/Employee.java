/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusManagementSystem;

/**
 *
 * @author Abmhi
 */
class Employee {
    private int EmployeeId;
    private String EmployeeFirstName,EmployeelastName,EmployeeUserName,EmployeePassword,EmployeePhone;

    public Employee() {
    }

    
    
    Employee(int EmployeeId, String EmployeeFirstName, String EmployeelastName, String EmployeeUserName, String EmployeePassword, String EmployeePhone) {
        
        this.EmployeeId=EmployeeId;
        this.EmployeeFirstName=EmployeeFirstName;
        this.EmployeelastName=EmployeelastName;
        this.EmployeeUserName=EmployeeUserName;
        this.EmployeePassword=EmployeePassword;
        this.EmployeePhone=EmployeePhone;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public void setEmployeeFirstName(String EmployeeFirstName) {
        this.EmployeeFirstName = EmployeeFirstName;
    }

    public void setEmployeelastName(String EmployeelastName) {
        this.EmployeelastName = EmployeelastName;
    }

    public void setEmployeeUserName(String EmployeeUserName) {
        this.EmployeeUserName = EmployeeUserName;
    }

    public void setEmployeePassword(String EmployeePassword) {
        this.EmployeePassword = EmployeePassword;
    }

    public void setEmployeePhone(String EmployeePhone) {
        this.EmployeePhone = EmployeePhone;
    }
    
    
    
    public int getEmployeeId(){
       return EmployeeId;
       
    }
    public String getEmployeeFirstName(){
        return EmployeeFirstName;
    }
     public String getEmployeelastName(){
        return EmployeelastName;
    }
      public String getEmployeeUserName(){
        return EmployeeUserName;
    }
       public String getEmployeePassword(){
        return EmployeePassword;
    }
        public String getEmployeePhone(){
        return EmployeePhone;
    }  
}
