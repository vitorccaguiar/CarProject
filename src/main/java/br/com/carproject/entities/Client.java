package br.com.carproject.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client
{

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "register")
    private String register;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "rg")
    private String rg;

    @Column(name = "issuing_body")
    private String issuingBody;

    @Column(name = "gender")
    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "time_working")
    private Date timeWorking;

    @Column(name = "number_of_benefit")
    private String numberOfBenefit;

    @Column(name = "monthly_income")
    private Double monthlyIncome;

    @Column(name = "position")
    private String position;

    @Column(name = "email")
    private String email;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "change_date")
    private Date changeDate;

    @OneToOne
    @JoinColumn(name = "city_id")
    private City cityOfBirth;

    @OneToOne
    @JoinColumn(name = "state_id")
    private State stateOfBirth;

    @ManyToMany
    @JoinTable(name = "reference", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "reference_id"))
    private List<Reference> references;

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

    public Date getTimeWorking()
    {
        return timeWorking;
    }

    public void setTimeWorking(Date timeWorking)
    {
        this.timeWorking = timeWorking;
    }

    public String getNumberOfBenefit()
    {
        return numberOfBenefit;
    }

    public void setNumberOfBenefit(String numberOfBenefit)
    {
        this.numberOfBenefit = numberOfBenefit;
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

    public City getCityOfBirth()
    {
        return cityOfBirth;
    }

    public void setCityOfBirth(City cityOfBirth)
    {
        this.cityOfBirth = cityOfBirth;
    }

    public State getStateOfBirth()
    {
        return stateOfBirth;
    }

    public void setStateOfBirth(State stateOfBirth)
    {
        this.stateOfBirth = stateOfBirth;
    }

    public List<Reference> getReferences()
    {
        return references;
    }

    public void setReferences(List<Reference> references)
    {
        this.references = references;
    }
}
