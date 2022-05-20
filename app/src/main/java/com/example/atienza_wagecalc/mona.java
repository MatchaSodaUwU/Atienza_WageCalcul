package com.example.atienza_wagecalc;

public class mona {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String name,
    employeeType = "";
    public double getRegular() {
        return regular;
    }

    public void setRegular(double regular) {
        this.regular = regular;
    }

    public double getProbationary() {
        return probationary;
    }

    public void setProbationary(double probationary) {
        this.probationary = probationary;
    }

    public double getPt() {
        return pt;
    }

    public void setPt(double pt) {
        this.pt = pt;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(double totalWage) {
        this.totalWage = totalWage;
    }

    public double getOtWage() {
        return otWage;
    }

    public void setOtWage(double otWage) {
        this.otWage = otWage;
    }

    private double regular, probationary, pt, overtime, totalWage, otWage;

}
