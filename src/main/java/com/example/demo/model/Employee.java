package com.example.demo.model;
import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "SSN")
    private long SSN;

    @Column(name = "FNAME")
    private String FNAME;

    @Column(name = "LNAME")
    private String LNAME;

    @Column(name = "BDATE")
    private String BDATE;

    @Column(name = "ADDRESS")
    private String ADDRESS;

    @Column(name = "SEX")
    private String SEX;

    @Column(name = "SALARY")
    private long SALARY;

    @Column(name = "SUPERSSN")
    private long SUPERSSN;

    @Column(name = "DNO")
    private long DNO;

    @Column(name = "PNUMBER")
    private long PNUMBER;

    @Column(name = "HOURS")
    private long HOURS;

    @Column(name = "DNUMBER")
    private long DNUMBER;

    @Column(name = "DNAME")
    private String DNAME;

    @Column(name = "MGRSTARTDATE")
    private String MGRSTARTDATE;

    @Column(name = "DLOCATION")
    private String DLOCATION;

    @Column(name = "PNAME")
    private String PNAME;

    @Column(name = "PLOCATION")
    private String PLOCATION;

    public Employee() {
        super();
    }


    public Employee(long SSN, String FNAME, String LNAME, String BDATE, String ADDRESS, String SEX, long SALARY, long SUPERSSN, long DNO, long PNUMBER, long HOURS, long DNUMBER, String DNAME, String MGRSTARTDATE, String DLOCATION, String PNAME, String PLOCATION) {
        super();
        this.SSN = SSN;
        this.FNAME = FNAME;
        this.LNAME = LNAME;
        this.BDATE = BDATE;
        this.ADDRESS = ADDRESS;
        this.SEX = SEX;
        this.SALARY = SALARY;
        this.SUPERSSN = SUPERSSN;
        this.DNO = DNO;
        this.PNUMBER = PNUMBER;
        this.HOURS = HOURS;
        this.DNUMBER = DNUMBER;
        this.DNAME = DNAME;
        this.MGRSTARTDATE = MGRSTARTDATE;
        this.DLOCATION = DLOCATION;
        this.PNAME = PNAME;
        this.PLOCATION = PLOCATION;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getFNAME() {
        return FNAME;
    }

    public void setFNAME(String FNAME) {
        this.FNAME = FNAME;
    }

    public String getLNAME() {
        return LNAME;
    }

    public void setLNAME(String LNAME) {
        this.LNAME = LNAME;
    }

    public String getBDATE() {
        return BDATE;
    }

    public void setBDATE(String BDATE) {
        this.BDATE = BDATE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public long getSALARY() {
        return SALARY;
    }

    public void setSALARY(long SALARY) {
        this.SALARY = SALARY;
    }

    public long getSUPERSSN() {
        return SUPERSSN;
    }

    public void setSUPERSSN(long SUPERSSN) {
        this.SUPERSSN = SUPERSSN;
    }

    public long getDNO() {
        return DNO;
    }

    public void setDNO(long DNO) {
        this.DNO = DNO;
    }

    public long getPNUMBER() {
        return PNUMBER;
    }

    public void setPNUMBER(long PNUMBER) {
        this.PNUMBER = PNUMBER;
    }

    public long getHOURS() {
        return HOURS;
    }

    public void setHOURS(long HOURS) {
        this.HOURS = HOURS;
    }

    public long getDNUMBER() {
        return DNUMBER;
    }

    public void setDNUMBER(long DNUMBER) {
        this.DNUMBER = DNUMBER;
    }

    public String getDNAME() {
        return DNAME;
    }

    public void setDNAME(String DNAME) {
        this.DNAME = DNAME;
    }

    public String getMGRSTARTDATE() {
        return MGRSTARTDATE;
    }

    public void setMGRSTARTDATE(String MGRSTARTDATE) {
        this.MGRSTARTDATE = MGRSTARTDATE;
    }

    public String getDLOCATION() {
        return DLOCATION;
    }

    public void setDLOCATION(String DLOCATION) {
        this.DLOCATION = DLOCATION;
    }

    public String getPNAME() {
        return PNAME;
    }

    public void setPNAME(String PNAME) {
        this.PNAME = PNAME;
    }

    public String getPLOCATION() {
        return PLOCATION;
    }

    public void setPLOCATION(String PLOCATION) {
        this.PLOCATION = PLOCATION;
    }
}



