package org.example;

public class Comp {
    private String compName;
    private String empname;
    private int empID;

    public String getCompName() {
        return compName;
    }

    public void setCompName(String cName) {
        this.compName = cName;
    }

    public String getempename() {
        return empname;
    }

    public void setempname(String ename) {
        this.empname = ename;
    }

    public int getempID() {
        return empID;
    }

    public void setempID(int eID) {
        this.empID = eID;
    }

    @Override
    public String toString() {
        return "[Company Name " + compName + ", Employee Name = " + empname + ", Employee ID  = " + empID + "]";
    }
}