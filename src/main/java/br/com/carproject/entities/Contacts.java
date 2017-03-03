package br.com.carproject.entities;

import java.util.Date;

public class Contacts
{

    private String homeDDD;
    private String cellDDD;
    private String businessDDD;
    private String homePhone;
    private String cellPhone;
    private String businessPhone;
    private String email;
    private Date registrationDate;
    private Date changeDate;

    public String getHomeDDD()
    {
        return homeDDD;
    }

    public void setHomeDDD(String homeDDD)
    {
        this.homeDDD = homeDDD;
    }

    public String getCellDDD()
    {
        return cellDDD;
    }

    public void setCellDDD(String cellDDD)
    {
        this.cellDDD = cellDDD;
    }

    public String getBusinessDDD()
    {
        return businessDDD;
    }

    public void setBusinessDDD(String businessDDD)
    {
        this.businessDDD = businessDDD;
    }

    public String getHomePhone()
    {
        return homePhone;
    }

    public void setHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
    }

    public String getCellPhone()
    {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone)
    {
        this.cellPhone = cellPhone;
    }

    public String getBusinessPhone()
    {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone)
    {
        this.businessPhone = businessPhone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
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
