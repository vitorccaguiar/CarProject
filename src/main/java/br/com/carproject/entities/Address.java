package br.com.carproject.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address
{

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "type")
    private String type;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "complement")
    private String complement;

    @Column(name = "neighbourhood")
    private String neighbourhood;

    @Column(name = "cep")
    private String cep;

    @Column(name = "has_own_house")
    private Boolean hasOwnHouse;

    @Column(name = "value_of_the_house")
    private Double valueOfTheHouse;

    @Column(name = "time_living")
    private Date timeLiving;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "change_date")
    private Date changeDate;

    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToOne
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

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

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

}
