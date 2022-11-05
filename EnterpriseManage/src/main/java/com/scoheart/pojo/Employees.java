package com.scoheart.pojo;

public class Employees {
    private String employeeId;
    private String employeeName;
    private String employeeSex;
    private Integer employeeAge;
    private String employeeTel;
    private String employeeEmail;
    private String employeeAddr;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeTel() {
        return employeeTel;
    }

    public void setEmployeeTel(String employeeTel) {
        this.employeeTel = employeeTel;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddr() {
        return employeeAddr;
    }

    public void setEmployeeAddr(String employeeAddr) {
        this.employeeAddr = employeeAddr;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSex='" + employeeSex + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeTel='" + employeeTel + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeAddr='" + employeeAddr + '\'' +
                '}';
    }
}
