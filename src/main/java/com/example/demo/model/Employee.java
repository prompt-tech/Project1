package com.example.demo.model;
import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "bdate")
    private String bdate;

    @Column(name = "address")
    private String address;

    @Column(name = "sex")
    private String sex;

    @Column(name = "salary")
    private String salary;

    @Column(name = "superssn")
    private String superssn;

    @Column(name = "dno")
    private String dno;

    @Column(name = "pnumber")
    private String pnumber;

    @Column(name = "hours")
    private String hours;

    @Column(name = "dnumber")
    private String dnumber;

    @Column(name = "dname")
    private String dname;

    @Column(name = "mgrstartdate")
    private String mgrstartdate;

    @Column(name = "dlocation")
    private String dlocation;

    @Column(name = "pname")
    private String pname;

    @Column(name = "plocation")
    private String plocation;

    public Employee() {
        super();
    }


    public Employee(String ssn, String fname, String lname, String bdate, String address, String sex, String salary, String superssn, String dno, String pnumber, String hours, String dnumber, String dname, String mgrstartdate, String dlocation, String pname, String plocation) {
        super();
        this.ssn=ssn;
        this.fname=fname;
        this.lname=lname;
        this.bdate=bdate;
        this.address=address;
        this.sex=sex;
        this.salary=salary;
        this.superssn=superssn;
        this.dno=dno;
        this.pnumber=pnumber;
        this.hours=hours;
        this.dnumber=dnumber;
        this.dname=dname;
        this.mgrstartdate=mgrstartdate;
        this.dlocation=dlocation;
        this.pname=pname;
        this.plocation=plocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSSN(String SSN) {
        this.ssn = ssn;
    }

    public String getFname() {
        return fname;
    }

    public void setFNAME(String FNAME) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLNAME(String LNAME) {
        this.lname = lname;
    }

    public String getBDATE() {
        return bdate;
    }

    public void setBDATE(String BDATE) {
        this.bdate = bdate;
    }

    public String getADDRESS() {
        return address;
    }

    public void setADDRESS(String ADDRESS) {
        this.address = address;
    }

    public String getSEX() {
        return sex;
    }

    public void setSex(String SEX) {
        this.sex = sex;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSuperssn() {
        return superssn;
    }

    public void setSuperssn(String superssn) {
        this.superssn = superssn;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDnumber() {
        return dnumber;
    }

    public void setDnumber(String dnumber) {
        this.dnumber = dnumber;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getMgrstartdate() {
        return mgrstartdate;
    }

    public void setMgrstartdate(String mgrstartdate) {
        this.mgrstartdate = mgrstartdate;
    }

    public String getDlocation() {
        return dlocation;
    }

    public void setDlocation(String dlocation) {
        this.dlocation = dlocation;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPlocation() {
        return plocation;
    }

    public void setPlocation(String plocation) {
        this.plocation = plocation;
    }
}



