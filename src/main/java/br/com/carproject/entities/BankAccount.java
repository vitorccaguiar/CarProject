package br.com.carproject.entities;

import java.util.Date;

public class BankAccount
{

    private String name;
    private String agencyNumber;
    private String accountNumber;
    private Date registrationDate;
    private Date changeDate;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAgencyNumber()
    {
        return agencyNumber;
    }

    public void setAgencyNumber(String agencyNumber)
    {
        this.agencyNumber = agencyNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public Date getRegistrationDate()
    {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate)
    {
        this.registrationDate = registrationDate;
    }

    public Date getChangeDate()
    {
        return changeDate;
    }

    public void setChangeDate(Date changeDate)
    {
        this.changeDate = changeDate;
    }
}
