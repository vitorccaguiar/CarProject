package br.com.projetocarro.entities;

import java.util.Date;
import java.util.List;

public class Client
{

    private String type;
    private String name;
    private String register;
    private Date dateOfBirth;
    private String rg;
    private String issuingBody;
    private String gender;
    private String maritalStatus;
    private String countryOfBirth;
    private String stateOfBirth;
    private List<Address> address;
    private String fatherName;
    private String motherName;
    private String companyName;
    private Integer timeWorking;
    private Contacts contacts;
    private Double monthlyIncome;
    private String position;
    // Falta referencia pessoal
    private BankAccount bankAccount;
    private Vehicle vehicle;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRegister()
    {
        return register;
    }

    public void setRegister(String register)
    {
        this.register = register;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRg()
    {
        return rg;
    }

    public void setRg(String rg)
    {
        this.rg = rg;
    }

    public String getIssuingBody()
    {
        return issuingBody;
    }

    public void setIssuingBody(String issuingBody)
    {
        this.issuingBody = issuingBody;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getMaritalStatus()
    {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus)
    {
        this.maritalStatus = maritalStatus;
    }

    public String getCountryOfBirth()
    {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth)
    {
        this.countryOfBirth = countryOfBirth;
    }

    public String getStateOfBirth()
    {
        return stateOfBirth;
    }

    public void setStateOfBirth(String stateOfBirth)
    {
        this.stateOfBirth = stateOfBirth;
    }

    public List<Address> getAddress()
    {
        return address;
    }

    public void setAddress(List<Address> address)
    {
        this.address = address;
    }

    public String getFatherName()
    {
        return fatherName;
    }

    public void setFatherName(String fatherName)
    {
        this.fatherName = fatherName;
    }

    public String getMotherName()
    {
        return motherName;
    }

    public void setMotherName(String motherName)
    {
        this.motherName = motherName;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public Integer getTimeWorking()
    {
        return timeWorking;
    }

    public void setTimeWorking(Integer timeWorking)
    {
        this.timeWorking = timeWorking;
    }

    public Contacts getContacts()
    {
        return contacts;
    }

    public void setContacts(Contacts contacts)
    {
        this.contacts = contacts;
    }

    public Double getMonthlyIncome()
    {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome)
    {
        this.monthlyIncome = monthlyIncome;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public BankAccount getBankAccount()
    {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
}
