package br.com.carproject.entities;

import java.util.Date;

public class Loan
{

    private Double downPayment;
    private Double financedAmount;
    private Double installmentValue;
    private int numberOfInstallments;
    private String lendingInstitution;
    private Date registrationDate;
    private Date changeDate;

    public Double getDownPayment()
    {
        return downPayment;
    }

    public void setDownPayment(Double downPayment)
    {
        this.downPayment = downPayment;
    }

    public Double getFinancedAmount()
    {
        return financedAmount;
    }

    public void setFinancedAmount(Double financedAmount)
    {
        this.financedAmount = financedAmount;
    }

    public Double getInstallmentValue()
    {
        return installmentValue;
    }

    public void setInstallmentValue(Double installmentValue)
    {
        this.installmentValue = installmentValue;
    }

    public int getNumberOfInstallments()
    {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments)
    {
        this.numberOfInstallments = numberOfInstallments;
    }

    public String getLendingInstitution()
    {
        return lendingInstitution;
    }

    public void setLendingInstitution(String lendingInstitution)
    {
        this.lendingInstitution = lendingInstitution;
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
