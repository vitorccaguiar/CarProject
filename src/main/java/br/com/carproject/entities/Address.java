package br.com.carproject.entities;

import java.util.Date;

public class Address
{

    private String type;
    private String streetName;
    private String complement;
    private String neighbourhood;
    private String city;
    private String state;
    private String cep;
    private Boolean hasOwnHouse;
    private Double valueOfTheHouse;
    private Date timeLiving;
    private Date registrationDate;
    private Date changeDate;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getComplement()
    {
        return complement;
    }

    public void setComplement(String complement)
    {
        this.complement = complement;
    }

    public String getNeighbourhood()
    {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood)
    {
        this.neighbourhood = neighbourhood;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCep()
    {
        return cep;
    }

    public void setCep(String cep)
    {
        this.cep = cep;
    }

    public Boolean getHasOwnHouse()
    {
        return hasOwnHouse;
    }

    public void setHasOwnHouse(Boolean hasOwnHouse)
    {
        this.hasOwnHouse = hasOwnHouse;
    }

    public Double getValueOfTheHouse()
    {
        return valueOfTheHouse;
    }

    public void setValueOfTheHouse(Double valueOfTheHouse)
    {
        this.valueOfTheHouse = valueOfTheHouse;
    }

    public Date getTimeLiving()
    {
        return timeLiving;
    }

    public void setTimeLiving(Date timeLiving)
    {
        this.timeLiving = timeLiving;
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
