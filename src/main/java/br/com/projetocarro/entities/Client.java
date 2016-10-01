package br.com.projetocarro.entities;

import java.util.Date;

public class Client
{

    private String name;
    private String cpf;
    private String rg;
    private String issuingBody;
    private Date dateOfBirth;
    private String maritalStatus;
    private String gender;
    private String fatherName;
    private String motherName;
    private String companyName;
    private Integer timeWorking;
    private Double monthlyIncome;
    private String position;
    private Address address;
    private Contacts contacts;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
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

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus()
    {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus)
    {
        this.maritalStatus = maritalStatus;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getFathersName()
    {
        return fatherName;
    }

    public void setFathersName(String fathersName)
    {
        this.fatherName = fathersName;
    }

    public String getMotherName()
    {
        return motherName;
    }

    public void setMotherName(String motherName)
    {
        this.motherName = motherName;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public Contacts getContacts()
    {
        return contacts;
    }

    public void setContacts(Contacts contacts)
    {
        this.contacts = contacts;
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
}
