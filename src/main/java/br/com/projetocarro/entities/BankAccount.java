package br.com.projetocarro.entities;

import java.util.Date;

public class BankAccount
{

    private String bankName;
    private String agencyNumber;
    private String accountNumber;
    private Date startDate;

    public String getBankName()
    {
        return bankName;
    }

    public void setBankName(String bankName)
    {
        this.bankName = bankName;
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

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }
}
